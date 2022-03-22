package au.edu.unsw.infs2605.calculator;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author malshika
 */
public class PrimaryController {
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
}

