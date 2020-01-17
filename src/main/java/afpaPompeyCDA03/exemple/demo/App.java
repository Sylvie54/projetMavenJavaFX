package afpaPompeyCDA03.exemple.demo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PersonOverview.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
        
    }
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getClassLoader().getResource("RootLayout"));
//            rootLayout = (BorderPane) loader.load();
            rootLayout = FXMLLoader.load(getClass().getClassLoader().getResource("RootLayout.fxml"));
            
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getClassLoader().getResource("PersonOverview.fxml"));
//            AnchorPane personOverview = (AnchorPane) loader.load();
            AnchorPane personOverview = FXMLLoader.load(getClass().getClassLoader().getResource("PersonOverview.fxml"));

            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main( String[] args )
    {
//        JOptionPane.showMessageDialog(null, "essai avant lancement FXML");
       launch(args);
    }
}
