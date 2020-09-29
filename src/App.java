import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    public static double displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double total = 0;
        for (BodyMassIndex bm : bmiData
        ) {
            total += bm.getBmi();

        }
        double average = total / bmiData.size();
        System.out.println("Average..: " + average);
        return average;
    }

    public static void displayBmiInfo(BodyMassIndex bmi) {

        System.out.println(bmi.display());
        /*  System.out.println(displayBmiStatistics());*/
    }

    public static double getUserHeight() {
        double height = 0;

        Scanner input = new Scanner(System.in);
        while (height <= 0) {    //Letting me know that while the users input is negative, keep on running till positive

            System.out.println("Using Inches as measurement, please enter your height...: ");
            height = input.nextDouble();
            if (height > 0) {

            } else {
                System.out.println("Please Enter a positive integer only...");
            }
        }


        return height;
    }

    public static double getUserWeight() {
        double weight = 0;

        Scanner input = new Scanner(System.in);
        while (weight <= 0) {    //Letting me know that while the users input is negative, keep on running till positive

            System.out.println("Using pounds as measurement, please enter your Weight...: ");
            weight = input.nextDouble();

            if (weight > 0) {

            } else {
                System.out.println("Enter a positive number");
            }
        }


        return weight;

    }


    public static boolean moreInput() {
        Scanner in = new Scanner(System.in);
        boolean option;
        boolean repeat;
        String response;
        System.out.println("Would you like to create a profile?");
        System.out.println("Y.yes                               N.no");

        while (true) {
            response = in.nextLine().trim().toLowerCase();


            if (response.equals("y")) {
                option = true;
                break;
            } else if (response.equals("n")) {
                option = false;

                break;
            } else {
                System.out.println("Enter one of the two options");

            }

        }


        return option;
    }

}
