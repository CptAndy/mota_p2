
/*Anderson Mota Assignment 2
 * COP3330 Hollander*/


import java.text.DecimalFormat;

public class BodyMassIndex {
    private double height;
    private double weight;
    private double bmi;
    private String category;
    private String ctgry;

    public BodyMassIndex(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.bmi = this.BmiScoreCalculator(height, weight); //Calls the equation and sets it equal to bmi
        this.categoryCalculcator();

    }


    public double BmiScoreCalculator(double height, double weight) {
        double result;


        DecimalFormat df = new DecimalFormat(".00"); //Allows it to display one decimal place

        result = 703 * weight / (height * height);

        result = (double) Math.round(result * 10) / 10; // Rounds a decimal place
/*
        System.out.println("Your BMI is...: " +result); // Displays my result testing purposes*/
        return result;
    }

    public double getBmi() {
        return bmi;
    }
public String ctgryTester(double v){
    if (v < 18.5) {  //Displays the category
        ctgry = "Category...: Underweight";
    } else if (v >= 18.5 && v <= 24.9) {
        ctgry = "Category...: Normal weight";
    } else if (v >= 25 && v <= 29.9) {
        ctgry = "Category...: Overweight";
    } else {

        ctgry = "Category...: Obesity";
    }
    return ctgry;


}
    public String categoryCalculcator() {

        if (this.bmi < 18.5) {  //Displays the category
            category = "Category...: Underweight";
        } else if (this.bmi >= 18.5 && this.bmi <= 24.9) {
            category = "Category...: Normal weight";
        } else if (this.bmi >= 25 && this.bmi <= 29.9) {
            category = "Category...: Overweight";
        } else {

            category = "Category...: Obesity";
        }
        return category;
    }

    public String display() {
        System.out.println("---------------------\n" +
                "Summary\n" +
                "---------------------");
        System.out.println("Height...: " + height);
        System.out.println("Weight...: " + weight);

        System.out.println("---------------------\n" +
                "Categories\n" +
                "---------------------\n" +
                "Underweight < 18.5 \n" +
                "Normal weight = 18.5–24.9 \n" +
                "Overweight = 25–29.9 \n" +
                "Obesity >= 30");
        System.out.println("---------------------\n" +
                "Results\n" +
                "---------------------\n" +
                "BMI...: " + bmi + "\n" +
                category);


        String holder = "";
        return holder;
    }
}

