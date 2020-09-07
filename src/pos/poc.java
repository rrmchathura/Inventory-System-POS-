/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kobinath
 */
public class poc {
    
    static Connection c;

    public static Connection NRC() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/javasales","root","");
        }
        return c;

    }
    
    
    
    
}
