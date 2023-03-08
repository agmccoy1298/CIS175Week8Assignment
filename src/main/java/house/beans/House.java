package house.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */
@Entity
public class House {
	
	@Id
	@GeneratedValue
	private long id;
	private String houseName;
	private String city;
	private String street;
	private boolean hasGarage;
	
	
	//constructors
	public House() {
		super();
	}
	public House(long id, String houseName, String city, String street, boolean hasGarage) {
		this.id = id;
		this.houseName = houseName;
		this.city = city;
		this.street = street; 
	}
	public House(String houseName, String city, String street, boolean hasGarage) {
		this.houseName = houseName;
		this.city = city;
		this.street = street;
		this.hasGarage = hasGarage;
	}
	
	//getters and setters	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public boolean isHasGarage() {
		return hasGarage;
	}
	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}
	
	@Override
	public String toString() {
		return "House [id=" + id + ", houseName=" + houseName + ", city=" + city + ", street=" + street + ", hasGarage="
				+ hasGarage + "]";
	}
}
