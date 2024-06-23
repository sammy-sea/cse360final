package com.example.cse360project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Date;
import java.time.ZoneId;

public class GUI extends Application{

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label dobLabel = new Label("Date of Birth:");
        DatePicker dobPicker = new DatePicker();

        Label weightLabel = new Label("Weight (lbs):");
        TextField weightField = new TextField();

        Label heightLabel = new Label("Height (in):");
        TextField heightField = new TextField();

        Label tempLabel = new Label("Body Temperature (°F):");
        TextField tempField = new TextField();

        Label bpLabel = new Label("Blood Pressure:");
        TextField bpField = new TextField();

        Button submitButton = new Button("Submit");

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);
        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);
        gridPane.add(emailLabel, 0, 2);
        gridPane.add(emailField, 1, 2);
        gridPane.add(dobLabel, 0, 3);
        gridPane.add(dobPicker, 1, 3);
        gridPane.add(weightLabel, 0, 4);
        gridPane.add(weightField, 1, 4);
        gridPane.add(heightLabel, 0, 5);
        gridPane.add(heightField, 1, 5);
        gridPane.add(tempLabel, 0, 6);
        gridPane.add(tempField, 1, 6);
        gridPane.add(bpLabel, 0, 7);
        gridPane.add(bpField, 1, 7);
        gridPane.add(submitButton, 1, 8);

        // Create scene
        Scene scene = new Scene(gridPane, 400, 300);

        // Handle submit button action
        submitButton.setOnAction(e -> {
            // Get input values
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            Date dob = Date.from(dobPicker.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            String weight = weightField.getText();
            String height = heightField.getText();
            int bodyTemp = Integer.parseInt(tempField.getText());
            int bloodPressure = Integer.parseInt(bpField.getText());

            // Create Information and Vitals objects (you can handle these as needed)
            Information info = new Information(firstName, lastName, email, dob);
            Vitals vitals = new Vitals(new Date(), "Patient123", weight, height, bodyTemp, bloodPressure);


            // Clear input fields
            firstNameField.clear();
            lastNameField.clear();
            emailField.clear();
            dobPicker.setValue(null);
            weightField.clear();
            heightField.clear();
            tempField.clear();
            bpField.clear();
        });

        // Set stage properties
        primaryStage.setTitle("Pediatric Office Information Collection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
