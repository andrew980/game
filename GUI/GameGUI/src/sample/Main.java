package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.Image;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Game Republic");

        Font font1 = Font.font("Courier New", FontWeight.BOLD, 35);


        Label label = new Label("Main Menu");
        label.setTextFill(Color.web("#610B4B"));
        label.setFont(Font.font("Courier New", FontWeight.BOLD, 65));
        label.setAlignment(Pos.CENTER);

        DropShadow dropShadow3= new DropShadow();
        dropShadow3.setRadius(10);
        dropShadow3.setOffsetX(5);
        dropShadow3.setOffsetY(5);
        dropShadow3.setColor(Color.web("#97839C"));

        Button button1 = new Button("Play");
        button1.setFont(font1);
        button1.setWrapText(true);
        button1.setMaxSize(400, 200);
        button1.setEffect(dropShadow3);
        button1.setStyle("-fx-background-color: #FFD0B5; -fx-text-fill: BLACK;");

        Button button2 = new Button("About");
        button2.setFont(font1);
        button2.setWrapText(true);
        button2.setMaxSize(400, 200);
        button2.setEffect(dropShadow3);
        button2.setStyle("-fx-background-color: #FFD0B5; -fx-text-fill: BLACK;");

        Button button3 = new Button("Settings");
        button3.setFont(font1);
        button3.setWrapText(true);
        button3.setMaxSize(400, 200);
        button3.setEffect(dropShadow3);
        button3.setStyle("-fx-background-color: #FFD0B5; -fx-text-fill: BLACK;");

        Button button4 = new Button("Exit");
        button4.setFont(font1);
        button4.setWrapText(true);
        button4.setMaxSize(400, 200);
        button4.setEffect(dropShadow3);
        button4.setStyle("-fx-background-color: #FFD0B5; -fx-text-fill: BLACK;");


        GridPane gridpane = new GridPane();
        Image image = new Image("File:Menu2.png");
        gridpane.getChildren().add(new ImageView(image));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(50);
        grid.add(label, 5, 0);
        grid.add(button1, 5, 2);
        grid.add(button2, 5, 3);
        grid.add(button3, 5, 4);
        grid.add(button4, 5, 5);

        StackPane stack = new StackPane(gridpane, grid);

        Scene scene = new Scene(stack, 200, 100);

        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);

        primaryStage.show();

        button4.setOnAction( e -> {
            primaryStage.close();
        });
    }
}


