/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import code.Admin;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class StudentAddCourses extends Application{

    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;	
        Admin manager = new Admin();
        StudentLogin BK = new StudentLogin();
        String allCourses = manager.displayCourses();
                
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));

        Label view = new Label();
        view.setText(allCourses);
        view.setFont(Font.font("Tahoma", FontWeight.LIGHT,20));

        
        Label lbladdcourse = new Label("CourseID");
        lbladdcourse.setFont(Font.font("Tahoma",FontWeight.LIGHT,20));
        grid.add(lbladdcourse, 0, 2);
        TextField txtaddCourse = new TextField();
        txtaddCourse.setPromptText("The CourseID You Want to Add");
        grid.add(txtaddCourse, 1, 2);
        
        
        
        Label lblStudentid = new Label("StudentID");
        lblStudentid.setFont(Font.font("Tahoma",FontWeight.LIGHT,20));
        grid.add(lblStudentid, 0, 3);
        TextField txtid = new TextField();
        txtid.setPromptText("Enter your ID");
        grid.add(txtid, 1, 3);
        
        
        
        Label lbl = new Label("Added Successfully");
        Button AddCoursebtn = new Button("Submit");
        grid.add(AddCoursebtn, 1, 4);
        AddCoursebtn.setOnAction(e->{
            //addCourse
            grid.add(lbl, 1, 5);
        });
        Button backbtn = new Button("BACK");
        backbtn.setOnAction(e->{
            try {
                    BK.start(primaryStage);
            } catch (Exception e1) {
                System.out.println(e1);
            }
            });
        ScrollPane b = new ScrollPane();
        b.setContent(view);
        b.setPrefSize(600, 600);
        b.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        b.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        view.setAlignment(Pos.CENTER);
        grid.add(view, 1, 0);
        grid.add(b,1,0);
        grid.add(backbtn, 0, 4);

        Scene scene = new Scene(grid, 600, 600);
        window.setScene(scene);
        window.show();
    }
    
}
