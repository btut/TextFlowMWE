package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private TextFlow textFlow0;
    @FXML
    private TextFlow textFlow1;
    @FXML
    private TextFlow textFlow2;
    @FXML
    private Label label0;
    @FXML
    private Label label1;
    @FXML
    private Label label2;

    private String longText = "This is some really long text that should overflow the available Area. " +
            "For TextFields, this is handeled by cropping the text to appropriate length and adding \"...\" at the end. " +
            "No such option exists for TextFlows";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Text Overflow");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    @FXML
    private void initialize() {
        textFlow0.getChildren().add(new Text(longText));
        textFlow1.getChildren().add(new Text(longText));
        textFlow2.getChildren().add(new Text(longText));
        label0.setText(longText);
        label1.setText(longText);
        label2.setText(longText);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
