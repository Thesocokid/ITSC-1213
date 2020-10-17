import java.util.*;
/**
 * This is the Deck class for the solitare game.
 *
 * @author (Chandler Godfrey)
 * @version (12-2-2018)
 * @param cardCount - This keeps count off all the cards
 * @param solitareGame - intitalizes the array of refrences
 * 
 */

public class Deck
{
    //feilds
    private int cardCount;
    private Card [] solitareGame;

    /**
     * This the no-args constructor that sets all feilds
     * @param cardCount this keeps track of the cards
     * @param solitareGame - this is the array to hold contents of the cards

     */
    public Deck()
    {
        cardCount = 0;
        solitareGame = new Card [52];// starts the array
        for(int i = 0; i < solitareGame.length; i++)// setting each card to a new objct
        {
            solitareGame[i] = new Card();

        }
    }

    /**
     * This method is going to shuffle the cards and set them to diffent positions
     * @param cardOne - for the card generator
     * @param cardTwo - for the card generator
     * @param cardGen - value to generate a new card.
     * @param te - creating a temporary card
     */
    public void suffle()
    {
        int cardOne;
        int cardTwo;
        Random cardGen = new Random();// random generator.
        Card te = new Card();
        for(int q = 0; q < 100; q++)
        {
            cardOne = cardGen.nextInt(52);// sets to card one 
            cardTwo = cardGen.nextInt(52);// sets to card two 
            te = solitareGame[cardOne] = solitareGame[cardTwo];
            solitareGame[cardTwo] = te;

 
        }
    }

    /**
     * this method will deal cards to the player
     * @ return - returns a card obejct
     */
    public Card dealCard()
    {
        return solitareGame[cardCount++];    
    }

    /**
     * this method will get the cards left
     * @ return numberLeft - returns the number of cards left
     * 
     */
    public int cardsRemaining()
    {
        int numberLeft = solitareGame.length - cardCount;// subtacted for length from the card to get ammount of cards left
        return numberLeft;
    }
    
    /**
     * Retruns a textual representaion of the card 
     * @ return - returns the text for the card
     */
    public String toString()
    {
        String cards = " ";   

        for(int k = 0; k < solitareGame.length; k++)// loop the generates the array
        {
            cards += solitareGame[k].toString() + "*"; 
        }
        return "Cards in the deck: *" + cards;
    }

}

