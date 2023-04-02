package controllers;

import home.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourseController implements Initializable {
    @FXML
    private WebView webView;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webView.getEngine().load("https://www.w3schools.com/python/default.asp");
    }

    public void dashboard(MouseEvent mouseEvent) throws IOException {
        Main main = new Main();
        main.start(new Stage());
    }
}

