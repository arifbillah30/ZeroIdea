package controllers;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class Sidebar {
    ContentArea contentArea;
    private Stage stage;
//    private Scene scene;
    private Parent root;
//    Main main=new Main();
    public void goLoginPage(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        Main.myStage.setScene(new Scene(root, 1000, 600));
        Main.myStage.show();

    }

    public void gotoCourse(MouseEvent mouseEvent) throws IOException {


    }
}
