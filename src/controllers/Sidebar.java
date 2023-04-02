package controllers;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Sidebar {
    Main main=new Main();
    public void goLoginPage(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        Main.myStage.setScene(new Scene(root, 1000, 600));
        Main.myStage.show();


    }
}
