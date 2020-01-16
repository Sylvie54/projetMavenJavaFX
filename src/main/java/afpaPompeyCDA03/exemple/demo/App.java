package afpaPompeyCDA03.exemple.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage stage) throws Exception {
//        System.out.println("avant loader");
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    public static void main( String[] args )
    {
       launch(args);
    }
}
