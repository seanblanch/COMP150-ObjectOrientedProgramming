/**
 * Dealer class for the game of Even Or Odd
 *
 * @author Sean Blanchard
 * @version: 10/28/18
 */
public class Dealer
{
    private Die die1;
    private Die die2;
    private final int SIDES = 6;

    /**
     * Constructor  creates two Die objects
     */
    public Dealer()
    {
        // TODO Project 2
        die1 = new Die(SIDES); //Creates a dice with 6 sides
        die2 = new Die(SIDES); //Creates a dice 2 with 6 sides
    }

    /**
     * The shakeDiceCup method rolls both dice
     */
    public void shakeDiceCup()
    {
        // TODO Project 2
        die1.roll(); //Roll dice 1
        die2.roll(); //Roll dice 2
    }

    /**
     * The calculateEvenOrOdd method returns the result of the dice roll
     *
     * @return EVEN if the sum of two dice roll is even, or ODD otherwise
     */
    public String calculateEvenOrOdd()
    {
        // TODO Project 2
        if((die1.getFace()+die2.getFace())%2==0){
            return "Even"; //Even is sum of two dice roll is even
        } else {
            return "Odd"; //ODD if not
        }


    }

    /**
     * @return String representation of the dealer's roll
     */
    public String toString()
    {
        return "The dealer rolled " + this.die1.getFace() + " " + this.die2.getFace()
                + "\n   Result " + calculateEvenOrOdd();
    }
}