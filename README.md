# RestAssured Automation Framework

## Table of Contents

1. [Documentation Objective](#documentation-objective)
2. [Prerequisites](#prerequisites)
3. [Setup](#setup)
4. [Run tests](#run-tests)
5. [Open Allure report](#allure-report)

## Documentation Objective
This documentation aims to describe the project prerequisites, how to set up it, and how to run your API tests.

## Prerequisites
- Java 11 or higher
- Maven

# Setup
In order to setup the project, run the following commands in your git bash terminal

```bash
mvn clean install
```

## Run tests
Below you can find the common commands to run your tests

### Run all tests
```bash
nvm clean test
```

### Run tests from a specific Java class
```bash
mvn clean test -Dtest=ClassName
```

Example:
```bash
mvn clean test -Dtest=RestAssuredChallengeTest
```

### Run specific tests from a Java class
```bash
mvn clean test -Dtest=ClassName#testMethodName
```

Example:
```bash
mvn clean test -Dtest=RestAssuredChallengeTest#getPosts
```

# Allure report
In order to open the Allure report, run the following command

```bash 
mvn allure:serve
```