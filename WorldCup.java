import java.util.ArrayList;
import java.util.Random;
/**
 * Class that simulates the Hockey World Cup group stage.
 *
 * @author (Farhan Ishrak Probandho)
 * @version (03.21.2024)
 */
public class WorldCup
{
    private ArrayList<String> countries;
    private ArrayList<Group> groups;
    private int groupNumber;
    private int groupSize;

    /**
     * Constructor for objects of class WorldCup
     */
    public WorldCup(int groupNumber,int groupSize)
    {
        countries = new ArrayList();
        groups = new ArrayList();
        this.groupNumber = groupNumber;
        this.groupSize = groupSize;
    }
    /**
     * Sets up the hockey cup by populating the groups with random groups.
     *
     */
    public void hockeyCupSetup()
    {
        populateCountries();
        populateGroups();
    }

    /**
     * Method that populates country names.
     *
     */
    private void populateCountries()
    {
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
     * Method that populates every group with random teams
     *
     */
    private void populateGroups()
    {
        int i = 0;
        Random random = new Random();
        while (i< groupNumber)
        {
            Group group = new Group("Group " + (i+1));
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
     * Method to display the results of the tournament group stage.
     *
     */
    public void display()
    {
         for(Group group: groups)
         {
             group.calculateStanding();
        }
    }
    /**
     * Method that creates all possible matches between teams from the same group, and adds them to the appropriate groups.
     * In other words, simulates all the groups.
     *
     */
    public void randomGames()
    {
         for(Group group: groups)
         {
             group.simulateGroup();
        }
    }
}
