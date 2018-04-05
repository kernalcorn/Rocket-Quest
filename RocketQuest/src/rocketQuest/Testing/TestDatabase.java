package rocketQuest.Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Database Class
public class TestDatabase{
	//Private database attributes
	private Connection myConn;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rSet;
	
	//Write only attribute setters
	public void setMyConn(Connection myConn) {this.myConn = myConn;}
	
	public void setStmt(Statement stmt) {this.stmt = stmt;}

	public void setpStmt(PreparedStatement pStmt) {this.pStmt = pStmt;}
	
	public void setrSet(ResultSet rSet) {this.rSet = rSet;}
	
	//Full constructor
	public TestDatabase(Connection c, Statement s, PreparedStatement pS, ResultSet rS) {
		myConn = c;
		stmt = s;
		pStmt = pS;
		rSet = rS;
	}
	
	//Method to connect to the database
	public void connect() throws SQLException {myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inmates?autoReconnect=true&useSSL=false", "root", "2827");}
	
	//Method to select values given a specific query
	public ResultSet select(String query) throws SQLException {
		//Execute the query
		stmt = myConn.createStatement();
		rSet = stmt.executeQuery(query);
		//Return the result set
		return rSet;
	}
	
	//Method to update instruments table
	public void updateInstruments(String query) throws SQLException {
		//Prepared statements to update Instruments attributes
		pStmt = myConn.prepareStatement(query);
	    pStmt.executeUpdate();
	}
	
	//Method to update accessories table
	public void updateAccessories(String query) throws SQLException {
		//Prepared statements to update Accessories attributes
		pStmt = myConn.prepareStatement(query);
	    pStmt.executeUpdate();
	    
	}
	
	//Method to delete an instrument
	public void deleteInstruments(String query, int archive) throws SQLException {
		//Delete the instrument with the specific archive value (serial number)
		pStmt = myConn.prepareStatement(query);
		pStmt.setInt(10, archive);
		pStmt.executeUpdate();
	}
	
	//Method to delete an accessory
	public void deleteAccessories(String query, int archive) throws SQLException {
		//Delete the accessory with the specific archive value (serial number)
		pStmt = myConn.prepareStatement(query);
		pStmt.setInt(7, archive);
		pStmt.executeUpdate();
	}
}
