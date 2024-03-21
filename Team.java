
/**
 * Class that stores information about a particular team. 
 * Current iteration only contains the name of the team
 * Further iterations may contain additional data such as
 * Player names, Player count, Coach, etc
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables 
    private String name;
    private float points;
    private int goalDifference;
    /**
     * Constructor for objects of class Team
     */
    public Team(String name)
    {
        this.name = name;
        this.points = 0;
        this.goalDifference = 0;
    }

    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public float getPoints()
    {
        return this.points;
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public void addPoints(float points)
    {
         this.points = this.points + points;
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public String toString()
    {
         String text =String.format("%-15s %-8.1f %-8d ", name,points,goalDifference);
         return text;
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public void display()
    {
         System.out.println(toString());
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public void addGoalDifference(int difference)
    {
         goalDifference = goalDifference + difference;
    }
    /**
     * Method to return the name of the team
     *
     * @return name The name of the team
     */
    public float getGoalDifference()
    {
        return this.goalDifference;
    }
}
