package deneme;

public class User{
    //Static Variables
    private static int count = 1;
    //Instance Variables
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String department;
    private String email;
    private String password;
    private boolean visibility;
    private String aboutMe;
    private int ID;
    private User matchOne;
    private User matchTwo;
    private User matchThree;
    private User matchFour;
    private int[] preferencess = new int[5];
    


    //Constructor
    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        for(int i = 0; i < 5; i++){
            preferencess[i] = 0;
        }
        //Assigning ID number by using static variable
        ID = count;
        count++;
    }
    
    
    //index 0 = bed time
    public void setBedTime(int bedTime){
        preferencess[0] = bedTime;
    }
    //index 1 = phonecall
    public void setPhonecall(int phonecall){
        preferencess[1] = phonecall;
    }
    //index 2 = eating habits
    public void setEatingFrequency(int eatingFrequency){
        preferencess[2] = eatingFrequency;
    }
    //index 3 = game habits
    public void setGamingFrequency(int gamingFrequency){
        preferencess[3] = gamingFrequency;
    }
    //index 4 = study habits
    public void setStudyFrequency(int studyFrequency){
        preferencess[4] = studyFrequency;
    }
    //Getter
    public int[] getPrefereces(){
        return preferencess;
    }
    public void setMatchOne(User matchOne) {
        this.matchOne = matchOne;
    }
    public void setMatchTwo(User matchTwo) {
        this.matchTwo = matchTwo;
    }
    public void setMatchThree(User matchThree) {
        this.matchThree = matchThree;
    }
    public void setMatchFour(User matchFour) {
        this.matchFour = matchFour;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    


    //Getters
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPassword(){
        return password;
    }
    //age.gender.department.nationality
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getDepartment(){
        return department;
    }
    public boolean getVisibility(){
        return visibility;
    }

    public User getMatchOne() {
        return matchOne;
    }
    public User getMatchTwo() {
        return matchTwo;
    }
    public User getMatchThree() {
        return matchThree;
    }
    public User getMatchFour() {
        return matchFour;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public int getID() {
        return ID;
    }
    
    
    

    //Setters
    //ADD PREFERENCES ...
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setVisibility(boolean visibility){
        this.visibility = visibility;
    }

    //Methods
    public boolean isVisible(){
        return visibility;
    }
    
    
    //preferences toString
    public String bedTimeString(int n){
        if (n == 0)
        {
            return "Before 10.00 p.m";
        }
        else if (n == 1)
        {
            return "Between 10.00 p.m - 00.00 a.m";
        }
        else
        {
            return "After 00.00 a.m";
        }
    }
    public String phoneString(int n){
        if (n == 0)
        {
            return "I go out when my phone rings.";
        }
        else if (n == 1)
        {
            return "I may have short meetings in the room.";
        }
        else
        {
            return "I always have my phonecalls in the room.";
        }
    }
    public String kitchenString(int n){
        if (n == 0)
        {
            return "I never use dorm kitchen and room for eating.";
        }
        else if (n == 1)
        {
            return "I generally use the dorm's kitchen.";
        }
        else
        {
            return "I generally eat in the room.";
        }
    }
    public String gameString(int n){
        if (n == 0)
        {
            return "I don't like playing video games.";
        }
        else if (n == 1)
        {
            return "I rarely play games.";
        }
        else
        {
            return "I am addicted to computer games.";
        }
    }
    public String studyString(int n){
        if (n == 0)
        {
            return "I never use the room for studying.";
        }
        else if (n == 1)
        {
            return "Only in exam weeks.";
        }
        else
        {
            return "I always study in the room (I prefer a silent room).";
        }
    }
    //ToString
    public String toString(){
        return name + " " + surname + "    Age: " + age + "    Department: " + department;
    }
    
        //Methods
    public int findSimilarity(User u){
        int[] other = u.getPrefereces();
        int total = 0;
        for (int i = 0; i < other.length; i++) 
        {
            if (Math.abs(preferencess[i] - other[i]) == 0)
            {
                total += 14;
            }
            else if (Math.abs(preferencess[i] - other[i]) == 1)
            {
                total += 8;
            }
            else if (Math.abs(preferencess[i] - other[i]) == 2)
            {
                total += 4;
            }        
        }
        return total;
    }
}
