/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
Main
 */

package rocketQuest;

import java.io.IOException;
import java.util.Date;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import rocketQuest.Database.Save;
import rocketQuest.PartClasses.Body;
import rocketQuest.PartClasses.Booster;
import rocketQuest.PartClasses.Fins;
import rocketQuest.PartClasses.NoseCap;
import rocketQuest.PartClasses.Rocket;
import rocketQuest.PartClasses.Tank;

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
	
	//displays the main fxml file 
	public void showMainView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mainLayout.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//displays the home screen fxml file
	public static void showHomeScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("HomeScreen/HomeScreen.fxml"));
		StackPane HomeScreen = loader.load();
		mainLayout.setCenter(HomeScreen);
	}
	
	//displays the launch screen fxml file
	public static void showLaunchScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("LaunchScreen/LaunchScreen.fxml"));
		StackPane LaunchScreen = loader.load();
		mainLayout.setCenter(LaunchScreen);
	}
	
	//displays the post flight screen fxml file
	public static void showPostFlightScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("PostFlightScreen/PostFlightScreen.fxml"));
		StackPane PostFlightScreen = loader.load();
		mainLayout.setCenter(PostFlightScreen);
	}
	
	//displays the store screen fxml file
	public static void showStoreScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("StoreScreen/StoreScreen.fxml"));
		StackPane StoreScreen = loader.load();
		mainLayout.setCenter(StoreScreen);
	}
	
	//displays the workshop screen fxml file
	public static void showWorkshopScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("WorkshopScreen/WorkshopScreen.fxml"));
		StackPane WorkshopScreen = loader.load();
		mainLayout.setCenter(WorkshopScreen);
	}
}


























