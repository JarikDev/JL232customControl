package com;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //NumberTextField numberTextField=new NumberTextField();
        CustomControl customControl=new CustomControl();

        Group root=new Group();
        root.getChildren().add(customControl);
        primaryStage.setScene(new Scene(root,500,500));
        primaryStage.show();
    }
}