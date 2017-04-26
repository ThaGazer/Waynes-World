package com.code;

/**
 * Created by Sparky on 4/24/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;

@Controller
public class Interactive_uploadController {

    static final String DB_URL = "jdbc:mysql://mama.c95cjqkvfcem.us-east-1.rds.amazonaws.com:3306";
    static final String USER = "ritSpaGee";
    static final String PASS = "geeterman";
//    @RequestMapping("/maps")
//    public @ResponseBody
//    String map()
//    {
//        return "map";
//    }

    @RequestMapping(value ="/updateDB", method= RequestMethod.POST, headers="Accept=application/json")
    @ResponseBody
    public String uploading(@RequestBody well we, transducer trans, owner ow) {
        String response = "failure";

        //Testing to see if all have default values, ergo no valid data entered.
        if (we.getWellID() == 9.5 && ow.getOwnerID() == 9.5 && trans.getTransID() == "Input") {
            response = "failure";
        } else {
            Connection conn = null;
            Statement stmt = null;
            well wells = new well();
            System.out.println("look");
            try {
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                //STEP 4: Execute a query
                System.out.println("Creating statement...");
                stmt = conn.createStatement();

                String sql = "";
                //Well input is present
                if(we.getWellID() != 9.5 && we.getDiameter() != -2) {
                    sql = "INSERT INTO ritSpaGee.Well (wellID, ownerID, usagee, aquafier_code, type_code, top_depth, "+
                            "bottom_depth, depth, bottom_elevation, water_level_elevation, land_elevation, diameter, " +
                            "casingID, state, country, latitude, longitude) VALUES (" + we.getWellID() +',' + we.getOwnerID() +',' +
                            we.getUsage() +',' + we.getAquafier_code() + ',' + we.getType_code() +',' + we.getTop_depth() +
                            we.getBottom_depth() + ',' + we.getDepth() + ',' + we.getBottom_elevation() + ',' + we.getWater_level_elevation() +
                            we.getLand_elevation() + ',' + we.getDiameter() + ',' + we.getCasingID() + ',' + we.getState() +
                            ',' + we.getCountry() + ',' + we.getLatitude() + ',' + we.getLongitude() + ");";
                    stmt.executeUpdate(sql);
                }
                //trans input present.
                if (trans.getTransID() != "1234abcd") {
                    sql = "INSERT INTO ritSpaGee.Transducer (transID, wellID, type, name) VALUES (" + trans.getTransID()
                            +',' + trans.getWellID() + ',' + trans.getType() + ',' + trans.getName() + ");" ;
                    stmt.executeUpdate(sql);
                }
                //Wwner input present
                if(ow.getOwnerID() != 9.5) {
                    sql = "INSERT INTO ritSpaGee.Owner (ownerID, type, name) VALUES (" + ow.getOwnerID() + ',' + ow.getType()
                            + ',' + ow.getName() +");";
                    stmt.executeUpdate(sql);
                }
            } catch (SQLException se) {
                //Handle errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                //Handle errors for Class.forName
                e.printStackTrace();
            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null)
                        stmt.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try
        }

        return response;
    }
}
