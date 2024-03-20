import java.util.Random;
/**
 * Contains information about a Match
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private static final int MAX_GOAL = 6;
    private static final int OT_MAX_GOAL = 3;
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private double homeTeamPoints;
    private double awayTeamPoints;
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Team getHomeTeam()
    {
       return homeTeam;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Team getAwayTeam()
    {
        return awayTeam;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getHomeTeamScore()
    {
        return homeTeamScore;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAwayTeamScore()
    {
        return awayTeamScore;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getHomeTeamPoints()
    {
        return homeTeamPoints;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getAwayTeamPoints()
    {
        return awayTeamPoints;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void generateScore()
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
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void calculatePoints()
    {
        if (homeTeamScore > awayTeamScore)
        {
            homeTeamPoints = 2;
            awayTeamPoints = 0;
        }
        else 
        {
            homeTeamPoints = 0;
            awayTeamPoints = 2;
        }
        if (overtime)
        {
            if (homeTeamScore > awayTeamScore)
        {
            homeTeamPoints = 1.5;
            awayTeamPoints = 0.5;
        }
        else 
        {
            homeTeamPoints = 0.5;
            awayTeamPoints = 1.5;
        }
        }
        homeTeamPoints = homeTeamPoints + (homeTeamScore * 0.1);
        awayTeamPoints = awayTeamPoints + (awayTeamScore * 0.1);
    }
    public void simulateGame()
    {
        generateScore();
        calculatePoints();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Boolean isOvertime()
    {
        return overtime;
    }
}
