package com.code;

/**
 * Created by Sparky on 4/22/17.
 */
public class well {
	int wellID;
	String state;
	String country;
	String aquafier_code;

	public well() {

	}

	public well(int id, String st, String cn, String aquaCode) {
		this.wellID = id;
		this.state = st;
		this.country = cn;
		this.aquafier_code = aquaCode;
	}

	public void setWellID(int id) {
		this.wellID = id;
	}

	public int getWellID() {return this.wellID;}

	public void setCountry(String cn) {this.country = cn;}

	public String getCountry() {
		return this.country;
	}

	public void setState(String st) {
		this.state = st;
	}

	public String getState() {
		return this.state;
	}

	public void setAquafier_code(String aquaCode) {
		this.aquafier_code = aquaCode;
	}

	public String getAquafier_code() {
		return this.aquafier_code;
	}
}
