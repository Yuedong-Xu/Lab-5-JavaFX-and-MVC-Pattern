/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.User;
import javafx.scene.control.Alert;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;




/**
 *
 * @author vincent
 */
public class MainFXMLController implements Initializable{
    
    @FXML
    
    private TextField nameTextField;
    
    @FXML
    
    private Spinner<Integer> ageSpinner;
    
    @FXML
    
    private TextField emailTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        System.out.println("Controller initialized");
        ageSpinner.setValueFactory(
        new SpinnerValueFactory.IntegerSpinnerValueFactory(1,120,18)
        );
    }
    
    @FXML
    public void submit(){
        try {
            String name = nameTextField.getText().trim();
            String email = emailTextField.getText().trim();
            int age = ageSpinner.getValue();
            
    if (name.isEmpty() || email.isEmpty()){
        showAlert("Please fill in all fields.", Alert.AlertType.WARNING, "Missing Data");
        return;
    }
    
    if (!email.contains("@") || !email.contains(".")){
         showAlert("Please enter a valid email address.", Alert.AlertType.ERROR, "Email Error");
        return;
    }
    
    User user = new User(name, age, email);
            showAlert("Registration Successful!\n\n"+ user, Alert.AlertType.INFORMATION, "Success");
            nameTextField.clear();
            emailTextField.clear();
            ageSpinner.getValueFactory().setValue(18);
            
        }catch (Exception e){
            showAlert("An unexpected error occurred: " + e.getMessage(), Alert.AlertType.ERROR, "Error");
        }
    }
    private void showAlert(String message, Alert.AlertType type, String header){
        Alert alert = new Alert(type);
        alert.setTitle("Registration");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
