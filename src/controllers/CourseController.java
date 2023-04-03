package controllers;

import home.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
//        webView.getEngine().load("https://www.w3schools.com/python/default.asp");
        // Load the new FXML file
//        FXMLLoader newLoader = new FXMLLoader(getClass().getResource("/fxml/UI.fxml"));

        // Get an instance of the DashBoard controller
//        FXMLLoader dashboardLoader = new FXMLLoader(getClass().getResource("/fxml/UI.fxml"));
//        DashBoard dashboardController = dashboardLoader.getController();

        // Set the new value of section1Loader in the DashBoard controller
//        dashboardController.setSection1Loader(newLoader);

//      take it course window
//        Parent root = null;
//        try {
//            root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Main.myStage.setScene(new Scene(root, 1000, 600));
//        Main.myStage.show();
    }

    public void dashboard(MouseEvent mouseEvent) throws IOException {
        Main main = new Main();
        main.start(new Stage());
    }
}

