package BMI.utility;

public class PrinterHelp {
    public static void startMenu() {
        System.out.println("*--- ::Check your BMI:: ---*");
        System.out.println("*--- ::Press a to Proceed:: ---*");
        System.out.println("*--- ::Press b to Quit:: ---*");

    }
    public static void getWeight() {
        System.out.println("*--- ::Enter your Weight in KiloGrams (KG):: ---*");
}

    public static void getHeight() {
        System.out.println("*--- ::Enter your Height is Centimeters (CM):: ---*");
    }

    public static void incorrectInput() {
        System.out.println("Wrong !! Please enter A or B !");
    }

    public static void invalidEntry() {
        System.out.println("invalid entries, please try again.");
    }
}
