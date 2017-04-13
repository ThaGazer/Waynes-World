//STEP 1. Import required packages
//package WaynesWorld;
import java.sql.*;

public class FirstExample {
    // JDBC driver name and database URL
    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://mama.c95cjqkvfcem.us-east-1.rds.amazonaws.com:3306";

    //  Database credentials
    static final String USER = "ritSpaGee";
    static final String PASS = "geeterman";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        System.out.println("look");
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM ritSpaGee.Well";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("wellID");
                String state = rs.getString("state");
                String country = rs.getString("country");
                String aquafier_code = rs.getString("aquafier_code");

                //Display values
                System.out.print("wellID: " + id);
                System.out.print(", state: " + state);
                System.out.print(", country: " + country);
                System.out.println(", aquafier_code: " + aquafier_code);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end FirstExample