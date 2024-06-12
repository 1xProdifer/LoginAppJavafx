package controller;
/**
 * @author Adhyan Chandhoke
 * Date 11/06/2024
 * This class is a controller for the WebView redirection screen, responsible for initializing a WebView component to display web content, particularly loading the GitHub page URL.
 */
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * Controller class for the WebView redirection screen.
 */
public class RedirectController {

    @FXML
    private WebView webView; // WebView component to display web content

    /**
     * Initializes the WebView with the GitHub page URL.
     */
    @FXML
    public void initialize() {
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://github.com/1xProdifer"); // Loads the GitHub page
    }
}
