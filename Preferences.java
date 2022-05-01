public class Preferences {
    private int[] preferences;

    public Preferences(){
        preferences = new int[5];
    }
    //index 0 = bed time
    public void setBedTime(int bedTime){
        preferences[0] = bedTime;
    }
    //index 1 = lights
    public void setLights(int lights){
        preferences[1] = lights;
    }
    //index 2 = eating habits
    public void setEatingFrequency(int eatingFrequency){
        preferences[2] = eatingFrequency;
    }
    //index 3 = game habits
    public void setGamingFrequency(int gamingFrequency){
        preferences[3] = gamingFrequency;
    }
    //index 4 = study habits
    public void setStudyFrequency(int studyFrequency){
        preferences[4] = studyFrequency;
    }
    //Getter
    public int[] getPrefereces(){
        return preferences;
    }
    //Methods
    public int findSimilarity(User u){
        int[] other = u.getPersonalPreferences().getPrefereces();
        int total = 0;
        for (int i = 0; i < other.length; i++) 
        {
            if (Math.abs(preferences[i] - other[i]) == 0)
            {
                total += 14;
            }
            else if (Math.abs(preferences[i] - other[i]) == 1)
            {
                total += 8;
            }
            else if (Math.abs(preferences[i] - other[i]) == 2)
            {
                total += 4;
            }        
        }
        return total;
    }
}