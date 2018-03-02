package roney.five.rocketquest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


import javax.print.attribute.standard.DateTimeAtCompleted;

public class sqlConnection 
{
 	private Connection connect = null;
 	private Statement statement = null;
 	private PreparedStatement preparedStatement = null;
 	private ResultSet gamesResultSet = null;
 	private ResultSet savestatesResultSet = null;
 	
 	public void readDatabase() throws Exception
 	{
 		try 
 		{
 			//loads the mysql driver
 			Class.forName("com.mysql.jdbc.Driver");
 			
 			//sets connection with the Database
 			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/rocketquest?" + "user=root&password=ruby21400");
 			
 			//
 			statement = connect.createStatement();
 			
 			//
 			gamesResultSet = statement.executeQuery("select * from rocketquest.games");
 			savestatesResultSet = statement.executeQuery("select * from rocketquest.savestate");
 			
 			
 		}
 		catch(Exception e)
 		{
 			throw e;
 		}
 		finally
 		{
 			closeGames();
 		}
 	}
 	
 	private void writeGamesResultSet(ResultSet games) throws SQLException 
 	{
 		// ResultSet is initially before the first data set
 		while (games.next()) 
 		{
 			// It is possible to get the columns via name
 			// also possible to get the columns via the column number
 			// which starts at 1
 			// e.g. resultSet.getSTring(2);
 			
 			String playerName = games.getString("PlayerName");
 			String gender = games.getString("Gender");
 			Date dateCreated = games.getDate("DateCreated");
 			
 			System.out.println("PlayerName: " + playerName);
 			System.out.println("Gender: " + gender);
 			System.out.println("dateCreated " + dateCreated);
 			
 		}
 	}
 	
 	private void writeSavestateResultSet(ResultSet savestate) throws SQLException
 	{
 		while (savestate.next())
 		{
 			Date dateSaved = savestate.getDate("DateSaved");
 			int money = savestate.getInt("Money");
 			int highScore = savestate.getInt("HighScore");
 			int equippedBody = savestate.getInt("EquippedBody");
 			int equippedTank = savestate.getInt("EquippedTank");
 			int equippedBooster = savestate.getInt("EquippedBooster");
 			int equippedNoseCap = savestate.getInt("EquippedNoseCap");
 			int equippedFins = savestate.getInt("EquippedFins");
 			boolean bodyT1 = savestate.getBoolean("BodyT1");
 			boolean bodyT2 = savestate.getBoolean("BodyT2");
 			boolean bodyT3 = savestate.getBoolean("BodyT3");
 			boolean tankT1 = savestate.getBoolean("TankT1");
 			boolean tankT2 = savestate.getBoolean("TankT2");
 			boolean tankT3 = savestate.getBoolean("TankT3");
 			boolean boosterT1 = savestate.getBoolean("BoosterT1");
 			boolean boosterT2 = savestate.getBoolean("BoosterT2");
 			boolean boosterT3 = savestate.getBoolean("BoosterT3");
 			boolean noseCapT1 = savestate.getBoolean("NoseCapT1");
 			boolean noseCapT2 = savestate.getBoolean("NoseCapT2");
 			boolean noseCapT3 = savestate.getBoolean("NoseCapT3");
 			boolean finsT1 = savestate.getBoolean("FinsT1");
 			boolean finsT2 = savestate.getBoolean("FinsT2");
 			boolean finsT3 = savestate.getBoolean("FinsT3");
 			
 		}
 	}
 	
 	private void closeGames() {
        try {
            if (gamesResultSet != null) {
                gamesResultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

	 	
}


































