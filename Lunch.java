import java.util.Scanner;

public class Lunch {
    Scanner input = new Scanner(System.in);
    public float lunchOrder(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Welcome to our lunch ordering station....");
        System.out.println("Type");
        System.out.println("chole for Chole Bhature | price - Rs. 20");
        System.out.println("veg thali for Veg Thali | price - Rs. 50");

        String food = input.nextLine();
        boolean orderingItem = true;
        float price = 0;
        while (orderingItem) {
            if (food.equals("x") || food.equals("X")) {
                orderingItem = false;
            } 
            else {
                switch (food) {
                    case "chole":
                        price += 20;
                        System.out.println("Total current price: " + price);
                        break;

                    case "veg thali":
                        price += 50;
                        System.out.println("Total current price: " + price);
                        break;
                    default:
                        System.out.println("Invalid Input!!!\\nPlease enter the value correctly!");
                        break;
                } 
            System.out.println("What else do you want? If not then press x");
            food = input.nextLine();
            }
           
        }
        System.out.println("---------------------------------------------------------");
        return price;
    }
}
