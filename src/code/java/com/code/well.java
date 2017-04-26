package com.code;

/**
 * Created by Sparky on 4/22/17.
 */
public class well {
	int wellID;
	int ownerID;
	String usage;
	String type_code;
	String comment;
	double top_depth;
	double bottom_depth;
	double depth;
	double water_level_elevation;
	double land_elevation;
	double diameter;
	String casingID;
	String pump_description;
	double latitude;
	double longitude;
	String state;
	String country;
	String aquafier_code;

	public well(int wellID, int ownerID, String usage, String type_code, String comment, double top_depth, double bottom_depth, double depth, double water_level_elevation, double land_elevation, double diameter, String casingID, String pump_description, double latitude, double longitude, String state, String country, String aquafier_code) {
		this.wellID = wellID;
		this.ownerID = ownerID;
		this.usage = usage;
		this.type_code = type_code;
		this.comment = comment;
		this.top_depth = top_depth;
		this.bottom_depth = bottom_depth;
		this.depth = depth;
		this.water_level_elevation = water_level_elevation;
		this.land_elevation = land_elevation;
		this.diameter = diameter;
		this.casingID = casingID;
		this.pump_description = pump_description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.country = country;
		this.aquafier_code = aquafier_code;
	}

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

	public int getOwnerID() {return ownerID; }

	public void setOwnerID(int ownerID) { this.ownerID = ownerID; }

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getTop_depth() {
		return top_depth;
	}

	public void setTop_depth(double top_depth) {
		this.top_depth = top_depth;
	}

	public double getBottom_depth() {
		return bottom_depth;
	}

	public void setBottom_depth(double bottom_depth) {
		this.bottom_depth = bottom_depth;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWater_level_elevation() {
		return water_level_elevation;
	}

	public void setWater_level_elevation(double water_level_elevation) {
		this.water_level_elevation = water_level_elevation;
	}

	public double getLand_elevation() {
		return land_elevation;
	}

	public void setLand_elevation(double land_elevation) {
		this.land_elevation = land_elevation;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getCasingID() {
		return casingID;
	}

	public void setCasingID(String casingID) {
		this.casingID = casingID;
	}

	public String getPump_description() {
		return pump_description;
	}

	public void setPump_description(String pump_description) {
		this.pump_description = pump_description;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


}
