import java.util.ArrayList;
import java.util.Collections;
/**
 * Contains information about a group. It contains all the teams and the matches played in a particular group.
 *
 * @author (Farhan Ishrak Probandho)
 * @version (03.21.2024)
 */
public class Group
{
    private String name;
    private ArrayList<Game> games;
    private ArrayList<Team> teams;

    /**
     * Constructor for objects of class Group
     */
    public Group(String name)
    {
        this.name = name;
        teams = new ArrayList();
        games = new ArrayList<>();
    }

    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public void insertTeam(Team team)
    {
        teams.add(team);
    }
    
    /**
     * Method to insert a game into the group
     *
     * @param Game an instance of class Game
     */
    public void insertGame(Game game)
    {
        games.add(game);
    }
    /**
     * Method that simulates all the matches in a group
     *
     */
    public void simulateGroup()
    {
        int index = 0;
        while (index < teams.size())
        {   int newindex = index + 1;
            while (newindex < teams.size())
            {
                Team team1 = teams.get(index);
                Team team2 = teams.get(newindex);
                addMatch(team1, team2);
                newindex++;
            }
            index++;
        }
        sortGroups();
    }
    /**
     * Method that takes two teams, simulates a game between them, and inserts the Game to the Group
     *
     * @param team1,team2 The two teams that are matching up against one another.
     */
    public void addMatch(Team team1, Team team2)
    {
        Game game = new Game(team1, team2);
        game.simulateGame();
        insertGame(game);
    }
    
    /**
     * Method to insert a team into the group
     *
     * @param Team A team
     */
    public float getPoints(int index)
    {
        return teams.get(index).getPoints();
    }
    /**
     * Method that determines the standing for a given group, and displays the standing.
     *
     */
    public void calculateStanding()
    {
        sortGroups();
        System.out.printf("%23s \n", name);
        System.out.printf("%7s %14s %19s \n", "Country", "Points", "Point Difference");
        System.out.printf("---------------------------------------------------- \n");
         for(Team team: teams)
         {
             System.out.println(team);
        }
    }
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    private void sortGroups()
    {
        int i = 0;
        while (i < teams.size())
        {   int minIndex = i;
            int j = i + 1;
            while (j < teams.size())
            {
                if(teams.get(minIndex).getPoints() < teams.get(j).getPoints())
                {
                    minIndex = j;
                }
                else if (teams.get(minIndex).getPoints()==teams.get(j).getPoints() && teams.get(minIndex).getGoalDifference() < teams.get(j).getGoalDifference())
                {
                    minIndex = j;
                }
                j++;
            }
            Collections.swap(teams, i, minIndex);
            i++;
        }
    }
}