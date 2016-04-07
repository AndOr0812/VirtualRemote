/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualremote;

import Util.commont.Config;
import javafx.application.Application;
import javafx.stage.Stage;
import ui.ChoseFonctionnalite;
import ui.Plash;

/**
 *
 * @author HP
 */
public class VirtualRemote extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setOnCloseRequest(event->{System.exit(1);});
        Plash plash = new Plash(primaryStage);
        Config.initConfig(plash);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
