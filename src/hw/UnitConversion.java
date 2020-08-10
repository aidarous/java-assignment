package hw;
import java.util.Scanner;
//4. Write a Java program that reads a number in inches, converts it to meters.
//One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters
public class UnitConversion {

    public static void main(String[] args){
        inchesToMeters();
    }
    public static void inchesToMeters() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter inches");
        double inches = in.nextDouble();
        double meterCenverter = inches * .0254;
        System.out.println(inches + "inches is " + meterCenverter + " meters");
    }
}
