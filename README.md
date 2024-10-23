# Digital Menu Card 🍽️

## Table of Contents
- [Overview](#overview)
- [Project Structure 📂](#project-structure-📂)
- [How to Run 🛠](#how-to-run-🛠)
- [Usage](#usage)
- [Example](#example)
- [Classes and Methods](#classes-and-methods)
- [What You Will Learn](#what-you-will-learn)
- [Contributing](#contributing)
- [License 🪪](#license-🪪)

## Overview 
The Digital Menu Card is a command-line application that allows users to order meals for breakfast, lunch, and dinner. The application calculates the total bill for the selected meal and displays it to the user.


## Project Structure 📂
The project consists of the following files:

- `Breakfast.java`: Contains the `Breakfast` class and its methods.
- `DigitalMenuCard.java`: Contains the `DigitalMenuCard` class with the main method to run the application.
- `Dinner.java`: Contains the `Dinner` class and its methods.
- `Lunch.java`: Contains the `Lunch` class and its methods.
- `README.md`: This file, providing an overview and instructions for the project.

## How to Run 🛠
This is a command-line project, which means you need to run it in the terminal or command prompt.

1. **Compile the Java files**:
    ```sh
    javac *.java
    ```

2. **Run the application**:
    ```sh
    java DigitalMenuCard
    ```

## Usage
1. When you run the application, you will be greeted with a welcome message and prompted to choose a meal type.
2. Type `b` for breakfast, `l` for lunch, or `d` for dinner.
3. Follow the prompts to complete your order.
4. The application will display the total bill for your order and thank you for ordering.

## Example
    ```sh
    ---------- Welcome to our Digital Menu Card!!! ----------
    Type
    b for breakfast
    l for lunch
    d for dinner

    b
    Your total bill is = 15.75
    Thank you for ordering!!
    ---------------------------------------------------------

## Classes and Methods
- DigitalMenuCard: The main class that handles user input and directs the flow of the application.
- Breakfast: Contains methods related to breakfast orders.
- Lunch: Contains methods related to lunch orders.
- Dinner: Contains methods related to dinner orders.

## What You Will Learn
By working on this project, you will gain and improve your understanding of:

- Loops: Using loops to iterate over user inputs and menu options.
- Control Statements: Implementing control statements like if, else if, and switch to handle different user choices.
- User Input Handling: Capturing and processing user inputs from the command line.
- Basic Java Syntax: Writing and organizing Java classes and methods.
- Command-Line Applications: Building and running Java applications from the command line.

## Contributing
Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License 🪪
This project is licensed under the MIT License.