package application;

//import entities.ControllerEntity;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;
import userdata.KeyPolling;
//import view.ViewManager;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	 @Override
	 public void start(Stage primaryStage) throws Exception {
		 /*try {
				ViewManager manager = new ViewManager();
				primaryStage = manager.getMainStage();
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		 */
		 Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
	     Scene scene = new Scene(root);

	     KeyPolling.getInstance().pollScene(scene);

	     primaryStage.setScene(scene);
	     primaryStage.setTitle("Demo");

	     //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/EdenCodingIcon.png")));

	     primaryStage.setScene(scene);
	     
	     primaryStage.show();
	 }
}
