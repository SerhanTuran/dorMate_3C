import java.util.ArrayList;

public class Selector {
    
    public ArrayList<User> selectUsers(int userID){ 
        
        ArrayList<User> allUsers = new ArrayList<User>();
        User[] database = new User[10];
        User u = new User("Ege", "email", "password");
        
        //Creating otherUsers array with same gender
        for (int i = 0; i < database.length; i++)
        {
            if (u.getGender.equals(database[i].getGender()) && userID != database[i].getID() && database[i].isVisible())
            {
                allUsers.add(database[i]);
            }
        }

        //Assigning the four best matches for the individual
        //Selecting first user
        int maxLocation = 0;
        int maxSimilarity = u.findSimilarity(database[0]);
        for (int j = 1; j < allUsers.size(); j++) 
        {
            if (u.findSimilarity(database[j]) > maxSimilarity)
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(database[j]);
            }
        }
        u.setMatchOne(maxLocation);

        //Selecting second user
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(database[0]);
        for (int j = 1; j < allUsers.size() && j != u.getMatchOne(); j++) 
        {
            if (u.findSimilarity(database[j]) > maxSimilarity)
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(database[j]);
            }
        }
        u.setMatchSecond(maxLocation);

        //Selecting third user
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(database[0]);
        for (int j = 1; j < allUsers.size() && j != u.getMatchOne() && j != u.getMatchSecond(); j++) 
        {
            if (u.findSimilarity(database[j]) > maxSimilarity)
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(database[j]);
            }
        }
        u.setMatchThird(maxLocation);

        //Selecting fourth user
        maxLocation = 0;
        maxSimilarity = u.findSimilarity(database[0]);
        for (int j = 1; j < allUsers.size() && j != u.getMatchOne() && j != u.getMatchSecond() && j != u.getMatchThird(); j++) 
        {
            if (u.findSimilarity(database[j]) > maxSimilarity)
            {
                maxLocation = j;
                maxSimilarity = u.findSimilarity(database[j]);
            }
        }
        u.setMatchFourth(maxLocation);
    }
}