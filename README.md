# Selenium WebDriver Automation Project

This repository contains a Selenium WebDriver automation framework using Java and Maven. It includes sample test cases structured under `src/test/java`, with browser automation examples, locators, wait patterns, and TestNG reporting.

## Project Structure

The repository follows a Maven layout with test suites organized by day/session folders:

```
seleniumwebdriver/
├── pom.xml
├── reports/
│   └── myReport.html
├── screenshot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── day21/
│       │   ├── day22/
│       │   ├── day23/
│       │   ├── day24/
│       │   ├── day25/
│       │   ├── day26/
│       │   ├── day27/
│       │   ├── day28/
│       │   ├── day29/
│       │   ├── day30/
│       │   ├── day31/
│       │   ├── day36/
│       │   ├── day38/
│       │   ├── day39/
│       │   ├── day40/
│       │   ├── day41/
│       │   ├── day42/
│       │   ├── day43/
│       │   ├── day44/
│       │   ├── day45/
│       │   └── day46/
│       └── resources/
├── test-output/
│   ├── Default suite/
│   ├── groupingsuite/
│   ├── junitreports/
│   ├── mysuite/
│   └── Suite/
└── testdata/
    └── config.properties
```

- `pom.xml` - Maven project descriptor and dependency management
- `src/test/java` - Selenium test cases organized by day/session folders
- `reports/` - Generated HTML reports
- `screenshot/` - Screenshots captured during test execution
- `test-output/` - TestNG report output files
- `testdata/config.properties` - Configuration properties for test runs

## Key Dependencies

- Selenium Java `4.40.0`
- TestNG `7.12.0`
- Apache POI `5.5.1`
- Log4j Core `2.25.3`
- ExtentReports `5.1.2`

## Getting Started

### Prerequisites

- Java JDK installed
- Maven installed
- ChromeDriver or other browser driver available on the system path

### Build and Run

From the project root:

```bash
mvn test
```

This will compile the project and execute the TestNG tests.

## Example Test Case

The repository includes sample test classes such as `src/test/java/day21/FirstTestCase.java`, which launches a browser and validates the page title for a demo site.

## Notes

- Ensure the appropriate browser driver binary is available and configured correctly.
- Update `config.properties` or test cases as needed for the target application.
- Generated reports are available in `test-output/` and `reports/` after test execution.

## Contact

For more information, review the test classes under `src/test/java` and customize the framework for your Selenium automation needs.
