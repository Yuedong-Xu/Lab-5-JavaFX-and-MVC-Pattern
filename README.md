Project Description

This project is a simple JavaFX application developed using the MVC (Model-View-Controller) architecture.

The application allows users to enter:

Name

Age

Email

When the user clicks the Submit button, a pop-up window displays the entered details. The application also performs input validation to ensure correct and complete data entry.

Architecture – MVC Pattern

This project follows the MVC structure:

Model (model.User)

Stores user data (name, age, email)

Includes constructor, getters, setters

Overrides toString() for formatted output

View (MainFXML.fxml)

Designed using Scene Builder

Contains:

TextFields (Name, Email)

Spinner (Age)

Submit Button

Connected to controller using fx:controller

Controller (controller.MainFXMLController)

Handles user interactions

Performs validations:

Checks empty fields

Validates email format

Creates User object

Displays pop-up using Alert

Technologies Used

Java

JavaFX

Scene Builder

NetBeans

FXML

Features

JavaFX UI

Spinner for age input (1–120)

Email validation

Pop-up confirmation message

MVC architecture implementation

Screenshots

Screenshots are in it.

How to Run

Open the project in NetBeans.

Make sure JavaFX is properly configured.

Run FXMain.java.

Yuedong Xu
