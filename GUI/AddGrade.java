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
import javafx.stage.Stage;
import sun.font.GraphicComponent;

/**
 *
 * @author DELL
 */
public class AddGrade extends Application{
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        Instructor BK = new Instructor();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(40);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));
        
        Label lbl1 = new Label("StudentID");
        
        grid.add(lbl1, 0, 0);
        TextField txt1 = new TextField();
        txt1.setPromptText("StudentID");
        grid.add(txt1, 1, 0);
        Label lbl2 = new Label("CourseID");
        grid.add(lbl2, 0, 1);
        TextField txt2 = new TextField();
        txt2.setPromptText("CourseID");
        grid.add(txt2, 1, 1);
        Label lbl3 = new Label("Grade");
        grid.add(lbl3, 0, 2);
        TextField txtsurv = new TextField();
        txtsurv.setPromptText("Grade");
        grid.add(txtsurv, 1, 2);
        
        
        Button subbtn = new Button("Submit");
        subbtn.setOnAction(e->{
            
            
        });
        grid.add(subbtn, 1, 3);
        Scene scene = new Scene(grid,600,600);
        window.setScene(scene);
        window.show();
        
        
    }
    
}
