package employeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public  class conn {
    Connection c;
    Statement s;
    conn(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employemgmtdb","system","12345");
          s= c.createStatement();
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }
}
