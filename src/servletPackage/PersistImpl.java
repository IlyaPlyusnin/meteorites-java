package servletPackage;

import java.sql.Connection;
import java.sql.ResultSet;

public class PersistImpl {
	Connection connection = null;
	
	public PersistImpl(Connection con){
		connection = con;
	}//constructor
	
	public ResultSet getMeteorites() {
		String query =  "select * from meteorite";
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}
	
	public ResultSet getByName(String name) {
		String query =  "select * from meteorite where name = '"+name+"'";
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}
	public ResultSet getByYear(String y, String year) {
		int value = Integer.parseInt(y);
		String query = null;
		if(year.equals("equal")) {
			query = "select * from meteorite where year = "+value;
		}
		else if(year.equals("before")) {
			query = "select * from meteorite where year < "+value;
		}
		else if(year.equals("after")) {
			query = "select * from meteorite where year > "+value;
		}
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}
	
	public ResultSet getByMass(String option, String mass) {
		int m = Integer.parseInt(mass);
		String query = null;
		
		if(option.equals("equal")) {
			query = "select * from meteorite where mass = "+m;
		}
		else if(option.equals("less")) {
			query = "select * from meteorite where mass < "+m;
		}
		else if(option.equals("greater")) {
			query = "select * from meteorite where mass > "+m;
		}
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}
	
	public ResultSet getNorthAmerica() {
		String query = "select * from meteorite where reclat between 20 and 90 AND reclong BETWEEN -170 AND -40\r\n" + 
				"OR (reclat BETWEEN 70 and 90 AND reclong BETWEEN -140 and -110)\n" + 
				"OR (reclat BETWEEN 68 and 90 and reclong BETWEEN -40 and -20)\n" + 
				"OR (reclat BETWEEN 60 and 90 AND reclong BETWEEN -40 and -30) \n" + 
				"OR (reclat BETWEEN 13 and 90 AND reclong BETWEEN -120 and -60)\n" + 
				"OR (reclat BETWEEN 70 and 5 AND reclong BETWEEN -100 and -88)\n" + 
				"OR (reclat BETWEEN 50 and 80 AND reclong BETWEEN -140 and -160)\n" + 
				"OR (reclat BETWEEN 50 and 80 AND reclong BETWEEN -160 and -170);";
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getNorthAmerica
	
	public ResultSet getSouthAmerica() {
		String query = "select * from meteorite where reclat between -60 and 0 AND reclong BETWEEN -85 AND -30\r\n" + 
				"OR (reclat BETWEEN 0 and 10 AND reclong BETWEEN -60 and -40)\n" + 
				"OR (reclat BETWEEN 0 and 10 and reclong BETWEEN -60 and -75)\n" + 
				"OR (reclat BETWEEN 0 and 7 AND reclong BETWEEN -60 and -80) \n" + 
				"OR (reclat BETWEEN 10 and 14 AND reclong BETWEEN -60 and -75);";
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getSouthAmerica
	
	public ResultSet getAnt() {
		String query = "select * from meteorite where reclat between -90 and -60 AND reclong BETWEEN -180 AND 180;";
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getAnt
	
	public ResultSet getAfrica() {
		String query = "select * from meteorite where reclat between 0 and 30 AND reclong BETWEEN -20 AND 35\n" + 
				"OR (reclat BETWEEN 30 and 36 AND reclong BETWEEN -20 and 0)\n" + 
				"OR (reclat BETWEEN -40 and 37 and reclong BETWEEN 0 and 12)\n" + 
				"OR (reclat BETWEEN -40 and 35 AND reclong BETWEEN 12 and 20)\n"+
				"OR (reclat BETWEEN -40 and 33 AND reclong BETWEEN 20 and 35)\n" + 
				"OR (reclat BETWEEN 10 and 20 and reclong BETWEEN 20 and 40)\n" +
				"OR (reclat BETWEEN 0 and 12 AND reclong BETWEEN 40 and 60)\n" + 
				"OR (reclat BETWEEN -40 and 10 and reclong BETWEEN 20 and 60);" ;
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getAfrica
	public ResultSet getAustralia() {
		
		String query="select * from meteorite where reclat between -50 and -10 and reclong between 110 and 180 OR (reclat between -10 and 0 and reclong between 142 and 180);";
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}
	
	public ResultSet getEurope() {
		String query = "select * from meteorite where reclat between  60 and 70 AND reclong BETWEEN -25 AND 60\n" + 
				"OR (reclat BETWEEN 70 and 90 and reclong BETWEEN -10 and 70)\n" + 
				"OR (reclat BETWEEN 50 and 60 AND reclong BETWEEN -10 and 60)\n"+
				"OR (reclat BETWEEN 40 and 50 AND reclong BETWEEN -10 and 50)\n" + 
				"OR (reclat BETWEEN 35 and 40 and reclong BETWEEN -10 and 25);" ;
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getAfrica
	
	public ResultSet getAsia() {
		String query = "select * from meteorite where reclat between -10 and 65 AND reclong BETWEEN 60 AND 180\n" + 
				"OR (reclat BETWEEN 65 and 90 AND reclong BETWEEN 70 and 180)\n" + 
				"OR (reclat BETWEEN -10 and 65 and reclong BETWEEN 65 and 180)\n" + 
				"OR (reclat BETWEEN 20 and 40 AND reclong BETWEEN 40 and 60)\n"+
				"OR (reclat BETWEEN 15 and 20 AND reclong BETWEEN 40 and 60)\n" + 
				"OR (reclat BETWEEN 12 and 20 and reclong BETWEEN 45 and 60)\n" +
				"OR (reclat BETWEEN 40 and 50 AND reclong BETWEEN 50 and 60)\n" + 
				"OR (reclat BETWEEN 40 and 43 and reclong BETWEEN 40 and 60)" +
		"OR (reclat BETWEEN 35 and 43 and reclong BETWEEN 30 and 40);" ;
		
		ResultSet rs = DbAccessImpl.retrieve(connection, query);
		return rs;
	}//getAfrica
	
	
	
	
}
