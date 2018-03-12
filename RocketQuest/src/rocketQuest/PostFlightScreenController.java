package rocketQuest;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PostFlightScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgLaunch;
	
	@FXML
	private ImageView imgWorkshop;
	
	@FXML
	private ImageView imgScoreDisplay;
	
	@FXML
	private ImageView imgMoneyMade;
	
	public PostFlightScreenController()
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
	
	@FXML
	private void handleWorkshop()
	{
		//change screen to workshop
	}
	
	@FXML
	private void handleLaunch()
	{
		//change screen to launch
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































