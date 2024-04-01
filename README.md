# Qcalc

# Project: Simple and Scientific Calculator (Java)
Introduction
This project contains both a simple calculator and a scientific calculator implemented in Java. The simple calculator provides basic arithmetic operations such as addition, subtraction, multiplication, and division. The scientific calculator extends the functionality to include trigonometric, logarithmic, and other mathematical operations.

Features
Simple Calculator:

Addition
Subtraction
Multiplication
Division
Scientific Calculator:

Trigonometric functions (sin, cos, tan)
Logarithmic functions (log)
Exponential functions (exp)
Square root
Absolute value
Requirements
Java Development Kit (JDK)
Gradle
Installation
Clone or download the project repository.
Make sure you have JDK and Gradle installed on your system.
Navigate to the project directory.
Build the project using Gradle: gradle build
Run the simple calculator: gradle run -PappArgs="['simple']"
Run the scientific calculator: gradle run -PappArgs="['scientific']"
Usage
Simple Calculator:

Upon running gradle run -PappArgs="['simple']", follow the on-screen instructions to perform basic arithmetic operations.
Enter two numbers and select the operation you want to perform.
Scientific Calculator:

Upon running gradle run -PappArgs="['scientific']", follow the on-screen instructions to perform scientific calculations.
Choose the desired operation from the menu and provide necessary inputs.
Examples
Simple Calculator

$ gradle run -PappArgs="['simple']"

Welcome to Simple Calculator!

Enter the first number: 10
Enter the second number: 5

Select operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter choice (1/2/3/4): 1

10 + 5 = 15

Scientific Calculator

$ gradle run -PappArgs="['scientific']"

Welcome to Scientific Calculator!

Select operation:
1. Sine
2. Cosine
3. Tangent
4. Logarithm
5. Exponential
6. Square Root
7. Absolute Value
Enter choice (1/2/3/4/5/6/7): 6

Enter a number: 25

Square root of 25 = 5.0
