package StartScreen;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author İlhami Uluğtürkkan
 */
public class DatabaseHandler {
    
    Connection con = null;
    private static DatabaseHandler handler = null;
    
    private DatabaseHandler(){
        createConnection();
    }
    
    private void createConnection(){
        try {   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dormate.deneme","root","1234");
            System.out.println("Database connection successed!");  
        }catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DatabaseHandler getInstance(){
        
        if(handler == null){
            handler = new DatabaseHandler();
        }
        
        return handler;
        
    }
    
    /**
     * 
     * @param mail
     * @param password
     * @return the id of the user that logged in
     */
    public int checkCredential(String mail, String password){
        String query = "SELECT id FROM users WHERE user_email = ? AND user_password = ?";
        
        PreparedStatement prepStat = null;
            
        try {
            prepStat = con.prepareStatement(query);
            prepStat.setString(1, mail);
            prepStat.setString(2, password);
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("Check credential error"+ e.getMessage()) ;
        }
        
        return -1;
    }
    
    public boolean insertUser(String mail, String password, String name, String surname, String department, int age, String gender){
        
        PreparedStatement prepStat = null;
        
        try {
            ResultSet rs;
            
            String countMails = "SELECT COUNT(*) FROM users WHERE user_email = ?";
            
            prepStat = con.prepareStatement(countMails);
            prepStat.setString(1, mail);
            
            rs = prepStat.executeQuery();
            
            if(rs.next()){
                if(rs.getInt(1) > 0){
                    return false;
                }
            }
            
            String insertQuery = "INSERT INTO USERS (user_email, user_password, user_name, user_surname, user_department, user_age, user_gender) VALUES (?,?,?,?,?,?,?)";
            
            prepStat = con.prepareStatement(insertQuery);
            
            prepStat.setString(1, mail);
            prepStat.setString(2, password);
            prepStat.setString(3, name);
            prepStat.setString(4, surname);
            prepStat.setString(5, department);
            prepStat.setInt(6, age);
            prepStat.setString(7, gender);
            
            int result = prepStat.executeUpdate();
            
            return (result == 1);
        } catch (Exception e) {
            System.out.println("Insert user error");
        }
        return false;       
    }
    
    public void insertPreferences(int userId, int bed, int kitchen, int phone, int games, int study){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "UPDATE users SET game = ?, bedTime = ?, kitchen = ?, study = ?, phone = ? WHERE id = ?";
            
            prepStat = con.prepareStatement(insertQuery);
            
            prepStat.setInt(1, games);
            prepStat.setInt(2, bed);
            prepStat.setInt(3, kitchen);
            prepStat.setInt(4, study);
            prepStat.setInt(5, phone);
            prepStat.setInt(6, userId);
            prepStat.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Insert preferences error");
        }
    }
    
    public String getUsersName(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_name FROM users WHERE id = ?";
            
            prepStat = con.prepareStatement(insertQuery);
            
            prepStat.setInt(1, userID);
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    public String getUsersSurname(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_surname FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            prepStat.setInt(1, userID);
            
            
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    public String getUsersDepartment(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_department FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            prepStat.setInt(1, userID);
            
            
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    public int getUsersAge(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_age FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            
            prepStat.setInt(1, userID);
            
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return -1;
    }
    
    public String getUsersGender(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_gender FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            prepStat.setInt(1, userID);

            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    public String getUsersEmail(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_email FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            prepStat.setInt(1, userID);

            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    public String getUsersPassword(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT user_password FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            prepStat.setInt(1, userID);

            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return rs.getString(1);
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return "not found";
    }
    
    
    
}
