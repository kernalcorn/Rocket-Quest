package rocketQuest.Database;

import java.sql.SQLException;
import java.util.Date;

public class Save 
{
	private int slot;
	private int money;
	private int highScore;
	private int equippedBody;
	private int equippedTank;
	private int equippedBooster;
	private int equippedNoseCap;
	private int equippedFins;
	private boolean bodyT1;
	private boolean bodyT2;
	private boolean bodyT3;
	private boolean tankT1;
	private boolean tankT2;
	private boolean tankT3;
	private boolean boosterT1;
	private boolean boosterT2;
	private boolean boosterT3;
	private boolean noseCapT1;
	private boolean noseCapT2;
	private boolean noseCapT3;
	private boolean finsT1;
	private boolean finsT2;
	private boolean finsT3;
	
	
	
	public Save(int slot, int money, int highScore, int equippedBody, int equippedTank, int equippedBooster,
			int equippedNoseCap, int equippedFins, boolean bodyT1, boolean bodyT2, boolean bodyT3, boolean tankT1,
			boolean tankT2, boolean tankT3, boolean boosterT1, boolean boosterT2, boolean boosterT3, boolean noseCapT1,
			boolean noseCapT2, boolean noseCapT3, boolean finsT1, boolean finsT2, boolean finsT3) 
	{
		super();
		this.slot = slot;
		this.money = money;
		this.highScore = highScore;
		this.equippedBody = equippedBody;
		this.equippedTank = equippedTank;
		this.equippedBooster = equippedBooster;
		this.equippedNoseCap = equippedNoseCap;
		this.equippedFins = equippedFins;
		this.bodyT1 = bodyT1;
		this.bodyT2 = bodyT2;
		this.bodyT3 = bodyT3;
		this.tankT1 = tankT1;
		this.tankT2 = tankT2;
		this.tankT3 = tankT3;
		this.boosterT1 = boosterT1;
		this.boosterT2 = boosterT2;
		this.boosterT3 = boosterT3;
		this.noseCapT1 = noseCapT1;
		this.noseCapT2 = noseCapT2;
		this.noseCapT3 = noseCapT3;
		this.finsT1 = finsT1;
		this.finsT2 = finsT2;
		this.finsT3 = finsT3;
	}
	
	
	
	public Save() {
		super();
	}



	public int getSlot() {
		return slot;
	}
	
	public void setSlot(int slot) {
		this.slot = slot;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getHighScore() {
		return highScore;
	}
	
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	
	public int getEquippedBody() {
		return equippedBody;
	}
	
	public void setEquippedBody(int equippedBody) {
		this.equippedBody = equippedBody;
	}
	public int getEquippedTank() {
		return equippedTank;
	}
	public void setEquippedTank(int equippedTank) {
		this.equippedTank = equippedTank;
	}
	public int getEquippedBooster() {
		return equippedBooster;
	}
	public void setEquippedBooster(int equippedBooster) {
		this.equippedBooster = equippedBooster;
	}
	public int getEquippedNoseCap() {
		return equippedNoseCap;
	}
	public void setEquippedNoseCap(int equippedNoseCap) {
		this.equippedNoseCap = equippedNoseCap;
	}
	public int getEquippedFins() {
		return equippedFins;
	}
	public void setEquippedFins(int equippedFins) {
		this.equippedFins = equippedFins;
	}
	public boolean isBodyT1() {
		return bodyT1;
	}
	public void setBodyT1(boolean bodyT1) {
		this.bodyT1 = bodyT1;
	}
	public boolean isBodyT2() {
		return bodyT2;
	}
	public void setBodyT2(boolean bodyT2) {
		this.bodyT2 = bodyT2;
	}
	public boolean isBodyT3() {
		return bodyT3;
	}
	public void setBodyT3(boolean bodyT3) {
		this.bodyT3 = bodyT3;
	}
	public boolean isTankT1() {
		return tankT1;
	}
	public void setTankT1(boolean tankT1) {
		this.tankT1 = tankT1;
	}
	public boolean isTankT2() {
		return tankT2;
	}
	public void setTankT2(boolean tankT2) {
		this.tankT2 = tankT2;
	}
	public boolean isTankT3() {
		return tankT3;
	}
	public void setTankT3(boolean tankT3) {
		this.tankT3 = tankT3;
	}
	public boolean isBoosterT1() {
		return boosterT1;
	}
	public void setBoosterT1(boolean boosterT1) {
		this.boosterT1 = boosterT1;
	}
	public boolean isBoosterT2() {
		return boosterT2;
	}
	public void setBoosterT2(boolean boosterT2) {
		this.boosterT2 = boosterT2;
	}
	public boolean isBoosterT3() {
		return boosterT3;
	}
	public void setBoosterT3(boolean boosterT3) {
		this.boosterT3 = boosterT3;
	}
	public boolean isNoseCapT1() {
		return noseCapT1;
	}
	public void setNoseCapT1(boolean noseCapT1) {
		this.noseCapT1 = noseCapT1;
	}
	public boolean isNoseCapT2() {
		return noseCapT2;
	}
	public void setNoseCapT2(boolean noseCapT2) {
		this.noseCapT2 = noseCapT2;
	}
	public boolean isNoseCapT3() {
		return noseCapT3;
	}
	public void setNoseCapT3(boolean noseCapT3) {
		this.noseCapT3 = noseCapT3;
	}
	public boolean isFinsT1() {
		return finsT1;
	}
	public void setFinsT1(boolean finsT1) {
		this.finsT1 = finsT1;
	}
	public boolean isFinsT2() {
		return finsT2;
	}
	public void setFinsT2(boolean finsT2) {
		this.finsT2 = finsT2;
	}
	public boolean isFinsT3() {
		return finsT3;
	}
	public void setFinsT3(boolean finsT3) {
		this.finsT3 = finsT3;
	}
	
	public void getData() throws SQLException
	{
		DbConnection rocketQuestDB = new DbConnection();
		Save gameData = new Save();
		gameData = rocketQuestDB.readSavestateResultSet();
		//setting info fields with updates values
		setSlot(gameData.getSlot());
		setMoney(gameData.getMoney());
		setHighScore(gameData.getHighScore());
		//setting equipped fields with updated values
		setEquippedBody(gameData.getEquippedBody());
		setEquippedTank(gameData.getEquippedTank());
		setEquippedBooster(gameData.getEquippedBooster());
		setEquippedNoseCap(gameData.getEquippedNoseCap());
		setEquippedFins(gameData.getEquippedFins());
		//setting ownage fields with updated values
		setBodyT1(gameData.isBodyT1());
		setBodyT2(gameData.isBodyT2());
		setBodyT3(gameData.isBodyT3());
		setTankT1(gameData.isTankT1());
		setTankT2(gameData.isTankT2());
		setTankT3(gameData.isTankT3());
		setBoosterT1(gameData.isBoosterT1());
		setBoosterT2(gameData.isBoosterT2());
		setBoosterT3(gameData.isBoosterT3());
		setNoseCapT1(gameData.isNoseCapT1());
		setNoseCapT2(gameData.isNoseCapT2());
		setNoseCapT3(gameData.isNoseCapT3());
		setFinsT1(gameData.isFinsT1());
		setFinsT2(gameData.isFinsT2());
		setFinsT3(gameData.isFinsT3());
	}
	
	public void pushData() throws SQLException
	{
		DbConnection rocketQuestDB = new DbConnection();
		Save gameData = new Save(slot, money, highScore, 
				 				 equippedBody, equippedTank, equippedBooster, equippedNoseCap, equippedFins, 
				 				 bodyT1, bodyT2, bodyT3, 
				 				 tankT1, tankT2, tankT3, 
				 				 boosterT1, boosterT2, boosterT3, 
				 				 noseCapT1, noseCapT2, noseCapT3, 
				 				 finsT1, finsT2, finsT3);
		rocketQuestDB.newSave(gameData);
	}
}




































