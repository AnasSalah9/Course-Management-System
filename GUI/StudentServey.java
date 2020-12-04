/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.sun.javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.text.html.HTML;

/**
 *
 * @author DELL
 */
public class StudentServey extends Application{
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        StudentLogin BK = new StudentLogin();
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(40);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Label lblsurv = new Label("Survey");
        grid.add(lblsurv, 0, 0);
        
        TextArea txtsurv = new TextArea();
        txtsurv.setPromptText("Write your Message");
        txtsurv.setPrefSize(300, 200);
        grid.add(txtsurv, 1, 0);
        
        Button subbtn = new Button("Submit");
        subbtn.setOnAction(e->{
            
            
        });
        grid.add(subbtn, 1, 1);
        
        Button backbtn = new Button("BACK");
		backbtn.setOnAction(e->{
			try {
				BK.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        grid.add(backbtn, 0, 2);
        Scene scene = new Scene(grid,600,600);
        window.setScene(scene);
        window.show();
    }
    
}
