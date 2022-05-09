package deneme;



public class Preferencess {
    private int[] preferencess;

    public Preferencess(){
        preferencess = new int[5];
        for(int i = 0; i < 5; i++){
            preferencess[i]  = 0;
        }
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
    //Methods
    public int findSimilarity(User u){
        int[] other = u.getPersonalPreferences().getPrefereces();
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