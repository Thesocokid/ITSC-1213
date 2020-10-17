
/**
 * This is the Card class for the solitare game.
 *
 * @author (Chandler Godfrey)
 * @version (12-6-2018)
 * @param suit - this is for the suit of the card
 * @param value - for the value of the card
 * @param face = this is for the face value of the card
 * @param rank - the rank for the card 
 * @param inCard - the new varible for value 
 * @param 
 */
public class Card
{
    private char suit;
    private int value;
    private String face;
    private int rank;

    public Card()
    {
        value = rank = 0;// setting all values to 0.
        suit = ' ';
        face = " ";
    }

    
     /**
     * This is the second overloaded constructor
     * 
     * @param int value - takes an int and uses it to give the value to the cards 
     */
    public Card(int inCard)
    {
        value = inCard;
        if(inCard == 13 || inCard == 26 || inCard == 39 || inCard == 52)
        {
            rank = inCard;  
        }
        else
        {
            rank = inCard % 13;  
        }
        // seperate the decks of 52 cards into hearts, clubs , spades, diamonds
        if(inCard / 13 == 0 || rank == 13)
        {
            suit = 'H';
        }   
        else if(inCard / 13 == 1 || rank == 26)
        {
            suit =  'C';
        }
        else if(inCard / 13 == 2 || rank == 39)
        {
            suit = 'S';
        }
        else 
        {
            suit = 'D';
        }

        if(rank <= 10 && rank > 1)
        {
            face = String.valueOf(rank);
        }
        else if( rank == 11)
        {
            face = "Jack";// if the rank is 11 it is jack 
        }
        else if( rank == 12)
        {
            face = "Queen";// if the rank is 12 it is queen
        }
        else if( rank == 13)
        {
            face = "King"; // if the rank is 13 it is king 
        }
        else
        {
            face = "Ace";  // anything else is ace 
        }

        
    }
    
    /**
     * @return value - sending the value back to the contructor.
     */
    public int getValue()
    {
        return value;
    }
    
     /**
      * this is the metod to grab the suit of the card
     * @return suit - sending the suit back to the contructor. 
     */
    public int getSuit()
    {
    return suit;   
    }
     /**
      * this method checks to see if the two cards are equal or not
     * @return equals - comparing the rank value to the other rank value.
     */
    public boolean equals(Card other)
    {
        if(this.rank == other.rank)
        {
            return true;// means the ranks are equal
        }
        else
        {
            return false; // if not equal
        }

    }

     /**
      * this method compares the rank of the new cards.
     * @return compareTo - Comparing the rank of the card to the other rank of the card.
     */
    public int compareTo(Card Other)
    {
        if(this.rank > Other.rank)
        {
            return 1; // if the rank of card is greater than card being taken in its 1
        }
        else if(this.rank < Other.rank)
        {
            return -1;  // if the rank of card is less than card being taken in its -1
        }
        else
        {
            return 0; // if equal it returns 0 
        }
    }
    /**
     * This will return a textual representaion of the object.
     * @return toString - sending back the face and suit to create an representation on the object.
     */
    public String toString()
    {
        return  face + " "  + suit + " ";   

    }
}
