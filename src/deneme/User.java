package deneme;

public class User{
    //Constants
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int TURKISH = 0;
    public static final int OTHER_NATIONS = 1;
    
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
    private int ID;
    private int matchOne;
    private int matchTwo;
    private int matchThree;
    private int matchFour;
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
    
    //for preferencessssssss
    
    
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
    public void setMatchOne(int matchOne) {
        this.matchOne = matchOne;
    }
    public void setMatchTwo(int matchTwo) {
        this.matchTwo = matchTwo;
    }
    public void setMatchThree(int matchThree) {
        this.matchThree = matchThree;
    }
    public void setMatchFour(int matchFour) {
        this.matchFour = matchFour;
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

    public int getMatchOne() {
        return matchOne;
    }
    public int getMatchTwo() {
        return matchTwo;
    }
    public int getMatchThree() {
        return matchThree;
    }
    public int getMatchFour() {
        return matchFour;
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
    
    //ToString
    public String toString(){
        return name+" "+surname+" "+age+" "+gender;
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
