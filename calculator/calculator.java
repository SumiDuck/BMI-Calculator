package BMI.calculator;

import BMI.utility.PrinterHelp;

public class calculator {

    double height;
    double weight;
    String bmiCategory;
    double bmi;

    public calculator(double height, double weight) {
        this.height = height / 100.0; // Convert height from cm to meters
        this.weight = weight;
        this.bmi = calculateBMI();
        this.bmiCategory = calculateBMICategory(); // Assign BMI category


    }

    public double calculateBMI() {
        return weight / (height * height); // BMI formula

    }

    public String calculateBMICategory() {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else
            return "Obese";

    }

    public String getRoundedBMI() {
        return String.format("%.2f", bmi);  // Returns BMI rounded to 2 decimal places
    }

}
