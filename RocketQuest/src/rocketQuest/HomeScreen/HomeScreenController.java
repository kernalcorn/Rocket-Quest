package rocketQuest.HomeScreen;

import java.io.IOException;
import java.sql.SQLException;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rocketQuest.Main;
import rocketQuest.Database.DbConnection;
import rocketQuest.Database.Save;


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
	
	DbConnection database = new DbConnection();
	
	public HomeScreenController()
	{
		
	}
	
	AnimationTimer stopwatch = new AnimationTimer() 
	{
	
		private static final long STOPPED = -1 ;
		private long startTime = STOPPED ;
		private int tickerTime = 0;
		
		@Override
		public void handle(long timestamp) 
		{
			if (startTime == STOPPED) 
			{
				startTime = timestamp ;
			}
			
			int elapsedseconds = (int) ((timestamp - startTime) /1000000000);
			
			if(elapsedseconds == tickerTime + 1)
			{
				tickerTime++;
				
				//imgBackground.setImage(new Image(testFrames[elapsedseconds]));
				
				if(elapsedseconds == 8)
				{
					stopwatch.stop();
					stopwatch.start();
				}
			}
			
			
			       
		}
	
		@Override
		public void stop() 
		{
			startTime = STOPPED ;
			super.stop();
			startTime = -1;
		}
	};
	
	@FXML
	private void initialize()
	{
		//stopwatch.start();
	}
	/*
	//changes the screen to the new game screen
	@FXML
	private void handleNewGame()
	{
		
	}
	*/
	//changes the screen to the workshop screen
	@FXML
	private void handleContinue()
	{
		
	}
	
	@FXML
	private void handleStartGame() throws IOException, SQLException
	{
		Main.showLaunchScreen();
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































