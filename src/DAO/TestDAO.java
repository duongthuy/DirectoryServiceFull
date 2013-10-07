package DAO;

import Entities.Address;
import Entities.Country;
import Entities.County;
import Entities.Town;

public class TestDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Address ad = new AddressDAO().getAddress(3);
		Town t = new TownDAO().getTown(ad.getTownID());
		County ct = new CountyDAO().getCounty(ad.getTownID());
		Country c = new CountryDAO().getCountry(ad.getCountryID());
		System.out.println(ad.getAddressName()+" "+t.getTownName()+" "+ct.getCountyName()+" "+c.getCountryName());
	}

}
