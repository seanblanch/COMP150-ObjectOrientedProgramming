import java.util.Scanner;

/**
 * Guessing game of OddOrEven.
 *
 * @author: Sean Blanchard
 * @version: 10/28/2018
 */
public class PlayGame
{
    private Player player1; //implement player 1
    private Player player2;  //implement player 2
    private Dealer dealer; //implement dealer
    private final int MAX_ROUNDS = 5; // 5 is the maximum rounds
    private int roundCounter; // implement round counter

    /**
     * Constructor
     *
     * @param player1Name name of the player 1 as entered by the user
     * @param player2Name name of the player 2 as entered by the user
     */
    public PlayGame(String player1Name, String player2Name)
    {
        // Create the dealer 
        this.dealer = new Dealer(); 
 
        // Create the two players 
        this.player1 = new Player(player1Name); 
        this.player2 = new Player(player2Name);


        // TODO Project 2

        //
        // Play MAX_ROUNDS
        // For each round:
        //    a. asks dealer to shake the dice cup
        //    b. asks each player for their guess
        //    c. calls roundResults method to display the round statistics
        for (int i = 0; i<MAX_ROUNDS; i++){
            roundCounter += 1;  // implement round counter
            dealer.shakeDiceCup(); //Dealer shake dice cup
            player1.makeGuess(); //Ask for player to guess
            player2.makeGuess(); //Ask for player to guess
            roundResults(); //Ask for round results
            System.out.println();
        }


    }

    /**
     * The roundResults method determines the results of the current round
     * Displays the dealer's data and checks each player's guess
     * against the dealer's result. Awards a point to a player if (s)he guessed correctly.
     * Displays the appropriate message(s)
     */
    private void roundResults()
    {
        // TODO Project 2
        System.out.println("Playing round #" + roundCounter);
        System.out.println(dealer);
        System.out.println(player1.getName() + " guessed " + player1.getGuess());
        System.out.println(player2.getName() + " guessed " + player2.getGuess());
        // show the dice values rolled by the dealer


        // check each player guess and award points
        if(dealer.calculateEvenOrOdd()==player1.getGuess()){
            player1.addPoint(); // ADD point to player 1 if guess is correct
            System.out.printf("Awarding 1 point to " + player1.getName() + "\n");
        }
        if (dealer.calculateEvenOrOdd()==player2.getGuess()){
            player2.addPoint(); //ADD point to player 2 if guess is correct
            System.out.println("Awarding 1 point to " + player2.getName());
        }
    }

    /**
     * The displayGrandWinner method displays the game's grand winner or a tie
     */
    public void displayGrandWinner()
    {
        System.out.println();
        System.out.println("\n*** Game over. Here are the results ***");

        // TODO Project 2
        System.out.println(player1);
        System.out.println(player2);
        if(player1.getPoints() > player2.getPoints()){
            System.out.println(player1.getName() + " is the winner!"); //if player1 has more points they win!
        }else if(player2.getPoints() > player2.getPoints()) {
            System.out.println(player2.getName() + " is the winner!"); //if player 2 has more points they win!
        } else {
            System.out.println("it is a tie!"); // it is a tie if points are even
        }

    }
}