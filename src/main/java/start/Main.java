package start;

import db.TableName;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Vitalii on 10.05.2017.
 */
public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/MainFrm.fxml"));
        primaryStage.setTitle("CSV Importer");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                Platform.exit();
            }
        });

        /*TableName table = new TableName();
        table.setName("testTable");

        SessionFactory sessionFactory=buildSessionFactory(TableName.class);
        Session session = sessionFactory.openSession();
        session.save(table);
        TableName savedTable = session.get(TableName.class, 1);

        System.out.println(savedTable.getName());*/
    }

    public static SessionFactory buildSessionFactory(Class clazz){
        return new Configuration()
                .configure()
                .addAnnotatedClass(clazz)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
