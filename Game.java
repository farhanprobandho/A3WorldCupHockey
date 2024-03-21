import java.util.Random;
/**
 * Contains information about a Match.
 * This class is responsible for simulating a game and adding points to respective teams.
 *
 * @author (Farhan Ishrak Probandho)
 * @version (03.21.2024)
 */
public class Game
{
    private static final int MAX_GOAL = 6;
    private static final int OT_MAX_GOAL = 3;
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private float homeTeamPoints;
    private float awayTeamPoints;
    private Boolean overtime;

    /**
     * Constructor for objects of class Game
     */
    public Game(Team homeTeam, Team awayTeam)
    {
        this.overtime = false;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        homeTeamScore = 0;
        awayTeamScore = 0;
    }

    /**
     * Accessor method for the home team in the match
     *
     * @return homeTeam The home team object
     */
    public Team getHomeTeam()
    {
       return homeTeam;
    }
    /**
     * Accessor method for the away team in the match
     *
     * @return awayTeam The away team object
     */
    public Team getAwayTeam()
    {
        return awayTeam;
    }
    /**
     * Accessor method for the home team's score in the match
     *
     * @return homeTeamScore The home team's score 
     */
    public int getHomeTeamScore()
    {
        return homeTeamScore;
    }
    /**
     * Accessor method for the away team's score in the match
     *
     * @return awayTeamScore The away team's score 
     */
    public int getAwayTeamScore()
    {
        return awayTeamScore;
    }
    /**
     * Method that simulates the match between the two teams. 
     * If scores are tied at half-time, it keeps playing overtime until a winner is decided.
     *
     * @return    
     */
    private void generateScore()
    {
        Random random = new Random();
        homeTeamScore = random.nextInt(MAX_GOAL);
        awayTeamScore = random.nextInt(MAX_GOAL);
        while (homeTeamScore == awayTeamScore)
        {
            overtime = true;
            int homeTeamScoreOT;
            int awayTeamScoreOT;
            homeTeamScoreOT = random.nextInt(OT_MAX_GOAL);
            awayTeamScoreOT = random.nextInt(OT_MAX_GOAL);
            homeTeamScore = homeTeamScore + homeTeamScoreOT;
            awayTeamScore = awayTeamScore + awayTeamScoreOT;
        }
        homeTeam.addGoalDifference(homeTeamScore - awayTeamScore);
        awayTeam.addGoalDifference(awayTeamScore - homeTeamScore);
    }
    /**
     * Method that calculates the points gained by each team
     */
    private void calculatePoints()
    {
        
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
        if (isOvertime())
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
        homeTeam.addPoints(homeTeamPoints);
        awayTeamPoints = awayTeamPoints + (awayTeamScore * 0.1f);
        awayTeam.addPoints(awayTeamPoints);
    }
    /**
     * Method that simulates a game and assigns points to the two teams
     */
    public void simulateGame()
    {
        generateScore();
        calculatePoints();
    }
    /**
     * Method that returns true if the game went to overtime, false if it did not
     *
     * @return Boolean Returns whether the game went to overtime
     */
    public Boolean isOvertime()
    {
        return overtime;
    }
}
