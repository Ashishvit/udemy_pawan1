
import { test, expect } from '@playwright/test';

test('Open Locator Demo App', async ({ page }) => {

  await page.goto('https://sdetqa.vercel.app/pw-locators-demo-app');

  await expect(page).toHaveTitle(/Playwright/);

});


//const button = page.getBRole('button', {name: 'login'})
     