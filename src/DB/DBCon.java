/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;
import java.sql.*;

/**
 *
 * @author pc
 */
public class DBCon {
  public Connection con;
  public Statement stmt;
  public    PreparedStatement pstmt;
  public ResultSet rst;
  public DBCon()
  {
      try{
          Class.forName("com.mysql.jdbc.Driver");
                  con=DriverManager.getConnection("jdbc:mysql://Localhost:3308/attendance","root","root");
      }
          catch(Exception e){
                  e.printStackTrace();
                  }
  }
  
  }
      
 
