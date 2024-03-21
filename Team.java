
/**
 * Class that stores information about a particular team. 
 * Current iteration contains the name of the team, the points total and goal difference.
 * Further iterations may contain additional data such as
 * Player names, Player count, Coach, etc
 *
 * @author (Farhan Ishrak Probandho)
 * @version (03.20.24)
 */
public class Team
{ 
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
     * Accessor method to return the name of the team
     *
     * @return name The name of the team
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * Accessor method to return the number of points accumulated by the team
     *
     * @return points The points total
     */
    public float getPoints()
    {
        return this.points;
    }
    /**
     * Method to add points to the points total of a team
     * @param points The amount of points to be added
     * @return 
     */
    public void addPoints(float points)
    {
         this.points = this.points + points;
    }
    /**
     * @Override
     * Overriding the toString() method of the Object class to return a string representation of a team
     *
     * @return text A string representation of a team object, containing all its information
     */
    public String toString()
    {
         String text =String.format("%-16s %-12.1f %-15d ", name,points,goalDifference);
         return text;
    }
    /**
     * Method to display the string as a string
     *
     */
    public void display()
    {
         System.out.println(toString());
    }
    /**
     * Method to add goal difference accumulated in a match to the total goal difference over the tournament
     *
     * @param difference The goal difference of a particular match
     * @return 
     */
    public void addGoalDifference(int difference)
    {
         goalDifference = goalDifference + difference;
    }
    /**
     * Accessor method to return the goal difference of the team in the tournament
     *
     * @return goalDifference The goal difference of the team
     */
    public float getGoalDifference()
    {
        return this.goalDifference;
    }
}
