package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Vitalii on 10.05.2017.
 */
public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {

        //FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        //Parent root = loader.load();
        Parent root =  FXMLLoader.load(getClass().getResource("main.fxml"));
        //Controller controller = loader.getController();
        //controller.init(primaryStage);

        Scene scene = new Scene(root,470,350);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo MPS");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
