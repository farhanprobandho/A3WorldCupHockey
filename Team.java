
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
    /**
     * Constructor for objects of class Team
     */
    public Team(String name)
    {
        this.name = name;
        this.points = 0;
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
}
