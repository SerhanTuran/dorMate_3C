import java.util.ArrayList;

public class User implements Comparable<User>{
    //Constants
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int TURKISH = 0;
    public static final int OTHER_NATIONS = 1;
    
    //Static Variables
    private static int count = 1;
    //Instance Variables
    private String name;
    private int age;
    private String gender;
    private String department;
    private boolean nationality;
    private int dorm;
    private String email;
    private String password;
    private boolean visibility;
    private int ID;
    private ArrayList<User> likedUsers;
    private Preferences personalPreferences;

    //Constructor
    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        personalPreferences = new Preferences();
        likedUsers = new ArrayList<User>();
        //Assigning ID number by using static variable
        ID = count;
        count++;
    }

    //Setters
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setNationality(boolean nationality){
        this.nationality = nationality;
    }
    public void setDorm(int dorm){
        this.dorm = dorm;
    }
    public void setVisibility(boolean visibility){
        this.visibility = visibility;
    }

    //Getters
    public Preferences getPersonalPreferences(){
        return personalPreferences;
    }

    //Methods
    public boolean isVisible(){
        return visibility;
    }
    public void likeUser(User u){
        if (!likedUsers.contains(u))
        {
            likedUsers.add(u);
        }
    }
    public void dislikeUser(User u){
        likedUsers.remove(u);
    }

    //CompareTo
    public int compareTo(User other){
        return personalPreferences.findSimilarity(other);
    }
}