package roney.five.rocketquest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HomeScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private ImageView imgNewGame;
	
	@FXML
	private ImageView imgContinue;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgLogo;
	
	public HomeScreenController()
	{
		
	}
	
	@FXML
	private void initialize()
	{
		
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}
