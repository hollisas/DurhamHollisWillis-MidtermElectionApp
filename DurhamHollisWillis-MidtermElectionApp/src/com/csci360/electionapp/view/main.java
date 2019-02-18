package com.csci360.electionapp.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * 
 * @author Brandi Durham, Austin Hollis, Justin Willis
 *
 */
public class main extends Application {

    /**
     * Method for starting screen
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Might incorporate title and resourceName
        // into a class creation method...
        String title = "Main Page";
        String resourceName = "Mainpage.fxml";

        // Store the Mainpage.fxml file into root as a "Parent"
        Parent root = FXMLLoader.load(getClass().getResource(resourceName));

        // Create a new stage and set the title
        // and show root as the scene.
        Scene scene = new Scene(root);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();

    }

    // Button variable for registering page (registration page)
    @FXML
    public Button btnReg;

    // Button variable to close the screen (registration page)
    @FXML
    public Button closeButton;

    // Button variable for submitting registration information (registration page)
    @FXML
    public Button regSubmit;

    // Button variable for checking registration page (check registration page)
    @FXML
    public Button checkSubmit;

    // Button variable for submitting voting choices (vote page)
    @FXML
    public Button voteSubmit;

    // Button variable for submitting final choices (review page)
    @FXML
    public Button finalSubmit;

    // Button variable for canceling review choices (review page)
    @FXML
    public Button finalCancel;

    // Button variable for ending the session (thank you screen)
    @FXML
    public Button end;

    // Button variable for admin page (admin login page)
    @FXML
    public Button adminSubmit;

    /**
     * Text Fields for registration page
     */

    // TextField variables used in
    // the registering process.
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField birthdayField;
    @FXML
    private TextField ssn;
    @FXML
    private TextField pswd;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    /**
     * CheckBox and Label variables for voting page
     */
    @FXML
    public CheckBox C1;
    @FXML
    public CheckBox C2;
    @FXML
    public CheckBox C3;
    @FXML
    public CheckBox C4;
    @FXML
    public CheckBox C5;
    @FXML
    public CheckBox C6;
    @FXML
    public CheckBox C7;
    @FXML
    public CheckBox C8;
    @FXML
    public CheckBox C9;
    @FXML
    public CheckBox C10;
    @FXML
    public CheckBox C11;
    @FXML
    public CheckBox C12;
    @FXML
    public Label S1;
    @FXML
    public Label S2;
    @FXML
    public Label S3;
    @FXML
    public Label S4;

    /**
     * 
     * @throws Exception
     */
    // Method used if the register button is clicked
    @FXML
    public void regButtonClicked() throws Exception {
        // Might incorporate title and resourceName
        // into a class creation method...
        String title = "Registration Page";
        String resourceName = "registration.fxml";

        // FXMLLoader variable to grab the registration.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store the registration.fxml file into root as a "Parent"
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

    /**
     * 
     * @throws Exception
     */
    // Method used if the check registration button is clicked
    public void checkButtonClicked() throws Exception {
        // Might incorporate title and resourceName
        // into a class creation method...
        String title = "Check registration Status Page";
        String resourceName = "checkStatus.fxml";

        // FXMLLoader variable to grab the checkStatus.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store the checkStatus.fxml file into root as a "Parent"
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    /**
     * 
     * @throws Exception
     */
    // Method used if the vote button is clicked
    public void voteButtonClicked() throws Exception {
        // Might incorporate title and resourceName
        // into a class creation method...
        String resourceName = "votingPage.fxml";
        String title = "Voting Page";

        // FXMLLoader variable to grab the votingPage.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store the votingPage.fxml file into root as a "Parent"
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

    /**
     * 
     * @throws Exception
     */
    // Method used if the admin login button is clicked
    public void adminButtonClicked() throws Exception {
        // Might incorporate title and resourceName
        // into a class creation method...
        String resourceName = "admin.fxml";
        String title = "Election Official Page";

        // FXMLLoader variable to grab the admin.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Strong admin.fxml into Parent
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    // Method used when a close button has been clicked
    public void btnClose_clicked(ActionEvent event) throws IOException {
        // Get the current window and close it
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void regSubmit(ActionEvent event) throws IOException {
        // Print statements for testing purposes (remove later)
        System.out.print(firstNameField.getText() + "\n");
        System.out.print(lastNameField.getText() + "\n");
        System.out.print(birthdayField.getText() + "\n");
        System.out.print(ssn.getText() + "\n");
        System.out.print(pswd.getText() + "\n");

        // Clear the text fields
        // (may need to do this after storing somewhere?)
        firstNameField.clear();
        lastNameField.clear();
        birthdayField.clear();
        ssn.clear();
        pswd.clear();

        // Get the current window and close it.
        Stage stage = (Stage) regSubmit.getScene().getWindow();
        stage.close();
    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void checkSubmit(ActionEvent event) throws IOException {
        // Print statements for testing purposes (remove later)
        System.out.print(firstNameField.getText() + "\n");
        System.out.print(lastNameField.getText() + "\n");
        System.out.print(birthdayField.getText() + "\n");
        System.out.print(ssn.getText() + "\n");

        // Clear the text fields
        // (may need to do this after storing the data somewhere?)
        firstNameField.clear();
        lastNameField.clear();
        birthdayField.clear();
        ssn.clear();

        // Get the current window and close it
        Stage stage = (Stage) checkSubmit.getScene().getWindow();
        stage.close();
    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void adminSubmit(ActionEvent event) throws IOException {
        // Print statements for testing purposes (remove later)
        System.out.print(username.getText() + "\n");

        // Clear the text fields
        // (may need to clear this after storing the data somewhere?)
        username.clear();
        password.clear();

        // Might incorporate title and resourceName
        // into a class creation method...
        String resourceName = "adminInfo.fxml";
        String title = "Election Official Page";

        // FXMLLoader variable to grab the adminInfo.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store adminInfo.fxml into Parent variable
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void voteSubmit(ActionEvent event) throws IOException {
        // Print statements for testing purposes (remove later)
        System.out.println(C1.getText());
        System.out.println(C1.isSelected());
        System.out.println(C2.getText());
        System.out.println(C2.isSelected());
        System.out.println(C3.getText());
        System.out.println(C3.isSelected());
        System.out.println(C4.getText());
        System.out.println(C4.isSelected());
        System.out.println(C5.getText());
        System.out.println(C5.isSelected());
        System.out.println(C6.getText());
        System.out.println(C6.isSelected());
        System.out.println(C7.getText());
        System.out.println(C7.isSelected());
        System.out.println(C8.getText());
        System.out.println(C8.isSelected());
        System.out.println(C9.getText());
        System.out.println(C9.isSelected());
        System.out.println(C10.getText());
        System.out.println(C10.isSelected());
        System.out.println(C11.getText());
        System.out.println(C11.isSelected());
        System.out.println(C12.getText());
        System.out.println(C12.isSelected());

        // Trying to store checkbox text into a variable to grab
        // Not working; may need to use Controller class??
        /*
         * String vote1 = C1.getText(); String vote2 = C4.getText(); String vote3 =
         * C7.getText(); String vote4 = C11.getText(); S1.setText(vote1);
         * S2.setText(vote2); S3.setText(vote3); S4.setText(vote4);
         */

        // Might incorporate title and resourceName
        // into a class creation method...
        String resourceName = "finalSubmit.fxml";
        String title = "Vote Confirmation Page";

        // FXMLLoader variable to grab the finalSubmit.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store finalSubmit.fxml into Parent variable
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void finalSubmit(ActionEvent event) throws IOException {

        // Not able to get the text value from the checkBox objects
        // may need to use controller class to grab and set data??
        /*
         * S1.setText(C1.getText()); S2.setText(C4.getText()); S3.setText(C7.getText());
         * S4.setText(C11.getText());
         * 
         * System.out.println(S1.getText()); System.out.println(S2.getText());
         * System.out.println(S3.getText()); System.out.println(S4.getText());
         */

        // Might incorporate title and resourceName
        // into a class creation method...
        String resourceName = "endPage.fxml";
        String title = "Thank You";

        // FXMLLoader variable to grab the endPage.fxml file.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resourceName));

        // Store endPage.fxml into Parent variable
        Parent root = fxmlLoader.load();

        // Create a new stage and initialize the modality
        // set the opacity to 1 and set the title and show
        // root as the scene.
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setOpacity(1);
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void finalCancel(ActionEvent event) throws IOException {
        System.out.println("Cancel chosen, going back to voting page");

        // Get the current window and close it
        Stage stage = (Stage) finalCancel.getScene().getWindow();
        stage.close();
    }

    /**
     * 
     * @param event
     * @throws IOException
     */
    public void closeApp(ActionEvent event) throws IOException {
        // If application is closed exit the program
        System.exit(0);
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}