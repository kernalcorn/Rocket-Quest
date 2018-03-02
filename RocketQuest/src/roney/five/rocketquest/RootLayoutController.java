package roney.five.rocketquest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootLayoutController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	public RootLayoutController()
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
