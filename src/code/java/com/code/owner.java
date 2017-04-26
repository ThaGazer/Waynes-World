package com.code;

/**
 * Created by Sparky on 4/25/17.
 */
public class owner {

    String ownerID;
    String type;
    String name;

    public owner(String ownerID, String type, String name) {
        this.ownerID = ownerID;
        this.type = type;
        this.name = name;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
