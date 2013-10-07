package Entities;

public class Town {
	private int townID;
	private int countyID;
	private int countryID;
	private String townName;
	public int getTownID() {
		return townID;
	}
	public void setTownID(int townID) {
		this.townID = townID;
	}
	public int getCountyID() {
		return countyID;
	}
	public void setCountyID(int countyID) {
		this.countyID = countyID;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	
}
