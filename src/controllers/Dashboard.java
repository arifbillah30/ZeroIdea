package controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable {
    public BorderPane borderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Parent sidebar= FXMLLoader.load(getClass().getResource("fxml/sidebar.fxml"));
            Parent menubar= FXMLLoader.load(getClass().getResource("fxml/menubar.fxml"));
            Parent contentArea= FXMLLoader.load(getClass().getResource("fxml/content-area.fxml"));
            borderPane.setTop(menubar);
            borderPane.setLeft(sidebar);
            borderPane.setCenter(contentArea);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
