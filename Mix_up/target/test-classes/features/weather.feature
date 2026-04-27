Feature: OpenWeather Testing

Scenario: UI Testing - Click Maps Page
Given user opens weather website
When user clicks "Maps" link
Then user should navigate successfully

Scenario: UI Testing - Click Support Page
Given user opens weather website
When user clicks "Support" link
Then user should navigate successfully

Scenario: API Testing - Validate Weather API
Then validate weather API
