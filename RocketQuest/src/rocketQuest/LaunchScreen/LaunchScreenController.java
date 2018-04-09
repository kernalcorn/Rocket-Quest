package rocketQuest.LaunchScreen;

import rocketQuest.Main;
import rocketQuest.Database.DbConnection;
import rocketQuest.Database.Save;
import rocketQuest.PartClasses.Body;
import rocketQuest.PartClasses.Booster;
import rocketQuest.PartClasses.Fins;
import rocketQuest.PartClasses.NoseCap;
import rocketQuest.PartClasses.Rocket;
import rocketQuest.PartClasses.Tank;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;

import java.io.IOException;
import java.sql.SQLException;

import rocketQuest.Main;
import javafx.animation.AnimationTimer;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;

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
	
	@FXML
	private ImageView imgLaunch;
	
	private int height;
	
	//creating our database connection object
	DbConnection rocketQuestDB = new DbConnection();
	
	Save playerSave = new Save();
	
	String rocketConfig;
	
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
	
	Rocket playerRocket = new Rocket(tier1Body, tier1Tank, tier1Booster, tier1NoseCap, tier1Fins);

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
	private void initialize() throws SQLException
	{
		playerSave = rocketQuestDB.readSavestateResultSet();
		rocketConfig = "b" + String.valueOf(playerSave.getEquippedBody()) + 
					   "n" + String.valueOf(playerSave.getEquippedNoseCap()) + 
					   "f" + String.valueOf(playerSave.getEquippedFins());
		imgRocket.setImage(new Image("file:images/RocketPNGS/" + rocketConfig + ".png"));
		
		//pulls currently equipped body and builds the player rocket with it
		switch(playerSave.getEquippedBody()) {
			case 1:
				playerRocket.setBody(tier1Body);
				break;
			case 2:
				playerRocket.setBody(tier2Body);
				break;
			case 3:
				playerRocket.setBody(tier3Body);
				break;
		}
		
		//pulls currently equipped tank and builds the player rocket with it
		switch(playerSave.getEquippedTank()) {
			case 1:
				playerRocket.setTank(tier1Tank);
				break;
			case 2:
				playerRocket.setTank(tier2Tank);
				break;
			case 3:
				playerRocket.setTank(tier3Tank);
				break;
		}
		
		//pulls currently equipped booster and builds the player rocket with it
		switch(playerSave.getEquippedBooster()) {
			case 1:
				playerRocket.setBooster(tier1Booster);
				break;
			case 2:
				playerRocket.setBooster(tier2Booster);
				break;
			case 3:
				playerRocket.setBooster(tier3Booster);
				break;
		}
		
		//pulls currently equipped fins and builds the player rocket with it
		switch(playerSave.getEquippedFins()) {
			case 1:
				playerRocket.setFins(tier1Fins);
				break;
			case 2:
				playerRocket.setFins(tier2Fins);
				break;
			case 3:
				playerRocket.setFins(tier3Fins);
				break;
		}
		
		//pulls currently equipped nose cap and builds the player rocket with it
		switch(playerSave.getEquippedNoseCap()) {
			case 1:
				playerRocket.setNoseCap(tier1NoseCap);
				break;
			case 2:
				playerRocket.setNoseCap(tier2NoseCap);
				break;
			case 3:
				playerRocket.setNoseCap(tier3NoseCap);
				break;
		}
	}
	
	public void handleWorkshopSwitch() throws IOException
	{
		Main.showWorkshopScreen();
	}
	
	//animates the rocket up and back down when launching the rocket
	public void handleLaunch()
	{
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.seconds(5));
		transition.setNode(imgRocket);
		transition.setToY(-400);
		
		TranslateTransition transition2 = new TranslateTransition();
		transition2.setDuration(Duration.seconds(2));
		transition2.setNode(imgRocket);
		transition2.setToY(+10);
		
		SequentialTransition move = new SequentialTransition(transition, transition2);
		move.play();
		
		heightCalc();
		lblHeight.setText(String.valueOf(height));
	}
	
	//calculates the height of the rocket for each flight based on the parts equipped in workshop
	public void heightCalc()
	{
		System.out.println(String.valueOf(playerRocket.getBody().getWeight()));
		height = (playerRocket.getFins().getStability() + playerRocket.getTank().getFuelCapacity() + ( 10 - playerRocket.getBody().getWeight()) + playerRocket.getBooster().getThrust() + (10 - playerRocket.getNoseCap().getDrag()));
	}
	
	public void setMainApp(Main mainApp) 
	{
		this.mainApp = mainApp;
	}
}
