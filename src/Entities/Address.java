package Entities;

public class Address {
	private int addressID;
	private String postCode;
	private int townID;
	private int countyID;
	private int countryID;
	private String addressName;
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
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
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
}
