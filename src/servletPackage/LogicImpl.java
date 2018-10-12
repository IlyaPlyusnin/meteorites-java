package servletPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogicImpl {
	HttpServletRequest request=null;
	HttpServletResponse response=null;
	PersistImpl persist = null;
	
	public LogicImpl(HttpServletRequest req, HttpServletResponse res, Connection con){
		request = req;
		response= res;
		persist = new PersistImpl(con);
	} //constructor
	
	public ArrayList<Meteorite> getByName(String name){
		ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
		
		ResultSet rs = persist.getByName(name);
		
		try {
			while(rs.next()) {
				Meteorite met = new Meteorite();
				met.setLatitude(rs.getDouble("reclat"));
				met.setLongitude(rs.getDouble("reclong"));
				met.setDescription(rs.getString("name"));
				met.setYear(rs.getInt("year"));
				met.setMass(rs.getDouble("mass"));
				if(met.getLatitude() != 0 && met.getLongitude() != 0) {
					meteorites.add(met);
				}
			}
		}
		catch(SQLException e) {
			System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
		}
		
		return meteorites;
	}
	
	public ArrayList<Meteorite> getByYear(String year, String y){
		
		ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
		
		ResultSet rs = persist.getByYear(y, year);
		
		try {
			while(rs.next()) {
				Meteorite met = new Meteorite();
				met.setLatitude(rs.getDouble("reclat"));
				met.setLongitude(rs.getDouble("reclong"));
				met.setDescription(rs.getString("name"));
				met.setYear(rs.getInt("year"));
				met.setMass(rs.getDouble("mass"));
				if(met.getLatitude() != 0 && met.getLongitude() != 0) {
					meteorites.add(met);
				}
			}
		}
		catch(SQLException e) {
			System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
		}
		
		return meteorites;
	}
	
public ArrayList<Meteorite> getByMass(String option, String mass){
		
		ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
		
		ResultSet rs = persist.getByMass(option, mass);
		
		try {
			while(rs.next()) {
				Meteorite met = new Meteorite();
				met.setLatitude(rs.getDouble("reclat"));
				met.setLongitude(rs.getDouble("reclong"));
				met.setDescription(rs.getString("name"));
				met.setYear(rs.getInt("year"));
				met.setMass(rs.getDouble("mass"));
				if(met.getLatitude() != 0 && met.getLongitude() != 0) {
					meteorites.add(met);
				}
			}
		}
		catch(SQLException e) {
			System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
		}
		
		return meteorites;
	}

		public ArrayList<Meteorite> getAll(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getMeteorites();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
					
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}
		
		public ArrayList<Meteorite> getNA(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getNorthAmerica();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
					
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getNA
		
		public ArrayList<Meteorite> getSA(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getSouthAmerica();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
					
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getSA
		
		public ArrayList<Meteorite> getAnt(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getAnt();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
					
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getAnt
		
		public ArrayList<Meteorite> getAfrica(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getAfrica();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getAfrica
		
		public ArrayList<Meteorite> getAustralia(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getAustralia();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getAustralia
		
		public ArrayList<Meteorite> getEurope(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getEurope();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getAustralia
		
		public ArrayList<Meteorite> getAsia(){
			ArrayList<Meteorite> meteorites = new ArrayList<Meteorite>();
			
			ResultSet rs = persist.getAsia();
			
			try {
				while(rs.next()) {
					Meteorite met = new Meteorite();
					met.setLatitude(rs.getDouble("reclat"));
					met.setLongitude(rs.getDouble("reclong"));
					met.setDescription(rs.getString("name"));
					met.setYear(rs.getInt("year"));
					met.setMass(rs.getDouble("mass"));
					if(met.getLatitude() != 0 && met.getLongitude() != 0) {
						meteorites.add(met);
					}
				}
			}
			catch(SQLException e) {
				System.err.println("Couldn't get the resultset in LogicImpl "+ e.getMessage());
			}
			
			return meteorites;
		}//getAustralia
}
