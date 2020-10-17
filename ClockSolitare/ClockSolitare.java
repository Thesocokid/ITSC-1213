import java.util.*;// for the keyboard scanner and arrays
/**
* This is the driver for the clock Solitare Game
 *
 * @author (Chandler Godfrey)
 * @version (12-1-2018)
 * @param gameCounter - This is used to count the number of games by the user.
 * @param game - This created a deck of 52 cards.
 * @param cardPile - This creates 13 piles.
 * 
 */


public class ClockSolitare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);// keyboard Scanner
        int gameCounter;

        System.out.println("Please select a print level:");
        System.out.println("a.Verbose");// verbose 
        System.out.println("b.Normal");//normal
        System.out.println("c.Silent");// silent

        if(args.length == 1)
        {
            if(args[0].equals("b"))
            {
                System.out.println("You will only play one game");// Telling the user the game mode they chose 
                gameCounter = 1;// setting game counter to one

                Deck game = new Deck();// created a 52 card deck
                System.out.println(game);// this will print the contents of the deck.

                game.suffle();// this will call shuffle method to shuffle the cards.
                Pile [] cardPile = new Pile[13];// 13 piles to store into an array.

                for(int q = 0; q < cardPile.length; q ++)// loops throught each pile
                    cardPile[q] = new Pile();// creates each pile.
                {
                    for(int w = 0; w < 4; w++)// The number 4 is the number of cards in each pile.
                    {
                        cardPile[w].addCardDown(game.dealCard());// adds each card from the pile into the deck.
                    }

                    for(int t = 0; t < cardPile.length; t++)// prints the piles out to the user.
                    {
                        System.out.println("Pile" + (t + 1) + " : " + cardPile[t].toString());

                    }
                }

            }

            else if(args.length == 2)
            {
                if(args[0].equals("a"))
                {
                    System.out.println("You chose a verbose game mode");// Telling the user the game mode they chose 
                    gameCounter = Integer.parseInt(args[1]);
                }
                else if(args[0].equals("c"))
                {
                    System.out.println("You chose a silent game mode");// Telling the user the game mode they chose 
                    gameCounter = Integer.parseInt(args[1]);
                }
            }
        }

    } 
}

