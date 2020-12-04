/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class ShowGrades extends Application{
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
        
        
        
        Label lblsurv = new Label("Student ID");
        grid.add(lblsurv, 0, 0);
        
        TextField txtsurv = new TextField();
        txtsurv.setPromptText("Enter your ID");
        grid.add(txtsurv, 1, 0);
        
        
        Label lblC = new Label("Course ID");
        grid.add(lblC, 0, 1);
        
        TextField txtC = new TextField();
        txtC.setPromptText("Enter Course ID");
        grid.add(txtC, 1, 1);
        
        Button showgrade =new Button("Showgrade");
        grid.add(showgrade, 0, 2);
        Label lblgrade = new Label("Your grade : ");
         lblgrade.setFont(Font.font("Tahoma",FontWeight.LIGHT,20));
        showgrade.setOnAction(e->{
            lblgrade.setText("45");
            grid.add(lblgrade, 1, 3);
        });
        Label lblGrade = new Label("Grade");
        grid.add(lblGrade, 0, 3);
        
        
        
        
        Button backbtn = new Button("BACK");
		backbtn.setOnAction(e->{
			try {
				BK.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        grid.add(backbtn, 0, 4);
        Scene scene = new Scene(grid,600,600);
        window.setScene(scene);
        window.show();
    }
    
}
