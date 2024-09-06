package ir.freeland.collection.personcollection;

import java.util.Objects;


public class Address implements Comparable<Address> {
    private String city;
    private String country;
    private String street;

    public Address(String city, String country, String street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", street=" + street + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(street, other.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, street);
	}
	
	 @Override
	    public int compareTo(Address other) {
	        return this.city.compareTo(other.city);
	    }

}

