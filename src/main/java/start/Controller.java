package start;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import javax.swing.text.html.ListView;
import java.io.File;

/**
 * Created by Vitalii on 10.05.2017.
 */
public class Controller{

    private ListView listView;

    public void OpenDialog(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        File selectFile = fileChooser.showOpenDialog(null);
        if (selectFile !=null){
            System.out.println("1");
        }
    }
}
