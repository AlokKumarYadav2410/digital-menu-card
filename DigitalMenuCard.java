import java.util.Scanner;
public class DigitalMenuCard {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Dinner dinner = new Dinner();
        Lunch lunch = new Lunch();
        Breakfast breakfast = new Breakfast();

        System.out.println("\n---------- Welcome to our Digital Menu Card!!! ----------");
        System.out.println("Type");
        System.out.println("b for breakfast");
        System.out.println("l for lunch");
        System.out.println("d for dinner");
        System.out.println();

        char mealType = input.nextLine().charAt(0);

        switch (mealType) {
            case 'b':
                float totalBreakFastBill = breakfast.breakFastOrder();
                System.out.println("Your total bill is = "+ totalBreakFastBill);
                System.out.println("Thank you for ordering!!");
                System.out.println("---------------------------------------------------------");
                break;
            case 'l':
                float totalLunchBill = lunch.lunchOrder();
                System.out.println("Your total bill is = "+ totalLunchBill);
                System.out.println("Thank you for ordering!!");
                System.out.println("---------------------------------------------------------");
                break;

            case 'd':
                float totalDinnerBill = dinner.dinnerOrder();
                System.out.println("Your total bill is = "+ totalDinnerBill);
                System.out.println("Thank you for ordering!!");
                System.out.println("---------------------------------------------------------");
                break;

            default:
                System.out.println("Invalid Input!!!\nPlease try again!!!");
                main(args);
                break;
        }
    }
}