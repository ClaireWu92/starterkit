package au.edu.unsw.infs2605.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    public Button addition, subtraction, multiplication, division, equal, clear;
    
    @FXML
    public TextField text_No1, text_No2;
    
    @FXML
    public Label label_Symbol, label_ResultNo;
    
    public char operation;
    public void symbol(ActionEvent event) {
        String action = ((Button)(event.getSource())).getText();
        System.out.println(action);
        operation = action.charAt(0);
        label_Symbol.setText(action);
    }
    
    public void solve(ActionEvent event) {
        String result = "";

        double No1 = Double.parseDouble(text_No1.getText());
        double No2 = Double.parseDouble(text_No2.getText());
        
        switch(operation) {
            case '+' : result += Double.toString(No1 + No2); break;
            case '-' : result += Double.toString(No1 - No2); break;
            case '*' : result += Double.toString(No1 * No2); break;
            case '/' : 
                if(No2 == 0) {
                    result += "Error!";
                } else {
                    result += Double.toString(No1 / No2);
                } break;
            default: result += "---";
        }

        label_ResultNo.setText(result);       
    }
    
    public void clear(ActionEvent event) {
        text_No1.setText("");
        text_No2.setText("");
        label_Symbol.setText("--");
        label_ResultNo.setText("---");
    }
    
}