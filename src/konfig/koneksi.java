package konfig;

import java.sql.*;
import java .util.logging.Level;
import java.util.logging.Logger;
public class koneksi {
    private static Connection conn;
    public static  Connection getconnection(){
        if (conn==null){
            try{
                String url ="jbdc:mysql://localhost:3306//JavaApplication2";
                String user= "serly";
                String pass="1308" ;         
                conn =(Connection)DriverManager.getConnection(url, user, pass);
            }catch (Exception e){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn;
        }
}
