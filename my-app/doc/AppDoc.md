# App Documentation

This document describes the process of running the `App` program and its associated unit tests.

## Running the App

The `App` program prompts the user for an email and password, validates them, and prints a success message if they are valid.

To run the `App` program:

1. Open the terminal in Visual Studio Code.
2. Navigate to the directory containing the `App.java` file.
3. Compile the `App.java` file by running `javac App.java`.
4. Run the program by running `java App`.

The program will prompt you to enter an email and password. Enter them as prompted.

## Running the Tests

The `AppTest` class contains a unit test for the `App` program. The test simulates user input and checks that the program prints the correct output.

To run the tests:

1. Open the terminal in Visual Studio Code.
2. Navigate to the directory containing the `AppTest.java` file.
3. Compile the `AppTest.java` file by running `javac -cp .:junit-4.13.jar:hamcrest-core-1.3.jar AppTest.java`.
4. Run the tests by running `java -cp .:junit-4.13.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AppTest`.

The test results will be displayed in the terminal.

## Troubleshooting

If the `AppTest.testMain` test is failing, check the following:

- Make sure the input provided in the test is valid. The test currently uses the email "test@example.com" and the password "password@1".
- Check the output of the `App.main` method when given valid input. It should print "Login Success".
- Test the `EmailValidator.isValidEmail` and `PasswordChecker.checkPassword` methods separately to make sure they're working correctly.