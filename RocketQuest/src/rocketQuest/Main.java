package rocketQuest;
//usudsji
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import rocketQuest.Main;
import rocketQuest.RootLayoutController;

public class Main extends Application
{
	private Stage primaryStage;
	private StackPane rootLayout;
	
	public void start(Stage primaryStage)
	{
		try
		{
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Rocket Quest");
			//this.primaryStage.getIcons().add(new Image("file:resources/Application.png"));
			
			initRootLayout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void initRootLayout()
	{
		try 
		{
			//Main initialization for the layout and app commencement
			
			//create an FXML loader
			FXMLLoader loader = new FXMLLoader();
			
			//point the loader at the FXML file
			loader.setLocation(Main.class.getResource("/rocketQuest/HomeScreen.FXML"));
			
			//Set the root layout field, casting as appropriate
			rootLayout = (StackPane) loader.load();
			
			//set the scene object to our root layout
			Scene scene = new Scene(rootLayout);
			
			//give controller to our application handle
			RootLayoutController controller = loader.getController();
			
			controller.setMainApp(this);
			
			//
			primaryStage.setScene(scene);
			
			//
			primaryStage.show();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
