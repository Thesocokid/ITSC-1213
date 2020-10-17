
/**
 * This is the Pile class for the Solitare game
 *
 * @author (Chandler Godfrey)
 * @version (12-2-18)
 * @param numFaceUp Number of cards face up
 * @param numFaceDown cards faced down
 * @param deck  the deck of cards 
 * @param pilesSolitaire refrence object 
 */
public class Pile
{
    private int numFaceUp;
    private int numFaceDown;
    private String inFaceUp;
    private String inFaceDown;
    private int deck;
    Card[] pilesSolitaire;
    /**
     * no-args constructor the starts all feild values 
     */
    
    public Pile()
    {
        pilesSolitaire = new Card [5];// max of five cards in pile
        deck = pilesSolitaire.length - 1;// number of cards in pile
        inFaceUp = "";
        inFaceDown = "";
        numFaceUp = 0;// set to zero
        numFaceDown = 0;// set to zero
    }

    /**
     * this method adds face down card to the pile
     * @param inCard take a refrence to another card object
     */
    public void addCardDown(Card inCard)
    {
        if(deck >= 0)
        {
            pilesSolitaire[deck--] = inCard;
            inFaceDown += inCard.toString() + "";
            numFaceDown ++;// increments everytime a facedown card is added
        }
    }
    /**
     * This method removes the card from the pile
     * @return - refrence to a card obejct 
     * 
     */
    public Card removeCard()
    {
        Card tempCard;// temp card
        tempCard = pilesSolitaire[pilesSolitaire.length - 1];// storing the value of temp card
        for(int b = 4; b > 0; b --)// loops backwards and moves all indexes up by 1
        {
            pilesSolitaire[b] = pilesSolitaire[b - 1];
        }
        pilesSolitaire[0] = null;// bottom set, set to null
        deck ++;// everytime card is removed it opens a new slot 
        return tempCard;
    }

    /**
     * This method get the number of the face down cards 
     * @return int - representing the facedown cards 
     * 
     */
    public int getNumFaceDown()
    {
        int number1 = numFaceDown;// keeping track of the face down cards.
        return number1;

    }
    
    /**
     * This method adds the face up cards 
     * @param inCard = takes a refrence to another card value
     * 
     */
    public void addFaceUp(Card inCard)
    {
        if(deck >= 0)
        {
            pilesSolitaire[deck--] = inCard;
            inFaceUp += inCard.toString() + " ";
            numFaceUp++;// tracking number of face up cards and incremnts by 1
        }
    }
    
    /**
     * This method get number of face up cards 
     * @return number2 returns the value of number of face up cards 
     * 
     */
 
    public int getFaceUp()
    {   
    int number2= numFaceUp;// keeping track of face up cards.
    return number2;
    }
    
    /**
     * Sening textual representaion of cards in pile 
     * @return String sends all the text back
     * 
     */
    public String toString()
    {
    String Cards = "";// pile of cards stored in this varible 
    for(int c = 0; c < pilesSolitaire.length; c ++ )// looping through the pile 
    {
   
    if(pilesSolitaire[c].getValue() != 0  )// checks if not equal to 0
    {
    Cards += pilesSolitaire[c].toString() ;
    
    
    }// end   
    }
    return Cards + "\n All cards face up" + inFaceUp + "\n all cards face down " + inFaceDown ; 
    }
}