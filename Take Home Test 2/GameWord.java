/**
 *This is code for a hangman game. This game features many diffrent files 
 * and catagories to choose from. 
 * 
 * @author (Chandler H Godfrey) 
 * @version (10-5-2018)
 */
import java.io.*;//inuput, output.
import java.util.*;// Java utility package.
import java.util.Random;
public class GameWord
{
    private String sentence;
    private StringBuilder inProgress;
    private int numberWrongGuesses;
    private StringBuilder state;
    private boolean gameOver;

    boolean [ ] used = new boolean[255];     
    Scanner in = new Scanner(System.in);

    public GameWord( )
    {
        inProgress = new StringBuilder( );
        sentence = new String();
        numberWrongGuesses = 0;
        state = new StringBuilder( );
        gameOver = false;

    }

    /**
     * @param GameWord starts the check the game word used
     */

    public GameWord(String sentenceToGuess)// method that sets the game word.
    {
        sentence = new String(sentenceToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        for(int k = 0; k < sentence.length( ); k++)
        {
            inProgress.append( "_ ");
        }
        numberWrongGuesses = 0;
        gameOver = false;
    }

    /**
     *@param setPhrase is setting the phrase to guess. 
     *
     */
    public void setPhrase(String sentenceToGuess)//This method sets the phrase to guess.
    {
        sentence = new String(sentenceToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        for(int k = 0; k < sentence.length( ); k++)
        {
            inProgress.append( "_ ");
        }
        numberWrongGuesses = 0;
        state = new StringBuilder( );
        gameOver = false;
    }

    /**
     * 
     * @return getGameOver returns if the game has reached 7 tries or not.
     */
    public boolean getGameOver( )// this method returns gameOver if the user has reached over the 7 tries they get.
    {
        return gameOver;


    }

    /**
     * @param find makes sure the right character is guessed. If not it incremtns the number of guesses.
     */
    public void find(char symbol)// incrementing the number of wrong guesses enterd by the user.
    {
        int count = 0;
        int pos = 0;
        pos = sentence.indexOf(symbol);
        while(pos != -1)
        { 
            count++;
            inProgress.setCharAt(pos*2,symbol);
            pos = sentence.indexOf(symbol, pos + 1);;
        }
        if(count == 0)
        {
            numberWrongGuesses++;
            updateState( );
        }
    }

    /**
     * 
     * @return checkWin the method to see if all the characters have been guessed.
     */
    public boolean checkWin()// this method checks to see if all the characters have been guessed.
    {
        boolean match = true;

        for(int x = 0; x < this.inProgress.length() ; x++)
        {
            if(this.inProgress.charAt(x) == '_') 
            {
                match = false; 
            }
        }

        return match;
    }

    /**
     * @param updateState checks the number of wrong guesses and throws a new hangman symobl evertime a wrong character was enterd.
     */
    private void updateState( )// this method increments the symobls of hangman as the user enters in the wrong character.
    { 

        switch(numberWrongGuesses)
        {
            case 1: state.append("\n\t\t\t\t\t 0");
            break;
            case 2: state.append( "\n\t\t\t\t       /");
            break;
            case 3: state.append(" |");
            break;
            case 4: state.append( " \\");
            break;
            case 5: state.append("\n\t\t\t\t         |");
            break;
            case 6: state.append("\n\t\t\t\t        /");
            break;
            case 7: state.append(" \\\n\n\t\t\t\t      OH NO!!\n");
            gameOver = true;

        }
    }

    /**
     * @return toString retruns inProgress to incremnt the '_' after each character.
     */
    public String toString(  )//returning a toString method to print out in the GamePlay.
    {
        return new String("\n***************************************\n" 
            + inProgress + "\n" + state.toString( ));
    }
}
//