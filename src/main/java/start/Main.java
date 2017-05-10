package start;

import db.TableName;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Vitalii on 10.05.2017.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.init(primaryStage);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo MPS");
        primaryStage.show();

    }

    public static SessionFactory buildSessionFactory(Class clazz){
        return new Configuration()
                .configure()
                .addAnnotatedClass(clazz)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        launch(args);

        TableName table = new TableName();
        table.setName("testTable");

        SessionFactory sessionFactory=buildSessionFactory(TableName.class);
        Session session = sessionFactory.openSession();
        session.save(table);
        TableName savedTable = session.get(TableName.class, 1);

        System.out.println(savedTable.getName());
    }

}
