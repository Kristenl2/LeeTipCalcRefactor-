import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");

        //Records people in the group and their tip percentage
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percentage = scan.nextInt();
        TipCalculator group = new TipCalculator(people,percentage);

        //Records the cost of all item(s)
        System.out.print("Enter a cost in dollars and cents: ");
        double price = scan.nextDouble();
        group.addMeal(price);
        while (price != 0) {
            System.out.print("Enter a cost in dollars and cents: ");
            price = scan.nextDouble();
            group.addMeal(price);
        }

        //Prints the cost without tip and tip percentage
        System.out.println("---------------------");
        System.out.println("Total Bill Before Tip: " + group.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + group.getTipPercentage());

        //Prints the tip cost
        String rounded = formatter.format(group.tipAmount());
        System.out.println("Total Tip: " + rounded);


        //Prints cost with tip
        String rounded1= formatter.format(group.totalBill());
        System.out.println("Total Bill With Tip: " + rounded1);

        //Prints the cost per people
        String rounded2 = formatter.format(group.perPersonCostBeforeTip());
        System.out.println("Per Person Cost Before Tip: " + rounded2);
        String rounded3 = formatter.format(group.perPersonTipAmount());
        System.out.println("Tip Per Person: " + rounded3);
        String rounded4 = formatter.format(group.perPersonTotalCost());
        System.out.println("Total Cost Per Person: " + rounded4);
    }
}