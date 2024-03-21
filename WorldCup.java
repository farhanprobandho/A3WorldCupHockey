import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class WorldCup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldCup
{
    // instance variables - replace the example below with your own
    private ArrayList<String> countries;
    private ArrayList<Group> groups;
    private int groupNumber;
    private int groupSize;

    /**
     * Constructor for objects of class WorldCup
     */
    public WorldCup(int groupNumber,int groupSize)
    {
        // initialise instance variables
        countries = new ArrayList();
        groups = new ArrayList();
        this.groupNumber = groupNumber;
        this.groupSize = groupSize;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void populateCountries()
    {
        // put your code here
        countries.add("Canada");
        countries.add("Finland");
        countries.add("Russia");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Sweden");
        countries.add("Switzerland");
        countries.add("Czechia");
        countries.add("Slovakia");
        countries.add("Latvia");
        countries.add("Denmark");
        countries.add("Norway");
        countries.add("France");
        countries.add("Belarus");
        countries.add("Kazakhstan");
        countries.add("Austria");
        countries.add("Slovenia");
        countries.add("Italy");
        countries.add("Hungary");
        countries.add("Great Britain");
        countries.add("Korea");
        countries.add("Poland");
        countries.add("Romania");
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void populateGroups()
    {
        int i = 0;
        Random random = new Random();
        while (i< groupNumber)
        {
            Group group = new Group("Group" + (i+1));
            int j = 0;
            while(j<groupSize)
            {
                int index = random.nextInt(countries.size()-1);
                Team team = new Team(countries.get(index));
                group.insertTeam(team);
                countries.remove(index);
                j++;
            }
            groups.add(group);
            i++;
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Group getGroup(int index)
    {
        return groups.get(index);
    }
}
