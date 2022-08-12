/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to
edit this template
*/
package Project;
import java.sql.*;
import com.mysql.jdbc.*;
/**
 *
 * @author JAISHUK REDDY
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver”);
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lms”,”root”, “”);
            return con;
        }catch(Exception e){
            System.out.println("Exceprion caught : “ + e);
            return null;
        }
    }
}
