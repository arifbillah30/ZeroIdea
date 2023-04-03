package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class DashBoard {
    @FXML
    private BorderPane dashboardBorderPane;
    @FXML
    private AnchorPane content;
    @FXML
    private AnchorPane sidebar;
    FXMLLoader section1Loader = new FXMLLoader(getClass().getResource("/fxml/content-area.fxml"));
    FXMLLoader section2Loader = new FXMLLoader(getClass().getResource("/fxml/menubar.fxml"));

    FXMLLoader section3Loader = new FXMLLoader(getClass().getResource("/fxml/Sidebar.fxml"));
    Sidebar section1Controller = section1Loader.getController();



    public DashBoard() {
    }

    public void initialize() throws IOException {
        // Load first section's FXML file and set it to the center region of the BorderPane
        Node section1 = section1Loader.load();
        dashboardBorderPane.setCenter(section1);

        // Load second section's FXML file and set it to the top region of the BorderPane
        Node section2 = section2Loader.load();
//        dashboardBorderPane.setTop(section2);
//        Section2Controller section2Controller = section2Loader.getController();

        // Load third section's FXML file and set it to the bottom region of the BorderPane
        Node section3 = section3Loader.load();
        dashboardBorderPane.setLeft(section3);

        Sidebar sidebarController = section3Loader.getController();

    }

    public void setSection1Loader(FXMLLoader newLoader) {
        section1Loader = newLoader;
    }
}

