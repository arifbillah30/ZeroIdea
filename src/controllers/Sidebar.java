package controllers;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class Sidebar {
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
//        Without creating fxml file
//        WebView webView = new WebView();
        // Load the website URL into the WebView
//        webView.getEngine().load("https://example.com");
        // Create a new border pane and add the WebView to it
//        BorderPane root = new BorderPane();
//        root.setCenter(webView);

        // Create a new scene and add the border pane to it
//        Scene scene = new Scene(root, 800, 600);
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/course.fxml"));
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/content-area.fxml"));
//        Parent root = loader.load();
//        ContentArea modifyDashBoard = loader.getController();
//        modifyDashBoard.greetings.setText("Welcome brother");


        Parent root = FXMLLoader.load(getClass().getResource("/fxml/course.fxml"));
        Main.myStage.setScene(new Scene(root, 1000, 600));
        Main.myStage.show();




    }
}
