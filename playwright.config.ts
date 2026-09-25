import { defineConfig, devices } from '@playwright/test';

export default defineConfig({
  // Test files location
  testDir: './tests',

  // Maximum time for one test
  timeout: 30 * 1000,

  // Run tests in parallel
  fullyParallel: true,

  // Fail CI if test.only is accidentally used
  forbidOnly: !!process.env.CI,

  // Retry only on CI
  retries: process.env.CI ? 2 : 0,

  // Workers
  workers: process.env.CI ? 1 : undefined,

  // HTML Report
  reporter: [['html', { open: 'never' }]],

  // Shared settings
  use: {
    // Base URL
    // baseURL: 'http://localhost:3000',

    // Trace for EVERY test
    trace: 'on',

    // Screenshot for EVERY test
    screenshot: 'on',

    // Video for EVERY test
    video: 'on',
  },

  // Browser projects
  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },

    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },

    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },
  ],
});