package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;

import static com.code.FirstExample.DB_URL;
import static com.code.FirstExample.PASS;
import static com.code.FirstExample.USER;

// RestTemplate
/*
import com.credera.BarService.BarRequest;
import com.credera.BarService.BarResponse;
*/

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	// Maps a url after podsurfer-g4.herokuapp.com,
	// so here its podsurfer-g4.herokuapp.com/loginAPI
	// This also sets up for it to receive via POST
	@RequestMapping(value = "/loginAPI", method = RequestMethod.GET) //headers = "Accept=application/json")
	@ResponseBody
	public well testingJDBC() { //@RequestBody LoginRequest loginRequest) {
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
			String sql;
			sql = "SELECT * FROM ritSpaGee.Well";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			while (rs.next()) {
				//Retrieve by column name
				int id = rs.getInt("wellID");
				String state = rs.getString("state");
				String country = rs.getString("country");
				String aquafier_code = rs.getString("aquafier_code");

				//Display values
				System.out.print("wellID: " + id);
				System.out.print(", state: " + state);
				System.out.print(", country: " + country);
				System.out.println(", aquafier_code: " + aquafier_code);
				wells = new well(id, state, country, aquafier_code);
			}
			//STEP 6: Clean-up environment
			rs.close();
			return wells;
//			stmt.close();
//			conn.close();
//			return temp;
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
		System.out.println("Goodbye!");
		return null;
	}//end main
}
//		String email = loginRequest.getEmail();
//		String password = loginRequest.getPassword();
//
//		// Debug output email and password for testing
//		System.out.println(email);
//		System.out.println(password);
//
//    	// URL to Credera API - Login Existing User POST
//    	final String uri = "https://podsurfer-4.herokuapp.com/auth/local/";
//
//    	// Setup some parameter mapping for the API parameters
//    	MultiValueMap<String, String> loginParameters = new LinkedMultiValueMap<String, String>();
//    	loginParameters.add("email", email);
//    	loginParameters.add("password", password);
//
//    	// Declare a Rest Template to Post to the Credera API
//    	RestTemplate restTemplate = new RestTemplate();
//
//    	// POST Statement function from the restTemplate
//    	// It stores the token in result and sends it back as a string
//    	String result = restTemplate.postForObject(uri, loginParameters, String.class);
//
//    	return result;
//	}
//}