package rocketQuest.StoreScreen;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rocketQuest.Main;


public class StoreScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgBack;
	
	@FXML
	private ImageView imgMoney;
	
	@FXML
	private ImageView imgPartStats;
	
	@FXML
	private ImageView imgTier1;
	
	@FXML
	private ImageView imgTier2;
	
	@FXML
	private ImageView imgTier3;
	
	@FXML
	private ImageView imgBody;
	
	@FXML
	private ImageView imgBodyT1;
	
	@FXML
	private ImageView imgBodyT2;
	
	@FXML
	private ImageView imgBodyT3;
	
	@FXML
	private ImageView imgTank;
	
	@FXML
	private ImageView imgTankT1;
	
	@FXML
	private ImageView imgTankT2;
	
	@FXML
	private ImageView imgTankT3;
	
	@FXML
	private ImageView imgBooster;
	
	@FXML
	private ImageView imgBoostT1;
	
	@FXML
	private ImageView imgBoostT2;
	
	@FXML
	private ImageView imgBoostT3;
	
	@FXML
	private ImageView imgNoseCap;
	
	@FXML
	private ImageView imgNoseT1;
	
	@FXML
	private ImageView imgNoseT2;
	
	@FXML
	private ImageView imgNoseT3;
	
	@FXML
	private ImageView imgFins;
	
	@FXML
	private ImageView imgFinsT1;
	
	@FXML
	private ImageView imgFinsT2;
	
	@FXML
	private ImageView imgFinsT3;
	
	
	public StoreScreenController()
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
	private void handleBack()
	{
		//change screen to workshop screen
	}
	
	@FXML
	private void handleBodyT1()
	{
		//set Tier 1 body to own
		//subtract cost of Tier 1 body
	}
	
	@FXML
	private void handleBodyT2()
	{
		//set Tier 2 body to own
		//subtract cost of Tier 2 body
	}
	
	@FXML
	private void handleBodyT3()
	{
		//set Tier 3 body to own
		//subtract cost of Tier 3 body
	}
	
	@FXML
	private void handleTankT1()
	{
		//set Tier 1 tank to own
		//subtract cost of Tier 1 tank
	}
	
	@FXML
	private void handleTankT2()
	{
		//set Tier 2 tank to own
		//subtract cost of Tier 2 tank
	}
	
	@FXML
	private void handleTankT3()
	{
		//set Tier 3 tank to own
		//subtract cost of Tier 3 tank
	}
	
	@FXML
	private void handleBoostT1()
	{
		//set Tier 1 booster to own
		//subtract cost of Tier 1 booster
	}
	
	@FXML
	private void handleBoostT2()
	{
		//set Tier 2 booster to own
		//subtract cost of Tier 2 booster
	}
	
	@FXML
	private void handleBoostT3()
	{
		//set Tier 3 booster to own
		//subtract cost of Tier 3 booster
	}
	
	@FXML
	private void handleNoseT1()
	{
		//set Tier 1 nose cap to own
		//subtract cost of Tier 1 nose cap
	}
	
	@FXML
	private void handleNoseT2()
	{
		//set Tier 2 nose cap to own
		//subtract cost of Tier 2 nose cap
	}
	
	@FXML
	private void handleNoseT3()
	{
		//set Tier 3 nose cap to own
		//subtract cost of Tier 3 nose cap
	}
	
	@FXML
	private void handleFinsT1()
	{
		//set Tier 1 fins to own
		//subtract cost of Tier 1 fins
	}
	
	@FXML
	private void handleFinsT2()
	{
		//set Tier 2 fins to own
		//subtract cost of Tier 2 fins
	}
	
	@FXML
	private void handleFinsT3()
	{
		//set Tier 3 fins to own
		//subtract cost of Tier 3 fins
	}
	
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































