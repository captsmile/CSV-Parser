package start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import javafx.scene.control.TableView;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Vitalii on 10.05.2017.
 */

public class Controller implements Initializable{
    @FXML
    private Button btnImport;
    @FXML
    private Button btnSave;
    @FXML
    private TextField fldFileName;
    @FXML
    private TableView tblDataImport;

    public void OpenDialog(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose CSV file");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV file","*.csv"));
        File selectFile = fileChooser.showOpenDialog(null);
        if (selectFile !=null){
            fldFileName.setText(selectFile.getName().replaceFirst("[.][^.]+$", ""));
            CSVParser csv = new CSVParser();
            csv.setCsvFile(selectFile.getAbsolutePath());
            csv.Parse();
            System.out.println(csv.toString());
        }



        //System.out.println(csv.getBr());
    }
    public void OnSave(){
        System.out.println("save...");
    }

    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("load");
    }
}
