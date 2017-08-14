import java.util.Scanner;

public class BookStoreCredit {
    public static void main(String[] args)
    {
        String name;
        int GPA;
        int credit = 10;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.println("Please enter your GPA: ");
        GPA = inputDevice.nextInt();
        calcCredit(name, GPA, credit);


    }
    public static void calcCredit(String inputName, int inputGPA, int credit) {

        int creditInDollars;
        creditInDollars = inputGPA * credit;
        System.out.println("Your name is: " + inputName + "\nYour GPA is: " + inputGPA + "\nYour Book Store Credit is: " + creditInDollars);

    }
}