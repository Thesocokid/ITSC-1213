
/**
 * This driver class holds the menu for user input as well as questions to better fit their conversion needs.
 * I have created a while loop so the user can't input a invalid menu option making this more user friendly.
 *
 * @author (Chandler H. Godfrey)
 * @version (9-9-2018)
 */
import java.util.*;

public class Driver
{

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);  
        double feetT = 0, inchesS = 0, yardsS = 0, metersS = 0 , centimetersS = 0;
        int choice, unit;
        char goAgain;

        Conversions myConversions;

        do
        {
            System.out.println("What conversion would you like?"); // setting the conversion factors.
            System.out.println("(1) feet");
            System.out.println("(2) inches");
            System.out.println("(3) yards");
            System.out.println("(4) meters");
            System.out.println("(5) centimerters");
            choice = keyboard.nextInt();

            while (choice < 1 || choice > 5)
            {
                System.out.println("Please choose a valid menu option(1 - 5)"); // making sure they cant chose invalid options
                choice = keyboard.nextInt();
            }

            System.out.println("how many units of measurment would you like converted?"); 
            unit = keyboard.nextInt();

            myConversions = new Conversions();
            myConversions.setFeet(feetT,choice, unit);
            myConversions.setInches(inchesS,choice,unit);
            myConversions.setYards(yardsS,choice,unit);
            myConversions.setMeters(metersS,choice,unit);
            myConversions.setCentimeters(centimetersS, choice,unit);

            System.out.printf(myConversions.toString()); 

            System.out.println("\nEnter 'y' to go again");
            goAgain = keyboard.next().charAt(0);
        }while (goAgain == 'y'); 
        System.out.println("Good-bye");
    }
}  