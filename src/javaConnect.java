import java.sql.*;
import javax.swing.JOptionPane;
public class javaConnect {
    Connection conn=null;
    
    
    public static Connection ConnecrDb() throws ClassNotFoundException{
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:/swingDemo/otomasyonödev/KutuphaneProje.db");
            conn.setAutoCommit(true);
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;       
                
        }
    }
    
}
