//DB connect
package three;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB2 {
	static String JDBC_DRIVER_NAME;
    static String DB_URL;
    static String USER_ID;
    static String USER_PASSWORD;
    
    static {
        Properties properties = new Properties();
        try {
            InputStream in = DB2.class.getClassLoader().getResourceAsStream("res/DB.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JDBC_DRIVER_NAME = properties.getProperty("JDBC_DRIVER_NAME");
        DB_URL = properties.getProperty("DB_URL");
        USER_ID = properties.getProperty("USER_ID");
        USER_PASSWORD = properties.getProperty("USER_PASSWORD");
    }
    
    public static Connection getConnection() throws Exception {
        Class.forName(JDBC_DRIVER_NAME);
        return DriverManager.getConnection(DB_URL, USER_ID, USER_PASSWORD);
    }
    
    public static void main(String[] args) {
        System.out.println(DB2.JDBC_DRIVER_NAME);
        System.out.println(DB2.DB_URL);
        System.out.println(DB2.USER_ID);
        System.out.println(DB2.USER_PASSWORD);
    }

	
	
	
	//hard coding
	/*
	static String JDBC_DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String DB_URL = "jdbc:sqlserver://127.0.0.1;databaseName=lecture2;";
    static String USER_ID = "sa";
    static String USER_PASSWORD = "test123";
    
    public static Connection getConnection() throws Exception {
        Class.forName(JDBC_DRIVER_NAME);
        return DriverManager.getConnection(DB_URL, USER_ID, USER_PASSWORD);
    }
    */

}
