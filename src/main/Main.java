package main;
/**
 * @author Adhyan Chandhoke
 * Date 11/06/2024
 * This class serves as the main entry point for the application.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main class of the application that launches the JavaFX app.
 */
public class Main extends Application {

    /**
     * The main entry point for the JavaFX application.
     * @param primaryStage The primary stage of the application
     * @throws Exception If an error occurs during initialization
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file for the registration page
        Parent root = FXMLLoader.load(getClass().getResource("/webview/RegistrationPage.fxml"));

        // Create a new scene with the root node and set the stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Registration Page"); // Set the title of the stage
        primaryStage.setScene(scene); // Set the scene to the stage
        primaryStage.show(); // Show the stage
    }

    /**
     * The main method that launches the JavaFX application.
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
