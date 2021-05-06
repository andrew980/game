package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        Font font1 = Font.font("Courier New", FontWeight.BOLD, 40);
        Font font2 = Font.font("Courier New", FontWeight.BOLD, 25);
        Font font3 = Font.font("Courier New", FontWeight.BOLD, 20);

        Label label = new Label("Settings");
        label.setTextFill(Color.web("#610B4B"));
        label.setFont(Font.font("Courier New", FontWeight.BOLD, 55));
        label.setAlignment(CENTER);

        Text musicLabel = new Text("Music");
        musicLabel.setFont(font1);
        Slider musicSlider = new Slider(0, 100, 0);
        musicSlider.setShowTickLabels(true);
        musicSlider.setMaxWidth(Double.MAX_VALUE);
        musicSlider.setMajorTickUnit(10);

        Text soundLabel = new Text("Sounds");
        soundLabel.setFont(font1);
        Slider soundSlider = new Slider(0, 100, 0);
        soundSlider.setShowTickLabels(true);

        soundSlider.setMajorTickUnit(10);

        Text notificationsLabel = new Text("Notifications");
        notificationsLabel.setFont(font1);

        ToggleGroup notif = new ToggleGroup();
        RadioButton On = new RadioButton("On");
        On.setToggleGroup(notif);
        On.setFont(font3);
        RadioButton Off = new RadioButton("Off");
        Off.setToggleGroup(notif);
        Off.setFont(font3);

        Text languageLabel = new Text("Language");
        languageLabel.setFont(font1);

        ChoiceBox languagechoiceBox = new ChoiceBox();
        languagechoiceBox.getItems().addAll("English", "French", "Romanian", "Mandarin Chinese", "Japanese");

        DropShadow dropShadow3= new DropShadow();
        dropShadow3.setRadius(10);
        dropShadow3.setOffsetX(5);
        dropShadow3.setOffsetY(5);
        dropShadow3.setColor(Color.web("#97839C"));


        Button buttonOk = new Button("OK");
        buttonOk.setStyle("-fx-background-color: #ffd0b5; -fx-textfill: black;");
        buttonOk.setFont(font1);
        buttonOk.setWrapText(true);
        buttonOk.setMaxSize(300, 200);
        buttonOk.setEffect(dropShadow3);


        GridPane gridPane = new GridPane();
        GridPane gridPane1 = new GridPane();


        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(30);
        gridPane.setHgap(10);
        gridPane.setAlignment(CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(label, 1, 0 );
        gridPane.add(musicLabel, 0, 2);
        gridPane.add(musicSlider, 2, 2);
        gridPane.add(soundLabel, 0, 3);
        gridPane.add(soundSlider, 2, 3);
        gridPane.add(notificationsLabel, 0, 4);
        gridPane.add(On, 2, 4);
        gridPane.add(Off, 3, 4);
        gridPane.add(languageLabel, 0, 5);
        gridPane.add(languagechoiceBox, 2, 5);
        gridPane.add(buttonOk, 3, 8);


        //Setting the back ground color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Game Republic Settings");
        stage.setMaximized(true);
        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}