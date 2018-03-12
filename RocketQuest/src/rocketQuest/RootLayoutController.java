package rocketQuest;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class RootLayoutController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	public RootLayoutController()
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
		
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































