/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.scene.layout.*;
import javafx.scene.control.*;


/**
 *
 * @author IO
 */
public class UserPain extends GridPane
{
    TextField input;
    TextField output;
    Button openInput;
    Button openDest;

public UserPain()
{
    input=new TextField();
    output=new TextField();
    openInput=new Button();
    openInput.setText("Input");
    openDest=new Button();
    openDest.setText("Output");
    
    this.add(openInput, 0, 0);
    this.add(input, 1, 0);
    this.add(openDest, 0,1 );
    this.add(output,1,1);
    
    
    
}




}


