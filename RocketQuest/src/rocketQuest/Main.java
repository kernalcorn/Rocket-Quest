package rocketQuest;

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
	private static BorderPane mainLayout;
	
	public void start(Stage primaryStage)
	{
		try
		{
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Rocket Quest");
			//this.primaryStage.getIcons().add(new Image("file:resources/Application.png"));
			
			showMainView();
			showHomeScreen();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void showMainView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mainLayout.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showHomeScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("HomeScreen/RootLayout.fxml"));
		StackPane HomeScreen = loader.load();
		mainLayout.setCenter(HomeScreen);
	}
	

}
