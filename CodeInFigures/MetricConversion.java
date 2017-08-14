import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args)
    {
        double number;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = inputDevice.nextInt();
        calcInchToCentimetres(number);
        calcGallonToLitres(number);


    }

    // 1 inch = 2.54cm
    public static void calcInchToCentimetres(double number) {

        double centimetres;
        centimetres = number * 2.54;
        System.out.println("The number you entered is: " + number + "\nIts value converted from inches to centimetres is: " + centimetres);
    }

    // 1 gallon = 3.7854 litres
    public static void calcGallonToLitres(double number) {

        double litres;
        litres = number * 3.7854;
        System.out.println("The number you entered is: " + number + "\nIts value converted from gallons to litres is: " + litres);
    }
}