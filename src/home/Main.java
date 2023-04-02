package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public String dashboard="/fxml/dashboard.fxml";
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(dashboard);

        Parent root = FXMLLoader.load(getClass().getResource(dashboard));

        Scene scene = new Scene(root, 1000, 600);

        myStage=stage;
        myStage.setTitle("E-help");
        myStage.setScene(scene);
        myStage.show();
//we gonna remove the borderless thingie.


//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }
    public Main(){}
    public Main(String dashboard) {
        this.dashboard=dashboard;
    }

    public static void main(String[] args) {


        launch();
    }
}