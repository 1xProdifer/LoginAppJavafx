package controller;
/**
 * @author Adhyan Chandhoke
 * Date 11/06/2024
 * This class is a controller for redirecting the screen to the github profile.
 */
import javafx.fxml.FXML;
import javafx.scene.web.WebView;

/**
 * Controller class for the web view page.
 */
public class RedirectController {

    @FXML
    private WebView webView; // WebView to display the web page

    /**
     * Loads the given URL in the WebView.
     * @param url The URL to load
     */
    public void loadURL(String url) {
        webView.getEngine().load(url);
    }
}
