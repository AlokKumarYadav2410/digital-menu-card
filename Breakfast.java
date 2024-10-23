import java.util.Scanner;

public class Breakfast {
    Scanner input = new Scanner(System.in);
    public float breakFastOrder() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Welcome to our breakfast ordering station....");
        System.out.println("Type");
        System.out.println("a for Aloo Paratha | price - Rs. 20");
        System.out.println("m for Maggie | price - Rs. 50");
        System.out.println("p for Poha | price - Rs. 30");
        System.out.println("t for Tea | price - Rs. 10");

        char food = input.nextLine().charAt(0);
        boolean orderingItem = true;
        float price = 0;
        while (orderingItem) {
            if (food == 'x' || food == 'X') {
                orderingItem = false;
            } 
            else {
                switch (food) {
                    case 'a':
                        price += 20;
                        System.out.println("Total current price: " + price);
                        break;

                    case 'm':
                        price += 50;
                        System.out.println("Total current price: " + price);
                        break;

                    case 'p':
                        price += 30;
                        System.out.println("Total current price: " + price);
                        break;

                    case 't':
                        price += 10;
                        System.out.println("Total current price: "+price);
                        break;
                    default:
                        System.out.println("Invalid Input!!!\\nPlease enter the value correctly!");
                        break;
                } 
            System.out.println("What else do you want? If not then press x");
            food = input.next().charAt(0);
            }
           
        }
        System.out.println("---------------------------------------------------------");
        return price;
    }
}
