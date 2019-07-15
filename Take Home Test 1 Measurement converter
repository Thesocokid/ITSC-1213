
/**
 * This is the Constructor/ get and set platform. 
 * I have manually set the conversions baised on the menu option they have chosen. 
 * Also I have formated the toString method with .2f and .3f to make reading the conversions easier on the user. 
 *
 * @author (Chandler H. Godfrey)
 * @version (9-9-2018)
 */

public class Conversions
{

    private double feet;
    private double inches;
    private double yards;
    private double meters;
    private double centimeters;
    //FEET CONSTANT
    private final double FEET_TO_FEET = 1;
    private final double FEET_TO_INCHES = 12;
    private final double FEET_TO_YARDS = 0.333333;
    private final double FEET_TO_METERS = 0.3048;
    private final double FEET_TO_CENTIMETERS = 30.48;
    //INCHES CONSTANT
    private final double INCHES_TO_FEET = 0.0833333;
    private final double INCHES_TO_INCHES = 1;
    private final double INCHES_TO_YARDS = 0.0277778;
    private final double INCHES_TO_METERS = 0.0254;
    private final double INCHES_TO_CENTIMETERS = 2.54;
    //YARDS CONSTANT
    private final double YARDS_TO_YARDS = 1;
    private final double YARDS_TO_INCHES = 36;
    private final double YARDS_TO_FEET = 3;
    private final double YARDS_TO_METERS = 0.9144;
    private final double YARDS_TO_CENTIMETERS = 91.44;
    //METERS CONSTANT
    private final double METERS_TO_METERS = 1;
    private final double METERS_TO_INCHES = 39.3701;
    private final double METERS_TO_YARDS = 1.09361;
    private final double METERS_TO_CENTIMETERS = 100;
    private final double METERS_TO_FEET = 3.28084;
    //CENTIMETERS CONSTANT
    private final double CENTIMETERS_TO_CENTIMENTERS = 1;
    private final double CENTIMETERS_TO_FEET = 0.0328084;
    private final double CENTIMETERS_TO_INCHES = 0.393701;
    private final double CENTIMETERS_TO_METERS = 0.01;
    private final double CENTIMETERS_TO_YARDS= 0.0109361; 
    
    public Conversions()
    {
        feet = 0;
        inches = 0;
        yards = 0;
        meters = 0;
        centimeters = 0;  

    }

    /**
     * This sets all measurments to 
     * @param feetT is the measuremnt being manuplulated. 
     * @param choice this from the menu 1-5. 1 was selected for feet.
     * @param unit unit setting the number of conversions by the user
     */

    public void setFeet(double feetT, int choice, int unit)
    {

        if( choice == 1) // feet 
        {
            feet = FEET_TO_FEET * unit  ; 
            inches = FEET_TO_INCHES * unit; 
            yards = FEET_TO_YARDS* unit; 
            meters = FEET_TO_METERS * unit; 
            centimeters = FEET_TO_CENTIMETERS * unit; 
        }  
    }

    /**
     * This sets all measurments to be conveted into inches.
     * @param inchesS is the measuremnt being manuplulated.
     * @param choice this from the menu 1-5, 2 was selected for inches.
     * @param unit setting the number of conversions by the user.
     */
    public void setInches(double inchesS, int choice, int unit)
    {
        if (choice == 2) // inches 
        {
            feet = INCHES_TO_FEET * unit ; 
            inches = INCHES_TO_INCHES * unit; 
            yards = INCHES_TO_YARDS * unit;
            meters = INCHES_TO_METERS * unit; 
            centimeters = INCHES_TO_CENTIMETERS * unit;

        }
    }

    /**
     * This sets all measurments to be conveted into yards.
     * @param yardsS is the measuremnt being manuplulated.
     * @param choice this from the menu 1-5, 3 was selected for yards.
     * @param unit setting the number of conversions by the user.
     */
    public void setYards(double yardsS, int choice, int unit)
    {
        if (choice == 3)// yards
        {
            yards = YARDS_TO_YARDS * unit; 
            inches = YARDS_TO_INCHES * unit; 
            feet = YARDS_TO_FEET * unit;
            meters = YARDS_TO_METERS * unit; 
            centimeters = YARDS_TO_CENTIMETERS * unit; 
        }
    }

    /**
     * This sets all measurments to be conveted into meters.
     * @param metersS is the measuremnt being manuplulated.
     * @param choice this from the menu 1-5, 4 was selected for meters.
     * @param unit setting the number of conversions by the user.
     */
    public void setMeters(double metersS, int choice, int unit)
    {
        if ( choice == 4) // meters 
        {
            meters = METERS_TO_METERS * unit;  
            inches = METERS_TO_INCHES * unit;
            yards = METERS_TO_YARDS * unit;
            centimeters = METERS_TO_CENTIMETERS * unit;
            feet = METERS_TO_FEET * unit;
        }
    }

    /**
     * This sets all measurments to be conveted into centimeters.
     * @param centimetersS is the measuremnt being manuplulated.
     * @param choice this from the menu 1-5, 5 was selected for centimeters.
     * @param unit setting the number of conversions by the user.
     */
    public void setCentimeters(double centimetersS, int choice, int unit)
    {
        if(choice == 5)                     // centimeters
        {
            centimeters = CENTIMETERS_TO_CENTIMENTERS * unit; 
            feet = CENTIMETERS_TO_FEET * unit;
            inches = CENTIMETERS_TO_INCHES * unit;
            meters = CENTIMETERS_TO_METERS * unit;
            yards = CENTIMETERS_TO_YARDS * unit;
        }
    }

    /**
     * @return This will return feet.
     */
    public double getfeet() 
    {

        return feet; 
    }

    /**
     * @return This will return inches.
     */
    public double getinches()
    {
        return inches; 
    }

    /**
     * @return This will retrun yards.
     */
    public double getyards()
    {
        return yards ; 
    }

    /**
     * @return This will retrun meters.
     */
    public double getmeters()
    {
        return meters ; 
    }

    /**
     * @return This will retrun centimeters.
     */
    public double getcentimeters()
    {
        return centimeters ; 
    }

    /**
     * @return This will retrun the layout for the conversions.
     */
    public String toString() 
    {
        return String.format("\nFeet:%.2f \nInches: %.3f \nYards: %.3f \nMeters: %.2f \nCentimeters: %.2f",feet, inches,
            +yards, meters, centimeters); 

    }
}
