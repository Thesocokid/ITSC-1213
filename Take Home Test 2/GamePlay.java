
/**
 * This is code for a hangman game. This game features many diffrent files 
 * and catagories to choose from. The user has seven guess before they loose. 
 * Good luck, If you loose and choose to play again press Y.
 * 
 * @author (Chandler H Godfrey) 
 * @version (10-5-2018)
 * 
 */
import java.io.*;//inupt, output.
import java.util.*;//the utility package.
public class GamePlay
{
   

     /**
     * @param Choice is the menu option the user chose (1-5).
     * @param word is the integer that is equall to 20 that can pull a random phrase from the file.
     * @param goAgain is the char used to allow the user to restart the program.
     * @param Random is the varible that will pull random line from the file.
     * @param Scanner fileIn is being set for the new Scanner to get lines off of the file.
     */
    
    public static void main(String[ ] args)throws IOException
    {
      
        Scanner in = new Scanner(System.in);//scanner class for keyboard input.
        Random rando = new Random();
        int word = rando.nextInt(20);
        char guess;
        int choice = 0;
        char goAgain;
        String textFile = null;
        Scanner fileIn = null;

        Scanner keyboard = new Scanner(System.in);//Scanner for keyboard input.
        do{
            System.out.println("Welocme to Chandlers Hangman game");
            System.out.println("Please choose a game topic to play (1-5)");//Menu option for categories 1-5.
            System.out.println("1.BlockBuster Movies");
            System.out.println("2.Famous Songs");
            System.out.println("3.NBA teams");
            System.out.println("4.Famous Company Quotes");
            System.out.println("5.Technology Quotes");
            choice = keyboard.nextInt();
            while(choice < 1 || choice > 5)// Loop to make sure the user doesn't exceed less than 1 or over 5.
            {
                System.out.println("Please choose a valid menu option (1-5)");
                choice = keyboard.nextInt();
            }

            if(choice == 1)// the menu choice for option 1,BlockBuster Movies.
            {
                textFile = "BlockBuster Movies.txt";

            }
            if(choice == 2)// the menu choice for menu option 2, Famous Songs.
            {
                textFile = "Famous Songs.txt";

            }
            if(choice == 3)// // the menu choice for menu option 3, NBA Teams.
            {
                textFile = "NBA teams.txt";

            }
            if(choice == 4)// the menu choice for menu option 4, Famous Company Qutoes.
            {
                textFile = "Famous Company Quotes.txt";

            }
            if(choice == 5)// the menu choice for menu option 5, Technology Quotes.
            {
                textFile = "Technology Quotes.txt";

            }
            fileIn = new Scanner(new File(textFile));// Setting fileIn to a new Scanner.   

            for(int x = 0; x < word; x++)// A loop to loop through the file lines.
            {
                fileIn.nextLine();//going to the next line in the text file.
            }
            boolean [ ] used = new boolean[255];
            String newPhrase = fileIn.nextLine();// Reading a new line from the text file.
            GameWord myPhrase = new GameWord(newPhrase);// Using the next line in the file for the word to guess.

            System.out.println("\n" + myPhrase.toString( ));//Checking all charcters enterd by the user. 
            while(!myPhrase.checkWin() && ! myPhrase.getGameOver( ))
            {
                do{
                    System.out.print("\nEnter your character: ");//asking user to enter a character.
                    guess = in.nextLine( ).charAt(0);//Checking every letter entered.
                    if(used[guess]) System.out.println("That letter already guessed.");
                }while (used[guess]);
                used[guess] = true; 
                myPhrase.find(guess);
                System.out.println("\n" + myPhrase.toString( ));// Prining the toString method in GameWord.
            }

            if(myPhrase.checkWin())// Checking if the user wins the game.
            {
                System.out.println("You got it!");//printing that the user won the game.
            }

            System.out.println("Game Over");  
            System.out.println("Game Over"); 
            System.out.println("Game Over"); 
            System.out.println("Game Over"); 
            System.out.println("Enter 'y' to go again");// Asking the user to enter 'y' to go again.
            goAgain = keyboard.next().charAt(0);
        }while(goAgain == 'y' || goAgain == 'Y');// Making sure the user wants to go again.
        System.out.println("Good-bye");//Prints good bye message for the user if they want to quit.
    }
}

