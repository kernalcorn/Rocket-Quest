package rocketQuest.LaunchScreen;

import rocketQuest.Main;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LaunchScreenController {

	private Main mainApp;
	
	public LaunchScreenController()
	{
		
	}
	
	@FXML
	public void handleWorkshopSwitch() throws IOException
	{
		Main.showWorkshopScreen();
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
}
