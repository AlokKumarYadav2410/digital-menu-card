import java.util.Scanner;

public class Dinner {

    Scanner input = new Scanner(System.in);
    
    public float dinnerOrder(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Welcome to our Dinner ordering station....");
        System.out.println("Type");
        System.out.println("paneer for paneer do pyaza | price - Rs. 80");
        System.out.println("idli for idli | price - Rs. 30");
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
                    case "paneer":
                        price += 80;
                        System.out.println("Total current price: " + price);
                        break;

                    case "veg thali":
                        price += 50;
                        System.out.println("Total current price: " + price);
                        break;

                    case "idli":
                        price += 30;
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
