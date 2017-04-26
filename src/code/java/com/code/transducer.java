package com.code;

/**
 * Created by Sparky on 4/25/17.
 */
public class transducer {
    String transID;
    String wellID;
    String name;
    String type;

    public transducer(String transID, String wellID, String name, String type) {
        this.transID = transID;
        this.wellID = wellID;
        this.name = name;
        this.type = type;
    }

    public String getTransID() {return transID; }

    public void setTransID(String transID) {this.transID = transID; }

    public String getWellID() {
        return wellID;
    }

    public void setWellID(String wellID) {
        this.wellID = wellID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
