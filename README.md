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

## Curriculum Map

This repository is organized as a hands-on Selenium learning journey. Each day folder builds on the previous one and introduces a new automation concept.

### Day-wise Learning Flow

- Day 21: Browser launch and first test case
- Day 22: Locators and element identification
- Day 23: CSS selectors and UI styling-based locators
- Day 24: XPath locators
- Day 25: XPath axes and advanced navigation
- Day 26: Browser and conditional methods
- Day 27: Implicit, explicit, fluent, and sleep waits
- Day 28+: Advanced Selenium topics and practice exercises
- Day 42+: TestNG concepts, annotations, assertions, and grouping
- Day 45+: Data-driven testing and parameterization
- Day 46+: End-to-end test automation examples

### Workflow Diagram

```text
Start
  ↓
Set up Java + Maven + Selenium
  ↓
Learn browser automation basics
  ↓
Practice locators (ID, CSS, XPath)
  ↓
Use waits and browser methods
  ↓
Apply TestNG annotations and assertions
  ↓
Run parameterized and grouped tests
  ↓
Generate reports and analyze results
```

## How to Use This Repo

1. Open the project in Eclipse or any Java IDE.
2. Make sure Java, Maven, and a browser driver are installed.
3. Browse the examples under `src/test/java` based on the topic you want to learn.
4. Run a specific test class from the IDE or execute:

```bash
mvn test
```

5. Review generated reports in `reports/` and `test-output/` to inspect execution results.

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
