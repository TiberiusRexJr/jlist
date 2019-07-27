/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist;

import View.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author IO
 */
public class Jlist extends Application
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        Button btn = new Button();
        
        mainWindow wm=new mainWindow();
        UserPain up=new UserPain();
        wm.setLeft(up);
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(wm, 300, 250);
        
        primaryStage.setTitle("Jlist");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
