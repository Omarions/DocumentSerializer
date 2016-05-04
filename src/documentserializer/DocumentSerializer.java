/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentserializer;

import com.sun.javafx.webkit.Accessor;
import com.sun.javafx.webkit.ThemeClientImpl;
import com.sun.webkit.ThemeClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Omar
 */
public class DocumentSerializer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("NewOfferForm.fxml"));
        Scene scene = new Scene(root);       
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        launch(args);
        
    }
    
}
