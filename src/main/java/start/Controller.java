package start;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Vitalii on 10.05.2017.
 */
public class Controller implements Initializable {

    private Stage stage;

    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void init(Stage stage) {
        this.stage = stage;
    }
    public void openFile(){
        FileChooser fileChooser = new FileChooser();

        File file = fileChooser.showOpenDialog(stage);
        if(file !=null){
            System.err.println("Choosen file " + file);
        }
    }

    public void doExit(){
        Platform.exit();
    }

}
