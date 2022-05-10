package Start;

import deneme.User;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
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
            //insert visibility
            
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
    
    public int getGame(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT game FROM users WHERE id = ?;";
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
    
    public int getBedTime(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT bedTime FROM users WHERE id = ?;";
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
    
    public int getKitchen(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT kitchen FROM users WHERE id = ?;";
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
    
    public int getStudy(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT study FROM users WHERE id = ?;";
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
    
    public int getPhone(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT phone FROM users WHERE id = ?;";
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
    
    public boolean getVisibility(int userID){
        PreparedStatement prepStat = null;
        
        try {
            String insertQuery = "SELECT visibility FROM users WHERE id = ?;";
            prepStat = con.prepareStatement(insertQuery);
            
            prepStat.setInt(1, userID);
            
            
            ResultSet rs = prepStat.executeQuery();
            
            if(rs.next()){
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("Insert preferences error");
        }
        return false;
    }
    
    public User makeUser(int userID){
        User u = new User(getUsersName(userID), getUsersEmail(userID), getUsersPassword(userID));
        u.setAge(getUsersAge(userID));
        u.setDepartment(getUsersDepartment(userID));
        u.setGender(getUsersGender(userID));
        u.setBedTime(getBedTime(userID));
        u.setPhonecall(getPhone(userID));
        u.setEatingFrequency(getKitchen(userID));
        u.setGamingFrequency(getGame(userID));
        u.setStudyFrequency(getStudy(userID));
        u.setVisibility(getVisibility(userID));
        return u;
    }
    
    public User[] selectUsers(int userID)throws SQLException{
        User u = makeUser(userID); //user who matches with others
        ArrayList<User> otherUsers = new ArrayList<User>();
        PreparedStatement ps = null;
        String insertQuery = "SELECT id FROM users WHERE user_gender = ?";
        ps = con.prepareStatement(insertQuery);
        ps.setString(1, getUsersGender(userID));
        ResultSet rs = ps.executeQuery();
        int max = 0;
        int count = 0;
        while(rs.next()){
            count++;
            max = rs.getInt(count);
        }
        
        //make an arraylist who has same gender with userID
        for(int i = 0; i <= max; i++){
            User otherUser = makeUser(i);
            if(otherUser.getGender().equals(u.getGender()) && i != userID && otherUser.isVisible()){
                otherUsers.add(otherUser);
            }
        }
        
        int maxLocation = 0;
        int maxSimilarity = u.findSimilarity(otherUsers.get(0));
        for (int j = 1; j < otherUsers.size(); j++) 
        {
            if (u.findSimilarity(otherUsers.get(j)) > maxSimilarity)
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(otherUsers.get(j));
            }
        }
        u.setMatchOne(maxLocation);
        
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(otherUsers.get(0));
        for (int j = 1; j < otherUsers.size(); j++) 
        {
            if (u.findSimilarity(otherUsers.get(j)) > maxSimilarity && j != u.getMatchOne())
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(otherUsers.get(j));
            }
        }
        u.setMatchTwo(maxLocation);
        
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(otherUsers.get(0));
        for (int j = 1; j < otherUsers.size(); j++) 
        {
            if (u.findSimilarity(otherUsers.get(j)) > maxSimilarity && j != u.getMatchTwo() && j != u.getMatchOne())
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(otherUsers.get(j));
            }
        }
        u.setMatchThree(maxLocation);
        
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(otherUsers.get(0));
        for (int j = 1; j < otherUsers.size(); j++) 
        {
            if (u.findSimilarity(otherUsers.get(j)) > maxSimilarity && j != u.getMatchOne() && j != u.getMatchThree() && j != u.getMatchTwo())
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(otherUsers.get(j));
            }
        }
        u.setMatchFour(maxLocation);
        
        User [] result = new User[4];
        result[0] = makeUser(u.getMatchOne());
        result[1] = makeUser(u.getMatchTwo());
        result[2] = makeUser(u.getMatchThree());
        result[3] = makeUser(u.getMatchFour());
        
        return result;
    }
}
