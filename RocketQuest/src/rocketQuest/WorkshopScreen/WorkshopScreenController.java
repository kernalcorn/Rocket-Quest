package rocketQuest.WorkshopScreen;

import java.io.IOException;
import java.sql.SQLException;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rocketQuest.Main;
import rocketQuest.Database.DbConnection;
import rocketQuest.Database.Save;


public class WorkshopScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgStore;
	
	@FXML
	private ImageView imgMoney;
	
	@FXML
	private ImageView imgPartStats;
	
	@FXML
	private ImageView imgRocket;
	
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
	
	//creating our database connection object
	DbConnection rocketQuestDB = new DbConnection();
	
	Save playerSave = new Save();
	
	String rocketConfig;
	
	public WorkshopScreenController()
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
				
				//place animations here
				
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
	private void initialize() throws SQLException
	{
		playerSave = rocketQuestDB.readSavestateResultSet();
		rocketConfig = "b" + String.valueOf(playerSave.getEquippedBody()) + 
					   "n" + String.valueOf(playerSave.getEquippedNoseCap()) + 
					   "f" + String.valueOf(playerSave.getEquippedFins());
		imgRocket.setImage(new Image("file:images/RocketPNGS/" + rocketConfig + ".png"));
	}
	
	@FXML
	private void handleStore() throws IOException
	{
		Main.showStoreScreen();
	}
	
	@FXML
	private void handleLaunch() throws IOException
	{
		Main.showLaunchScreen();
	}
	@FXML
	private void handleBodyT1() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 1 body is owned and not equipped
		if((playerSave.getEquippedBody() != 1) && playerSave.isBodyT1())
		{
			//changes equipped body to 1, pushes to database and updates rocket image
			playerSave.setEquippedBody(1);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleBodyT2() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 2 body is owned and not equipped
		if((playerSave.getEquippedBody() != 2) && playerSave.isBodyT2())
		{
			//changes equipped body to 2, pushes to database and updates rocket image
			playerSave.setEquippedBody(2);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleBodyT3() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 3 body is owned and not equipped
		if((playerSave.getEquippedBody() != 3) && playerSave.isBodyT3())
		{
			//changes equipped body to 3, pushes to database and updates rocket image
			playerSave.setEquippedBody(3);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleTankT1() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 1 tank is owned and not equipped
		if((playerSave.getEquippedTank() != 1) && playerSave.isTankT1())
		{
			//changes equipped tank to 1 and pushes to database
			playerSave.setEquippedTank(1);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleTankT2() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 2 tank is owned and not equipped
		if((playerSave.getEquippedTank() != 2) && playerSave.isTankT2())
		{
			//changes equipped tank to 1 and pushes to database
			playerSave.setEquippedTank(2);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleTankT3() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 3 tank is owned and not equipped
		if((playerSave.getEquippedTank() != 3) && playerSave.isTankT3())
		{
			//changes equipped tank to 1 and pushes to database
			playerSave.setEquippedTank(3);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBoostT1() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 1 booster is owned and not equipped
		if((playerSave.getEquippedBooster() != 1) && playerSave.isBoosterT1())
		{
			//changes equipped booster to 1 and pushes to database
			playerSave.setEquippedBooster(1);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBoostT2() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 2 booster is owned and not equipped
		if((playerSave.getEquippedBooster() != 2) && playerSave.isBoosterT2())
		{
			//changes equipped booster to 1 and pushes to database
			playerSave.setEquippedBooster(2);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBoostT3() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 3 booster is owned and not equipped
		if((playerSave.getEquippedBooster() != 3) && playerSave.isBoosterT3())
		{
			//changes equipped booster to 3 and pushes to database
			playerSave.setEquippedBooster(3);
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleNoseT1() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 1 nose is owned and not equipped
		if((playerSave.getEquippedNoseCap() != 1) && playerSave.isNoseCapT1())
		{
			//changes equipped nose to 1, pushes to database and updates rocket image
			playerSave.setEquippedNoseCap(1);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleNoseT2() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 2 nose is owned and not equipped
		if((playerSave.getEquippedNoseCap() != 2) && playerSave.isNoseCapT2())
		{
			//changes equipped nose to 2, pushes to database and updates rocket image
			playerSave.setEquippedNoseCap(2);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleNoseT3() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 3 nose is owned and not equipped
		if((playerSave.getEquippedNoseCap() != 3) && playerSave.isNoseCapT3())
		{
			//changes equipped nose to 3, pushes to database and updates rocket image
			playerSave.setEquippedNoseCap(3);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleFinsT1() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 1 fins is owned and not equipped
		if((playerSave.getEquippedFins() != 1) && playerSave.isFinsT1())
		{
			//changes equipped fins to 1, pushes to database and updates rocket image
			playerSave.setEquippedFins(1);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleFinsT2() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 2 fins is owned and not equipped
		if((playerSave.getEquippedFins() != 2) && playerSave.isFinsT2())
		{
			//changes equipped fins to 2, pushes to database and updates rocket image
			playerSave.setEquippedFins(2);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	@FXML
	private void handleFinsT3() throws SQLException
	{
		//get database values
		playerSave = rocketQuestDB.readSavestateResultSet();
		
		//check if tier 3 fins is owned and not equipped
		if((playerSave.getEquippedFins() != 3) && playerSave.isFinsT3())
		{
			//changes equipped fins to 3, pushes to database and updates rocket image
			playerSave.setEquippedFins(3);
			rocketQuestDB.newSave(playerSave);
			updateRocketImage();
		}
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
	public void updateRocketImage() throws SQLException
	{
		playerSave = rocketQuestDB.readSavestateResultSet();
		rocketConfig = "b" + String.valueOf(playerSave.getEquippedBody()) + 
					   "n" + String.valueOf(playerSave.getEquippedNoseCap()) + 
					   "f" + String.valueOf(playerSave.getEquippedFins());
		imgRocket.setImage(new Image("file:images/RocketPNGS/" + rocketConfig + ".png"));
	}
}



































