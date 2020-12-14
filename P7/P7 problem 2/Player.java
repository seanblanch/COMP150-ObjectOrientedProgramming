import java.util.Random;

/**
 * Player class for the game of Odd or Even
 *
 * @author: Sean Blanchard
 * @version: 10/28/2018
 */
public class Player
{
    private String name;
    private String guess;
    private int points;

    /**
     * Constructor  sets the name to the given playersName,
     *                   guess is set to empty string, and points to 0
     *
     * @param playerName The player's name
     */
    public Player(String playerName)
    {
        // TODO Project 2
        this.name = playerName;
        this.guess = ""; //empty string for user guess
        this.points = 0; //set points to 0

    }

    /**
     * The makeGuess method causes the player to guess either EVEN or ODD
     * Creates a random object and utilizes nextBoolean method
     */
    public void makeGuess()
    {
        // TODO Project 2
        //make player guess either even or odd
        Random rand = new Random();
        if (rand.nextBoolean()){
            guess = "Even";
        } else {
            guess = "Odd";
        }

    }

    /**
     * The addPoint method adds one point to the player's current balance
     */
    public void addPoint()
    {
        // TODO Project 2
        this.points += 1; // Add one point to player balance

    }

    /**
     * Accessor method
     *
     * @return the player's name field
     */
    public String getName()
    {
        // TODO Project 2
        return this.name;  // returns player's name
    }

    /**
     * Accessor method
     *
     * @return the value of the guess field
     */
    public String getGuess()
    {
        // TODO Project 2
        return this.guess; // return guess
    }

    /**
     * Accessor method
     *
     * @return the value of the points field
     */
    public int getPoints()
    {
        // TODO Project 2
        return this.points; // return value of points
    }

    /**
     * @return the String representation of the content of the player's object:
     *                    only players name and the numbers of points are given
     */
    public String toString()
    {
        // TODO Project 2
        return this.name + " scored " + this.points + " points."; //reports how many points each player scored
    }
}