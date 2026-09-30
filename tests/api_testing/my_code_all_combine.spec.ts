import { test, expect } from '@playwright/test';

const BASE_URL = 'https://restful-booker.herokuapp.com';

test('Complete API - Path + Query + Headers + Body + Cookie + Token', async ({ request }) => {

    // =========================================================
    // 1. AUTHENTICATION → Generate Token
    // =========================================================

    const loginResponse = await request.post(`${BASE_URL}/auth`, {
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        },

        data: {
            username: 'admin',
            password: 'password123'
        }
    });

    expect(loginResponse.status()).toBe(200);

    const loginData = await loginResponse.json();
    const token = loginData.token;

    console.log('Token:', token);


    // =========================================================
    // 2. CREATE BOOKING → REQUEST BODY / JSON + HEADERS
    // =========================================================

    const createResponse = await request.post(`${BASE_URL}/booking`, {

        // Headers
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        },

        // Request Body / JSON
        data: {
            firstname: 'Ashish',
            lastname: 'Kumar',
            totalprice: 500,
            depositpaid: true,

            bookingdates: {
                checkin: '2026-10-01',
                checkout: '2026-10-05'
            },

            additionalneeds: 'Breakfast'
        }
    });

    expect(createResponse.status()).toBe(200);

    const bookingData = await createResponse.json();

    const bookingId = bookingData.bookingid;

    console.log('Booking ID:', bookingId);


    // =========================================================
    // 3. PATH PARAMETER
    // =========================================================
    // /booking/{bookingId}

    const getResponse = await request.get(
        `${BASE_URL}/booking/${bookingId}`,

        {
            headers: {
                'Accept': 'application/json'
            }
        }
    );

    expect(getResponse.status()).toBe(200);

    console.log('Booking:', await getResponse.json());


    // =========================================================
    // 4. QUERY PARAMETER
    // =========================================================
    // /booking?firstname=Ashish&lastname=Kumar

    const queryResponse = await request.get(`${BASE_URL}/booking`, {

        params: {
            firstname: 'Ashish',
            lastname: 'Kumar'
        },

        headers: {
            'Accept': 'application/json'
        }
    });

    expect(queryResponse.status()).toBe(200);

    console.log('Query Result:', await queryResponse.json());


    // =========================================================
    // 5. COOKIE
    // =========================================================
    // Restful Booker uses the token as a cookie for update/delete.

    const updateResponse = await request.put(
        `${BASE_URL}/booking/${bookingId}`,

        {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json',

                // Cookie
                'Cookie': `token=${token}`
            },

            data: {
                firstname: 'Ashish',
                lastname: 'Updated',
                totalprice: 700,
                depositpaid: true,

                bookingdates: {
                    checkin: '2026-10-01',
                    checkout: '2026-10-10'
                },

                additionalneeds: 'Breakfast'
            }
        }
    );

    expect(updateResponse.status()).toBe(200);

    console.log('Updated Booking:', await updateResponse.json());


    // =========================================================
    // 6. AUTHENTICATION + TOKEN + COOKIE
    // =========================================================
    // Token was generated during /auth.
    // It is sent as a cookie for protected APIs.

    console.log('Authentication Token:', token);

    
    // =========================================================
    // 7. DELETE → PATH PARAMETER + COOKIE
    // =========================================================

    const deleteResponse = await request.delete(
        `${BASE_URL}/booking/${bookingId}`,

        {
            headers: {
                'Cookie': `token=${token}`
            }
        }
    );

    expect(deleteResponse.status()).toBe(201);

    console.log('Booking deleted successfully');
});