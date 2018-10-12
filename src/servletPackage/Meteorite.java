package servletPackage;

public class Meteorite {
	double longitude;
	double latitude;
	String description = "";
	double mass;
	int year = 0;
	
	public void setMass(double m) {
		mass = m;
	}
	
	public void setLatitude(double lat) {
		latitude = lat;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public void setLongitude(double longi) {
		longitude = longi;
	}
	
	public void setDescription(String desc) {
		description = desc;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public String getDescription() {
		return description;
	}
	public int getYear() {
		return year;
	}
	
	public double getMass() {
		return mass;
	}
}
