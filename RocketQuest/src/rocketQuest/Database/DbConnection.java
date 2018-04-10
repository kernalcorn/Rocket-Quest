package rocketQuest.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


import javax.print.attribute.standard.DateTimeAtCompleted;

public class DbConnection 
{
 	private Connection connect = null;
 	private Statement statement = null;
 	private PreparedStatement preparedStatement = null;
 	private ResultSet resultSet = null;
 	
 	public Save readSavestateResultSet() throws SQLException
 	{
 		//begins the connection to the database with the specified query
 		openConnection("SELECT * FROM savestates ORDER BY saveSlot DESC LIMIT 1");
 		
 		Save save = new Save();
 		
 		while (resultSet.next())
 		{
 			int slot = resultSet.getInt("saveSlot");
 			int money = resultSet.getInt("Money");
 			int highScore = resultSet.getInt("HighScore");
 			int equippedBody = resultSet.getInt("EquippedBody");
 			int equippedTank = resultSet.getInt("EquippedTank");
 			int equippedBooster = resultSet.getInt("EquippedBooster");
 			int equippedNoseCap = resultSet.getInt("EquippedNoseCap");
 			int equippedFins = resultSet.getInt("EquippedFins");
 			boolean bodyT1 = resultSet.getBoolean("BodyT1");
 			boolean bodyT2 = resultSet.getBoolean("BodyT2");
 			boolean bodyT3 = resultSet.getBoolean("BodyT3");
 			boolean tankT1 = resultSet.getBoolean("TankT1");
 			boolean tankT2 = resultSet.getBoolean("TankT2");
 			boolean tankT3 = resultSet.getBoolean("TankT3");
 			boolean boosterT1 = resultSet.getBoolean("BoosterT1");
 			boolean boosterT2 = resultSet.getBoolean("BoosterT2");
 			boolean boosterT3 = resultSet.getBoolean("BoosterT3");
 			boolean noseCapT1 = resultSet.getBoolean("NoseCapT1");
 			boolean noseCapT2 = resultSet.getBoolean("NoseCapT2");
 			boolean noseCapT3 = resultSet.getBoolean("NoseCapT3");
 			boolean finsT1 = resultSet.getBoolean("FinsT1");
 			boolean finsT2 = resultSet.getBoolean("FinsT2");
 			boolean finsT3 = resultSet.getBoolean("FinsT3");
 			
 			save = new Save(slot, money, highScore, equippedBody, equippedTank, equippedBooster, equippedNoseCap, equippedFins, bodyT1, bodyT2, bodyT3, tankT1, tankT2, tankT3, boosterT1, boosterT2, boosterT3, noseCapT1, noseCapT2, noseCapT3, finsT1, finsT2, finsT3);
 		}
 		
 		closeConnection();
 		
 		return save;
 	}
 	
 	public void newSave(Save newSavestate) throws SQLException
 	{
 		//opens the connection to the database
 		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rocketquest?" + "user=root&password=ruby21400"); 		
		preparedStatement = connect.prepareStatement("INSERT INTO savestates (saveSlot, Money, HighScore, "
 					 + "EquippedBody, EquippedTank, EquippedBooster, EquippedNoseCap, EquippedFins, "
 					 + "BodyT1, BodyT2, BodyT3, TankT1, TankT2, TankT3, BoosterT1, BoosterT2, BoosterT3, "
 					 + "NoseCapT1, NoseCapT2, NoseCapT3, FinsT1, FinsT2, FinsT3)"
 					 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		//sets all the values to be inserted into the database
		preparedStatement.setInt(1, newSavestate.getSlot() + 1);
		preparedStatement.setInt(2, newSavestate.getMoney());
		preparedStatement.setInt(3, newSavestate.getHighScore());
		preparedStatement.setInt(4, newSavestate.getEquippedBody());
		preparedStatement.setInt(5, newSavestate.getEquippedTank());
		preparedStatement.setInt(6, newSavestate.getEquippedBooster());
		preparedStatement.setInt(7, newSavestate.getEquippedNoseCap());
		preparedStatement.setInt(8, newSavestate.getEquippedFins());
		preparedStatement.setBoolean(9, newSavestate.isBodyT1());
		preparedStatement.setBoolean(10, newSavestate.isBodyT2());
		preparedStatement.setBoolean(11, newSavestate.isBodyT3());
		preparedStatement.setBoolean(12, newSavestate.isTankT1());
		preparedStatement.setBoolean(13, newSavestate.isTankT2());
		preparedStatement.setBoolean(14, newSavestate.isTankT3());
		preparedStatement.setBoolean(15, newSavestate.isBoosterT1());
		preparedStatement.setBoolean(16, newSavestate.isBoosterT2());
		preparedStatement.setBoolean(17, newSavestate.isBoosterT3());
		preparedStatement.setBoolean(18, newSavestate.isNoseCapT1());
		preparedStatement.setBoolean(19, newSavestate.isNoseCapT2());
		preparedStatement.setBoolean(20, newSavestate.isNoseCapT3());
		preparedStatement.setBoolean(21, newSavestate.isFinsT1());
		preparedStatement.setBoolean(22, newSavestate.isFinsT2());
		preparedStatement.setBoolean(23, newSavestate.isFinsT3());
		
		//executes the sql query
 		preparedStatement.executeUpdate();
 		
 		//closes the database connection
 		preparedStatement.close();
 		connect.close();
 	}
 	
 	//must always be called with appropriate query before using a database
 	private void openConnection(String query) throws SQLException
	{
 		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rocketquest?" + "user=root&password=ruby21400");
		statement = connect.createStatement();
		resultSet = statement.executeQuery(query);
	}
 	
 	//must always use after data has been pulled or entered into database
 	private void closeConnection() throws SQLException
 	{
 		resultSet.close();
 		statement.close();
 		connect.close();
 	}

	 	
}


































