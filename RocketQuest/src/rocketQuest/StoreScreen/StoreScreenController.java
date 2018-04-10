/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
StoreScreenController
 */

package rocketQuest.StoreScreen;

import java.io.IOException;
import java.sql.SQLException;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rocketQuest.Main;
import rocketQuest.Database.DbConnection;
import rocketQuest.Database.Save;
import rocketQuest.PartClasses.Body;
import rocketQuest.PartClasses.Booster;
import rocketQuest.PartClasses.Fins;
import rocketQuest.PartClasses.NoseCap;
import rocketQuest.PartClasses.Tank;


public class StoreScreenController 
{
	//reference field to the main app handle
	private Main mainApp;
	
	@FXML
	private Label lblMoney;
	
	@FXML
	private ImageView imgBackground;
	
	@FXML
	private ImageView imgBack;
	
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
	
	//creating our database connection object
	DbConnection rocketQuestDB = new DbConnection();
	
	Save playerSave = new Save();
	
	//objects for rocket parts
	Body tier1Body = new Body(9, 1, 1, "T1", 9);
	Body tier2Body = new Body(6, 2000, 2, "T2", 6);
	Body tier3Body = new Body(3, 5000, 3, "T3", 3);
	
	Booster tier1Booster = new Booster(3, 1, 1, "T1", 3);
	Booster tier2Booster = new Booster(5, 700, 2, "T2", 5);
	Booster tier3Booster = new Booster(8, 3000, 3, "T3", 8);
	
	Fins tier1Fins = new Fins(1, 1, 1, "T1", 1);
	Fins tier2Fins = new Fins(3, 500, 2, "T2", 3);
	Fins tier3Fins = new Fins(6, 2500, 3, "T3", 6);
	
	NoseCap tier1NoseCap = new NoseCap(7, 1, 1, "T1", 7);
	NoseCap tier2NoseCap = new NoseCap(5, 1200, 2, "T2", 5);
	NoseCap tier3NoseCap = new NoseCap(2, 4000, 3, "T3", 3);
	
	Tank tier1Tank = new Tank(2, 1, 1, "T1", 2);
	Tank tier2Tank = new Tank(3, 1500, 2, "T2", 3);
	Tank tier3Tank = new Tank(4, 4500, 3, "T3", 4);
	
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
		lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
	}
	
	@FXML
	private void handleWorkshopSwitch() throws IOException
	{
		Main.showWorkshopScreen();
	}
	
	
	@FXML
	private void handleBodyT2() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isBodyT2()) && (playerSave.getMoney() >= tier2Body.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setBodyT2(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier2Body.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBodyT3() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isBodyT3()) && (playerSave.getMoney() >= tier3Body.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setBodyT3(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier3Body.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleTankT2() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isTankT2()) && (playerSave.getMoney() >= tier2Tank.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setTankT2(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier2Tank.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleTankT3() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isTankT3()) && (playerSave.getMoney() >= tier3Tank.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setTankT3(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier3Tank.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBoostT2() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isBoosterT2()) && (playerSave.getMoney() >= tier2Booster.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setBoosterT2(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier2Booster.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleBoostT3() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isBoosterT3()) && (playerSave.getMoney() >= tier3Booster.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setBoosterT3(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier3Booster.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}

	@FXML
	private void handleNoseT2() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isNoseCapT2()) && (playerSave.getMoney() >= tier2NoseCap.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setNoseCapT2(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier2NoseCap.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleNoseT3() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isNoseCapT3()) && (playerSave.getMoney() >= tier3NoseCap.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setNoseCapT3(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier3NoseCap.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}

	@FXML
	private void handleFinsT2() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isFinsT2()) && (playerSave.getMoney() >= tier2Fins.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setFinsT2(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier2Fins.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	@FXML
	private void handleFinsT3() throws SQLException
	{
		//gets updated database data
		playerSave = rocketQuestDB.readSavestateResultSet();
		//tests if the player already owns the part
		if((!playerSave.isFinsT3()) && (playerSave.getMoney() >= tier3Fins.getPrice())) 
		{
			//sets the ownership to true
			playerSave.setFinsT3(true);
			//subtracts money
			playerSave.setMoney(playerSave.getMoney() - tier3Fins.getPrice());
			lblMoney.setText("$" + String.valueOf(playerSave.getMoney()));
			//adds new data to database
			rocketQuestDB.newSave(playerSave);
		}
	}
	
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
	
}



































