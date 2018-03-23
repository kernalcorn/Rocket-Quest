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
		loader.setLocation(Main.class.getResource("HomeScreen/HomeScreen.fxml"));
		StackPane HomeScreen = loader.load();
		mainLayout.setCenter(HomeScreen);
	}
	
	public static void showLaunchScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("LaunchScreen/LaunchScreen.fxml"));
		StackPane LaunchScreen = loader.load();
		mainLayout.setCenter(LaunchScreen);
	}
	
	public static void showPostFlightScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("PostFlightScreen/PostFlightScreen.fxml"));
		StackPane PostFlightScreen = loader.load();
		mainLayout.setCenter(PostFlightScreen);
	}
	
	public static void showStoreScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("StoreScreen/StoreScreen.fxml"));
		StackPane StoreScreen = loader.load();
		mainLayout.setCenter(StoreScreen);
	}
	
	public static void showWorkshopScreen() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("WorkshopScreen/WorkshopScreen.fxml"));
		StackPane WorkshopScreen = loader.load();
		mainLayout.setCenter(WorkshopScreen);
	}
	
	Body tier1Body = new Body(1, 1, 1, "T1", 1);
	Body tier2Body = new Body(1, 1, 2, "T2", 1);
	Body tier3Body = new Body(1, 1, 3, "T3", 1);
	
	Booster tier1Booster = new Booster(1, 1, 1, "T1", 1);
	Booster tier2Booster = new Booster(1, 1, 2, "T2", 1);
	Booster tier3Booster = new Booster(1, 1, 3, "T3", 1);
	
	Fins tier1Fins = new Fins(1, 1, 1, "T1", 1);
	Fins tier2Fins = new Fins(1, 1, 2, "T2", 1);
	Fins tier3Fins = new Fins(1, 1, 3, "T3", 1);
	
	NoseCap tier1NoseCap = new NoseCap(1, 1, 1, "T1", 1);
	NoseCap tier2NoseCap = new NoseCap(1, 1, 2, "T2", 1);
	NoseCap tier3NoseCap = new NoseCap(1, 1, 3, "T3", 1);
	
	Tank tier1Tank = new Tank(1, 1, 1, "T1", 1);
	Tank tier2Tank = new Tank(1, 1, 2, "T2", 1);
	Tank tier3Tank = new Tank(1, 1, 3, "T3", 1);
	
	Date date = new Date();
	
	String bodyImgString = "b1";
	String noseCapImgString = "n1";
	String finsImgString = "f1";
	
	String rocketImage = bodyImgString + noseCapImgString + finsImgString;
	
	Save gameSave = new Save(date, 0, 0, 1, 1, 1, 1, 1, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
	
	public void newBodyEquipped(int tier)
	{
		bodyImgString = ("b" + String.valueOf(tier));
		rocketImage = bodyImgString + noseCapImgString + finsImgString;
		
		switch (tier) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
	
	public void newBoosterEquipped(int tier)
	{
		switch (tier) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
	
	public void newFinsEquipped(int tier)
	{
		finsImgString = ("f" + String.valueOf(tier));
		rocketImage = bodyImgString + noseCapImgString + finsImgString;
		
		switch (tier) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
	
	public void newNoseCapEquipped(int tier)
	{
		noseCapImgString = ("n" + String.valueOf(tier));
		rocketImage = bodyImgString + noseCapImgString + finsImgString;
		
		switch (tier) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
	
	public void newTankEquipped(int tier) 
	{
		switch (tier) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
	
	public String getRocketImageURL()
	{
		return ("file:images/RocketPNGS/" + rocketImage + ".png");
	}
}


























