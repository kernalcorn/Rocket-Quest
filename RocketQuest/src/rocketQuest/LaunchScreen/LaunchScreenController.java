package rocketQuest.LaunchScreen;

import rocketQuest.Main;
<<<<<<< HEAD
import javafx.animation.AnimationTimer;
=======

import java.io.IOException;

>>>>>>> branch 'master' of https://github.com/kernalcorn/Rocket-Quest.git
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LaunchScreenController {

	private Main mainApp;
	
	@FXML
	private ImageView imgRocket;
	
	@FXML
	private ImageView imgWorkshop;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private Label lblHeight;
	
	@FXML
	private Label lblScore;
	
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
			
			if(elapsedseconds == tickerTime)
			{	
				tickerTime++;
				
				if(tickerTime == 9)
				{
					tickerTime = 0;
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
	
	public LaunchScreenController()
	{
		
	}
	
	@FXML
<<<<<<< HEAD
	private void initialize()
	{
		
=======
	public void handleWorkshopSwitch() throws IOException
	{
		Main.showWorkshopScreen();
>>>>>>> branch 'master' of https://github.com/kernalcorn/Rocket-Quest.git
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
}
