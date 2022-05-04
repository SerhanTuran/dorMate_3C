package StartScreen;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author İlhami Uluğtürkkan
 */
public class ConnectionDb {

    public static void main(String[] args) {
        ConnectionDb
     pro = new ConnectionDb
    ();
        pro.createConnection();
    }
    
    void createConnection(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dormate.ConnectionDb","root","1234");
            System.out.println("Database connection successed!");  
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM USERS where user_email like 'A%'");//picking up names starting with a
            while(rs.next()){
                String name = rs.getString("user_email");
                System.out.println(name);
            }
        }catch (SQLException ex) {
            System.out.println("Connection Failed!");
            Logger.getLogger(ConnectionDb
        .class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}