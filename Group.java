import java.util.HashMap;
import java.util.ArrayList;
/**
 * Contains information about a group
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Group
{
    // instance variables - replace the example below with your own
    private String name;
    private HashMap<Team, Double> pointsTable;
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
        pointsTable = new HashMap<>();
    }

    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public void insertTeam(Team team)
    {
        // put your code here
        teams.add(team);
        pointsTable.put(team, 0.0);
    }
    
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public void insertGame(Game game)
    {
        // put your code here
        games.add(game);
    }
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public void createGames()
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
        
    }
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public void addMatch(Team team1, Team team2)
    {
        Game game = new Game(team1, team2);
        game.simulateGame();
        calculatePoints(game);
        insertGame(game);
    }
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public Game getMatch(int index)
    {
        return games.get(index);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void calculatePoints(Game game)
    {
        int homeTeamScore = game.getHomeTeamScore();
        int awayTeamScore = game.getAwayTeamScore();
        float homeTeamPoints = game.getHomeTeam().getPoints();
        float awayTeamPoints = game.getAwayTeam().getPoints();
        
        if (homeTeamScore > awayTeamScore)
        {
            homeTeamPoints = 2f;
           awayTeamPoints = 0f;
        }
        else 
        {
            homeTeamPoints = 0f;
            awayTeamPoints = 2f;
        }
        if (game.isOvertime())
        {
            if (homeTeamScore > awayTeamScore)
        {
            homeTeamPoints = 1.5f;
            awayTeamPoints = 0.5f;
        }
        else 
        {
            homeTeamPoints = 0.5f;
            awayTeamPoints = 1.5f;
        }
        }
        homeTeamPoints = homeTeamPoints + (homeTeamScore * 0.1f);
        game.getHomeTeam().addPoints(homeTeamPoints);
        awayTeamPoints = awayTeamPoints + (awayTeamScore * 0.1f);
        game.getAwayTeam().addPoints(awayTeamPoints);
    }
    /**
     * Method to insert a team into the group
     *
     * @param Team an instance of class Team
     */
    public float getPoints(int index)
    {
        return teams.get(index).getPoints();
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public void display()
    {
        System.out.println(name);
         for(Team team: teams)
         {
             System.out.println(team);
        }
    }
}
