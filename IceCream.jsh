import java.util.Scanner;

public class IceCream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastSixDigits = 123456;
        int vanillaPrice = lastSixDigits % 100;
        int chocolatePrice = (lastSixDigits / 100) % 100;
        int strawberryPrice = lastSixDigits / 10000;
        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
        char flavorChoice = scanner.next().charAt(0);
        int pricePerScoop = 0;
        switch (flavorChoice) {
            case 'v':
                pricePerScoop = vanillaPrice;
                break;
            case 'c':
                pricePerScoop = chocolatePrice;
                break;
            case 's':
                pricePerScoop = strawberryPrice;
                break;
            default:
                System.out.println("We don't have that flavour.");
                scanner.close();
                return;
        }
        System.out.print("How many scoops would you like? ");
        int numberOfScoops = scanner.nextInt();
        if (numberOfScoops < 1) {
            System.out.println("We don't sell just a cone.");
        } else if (numberOfScoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
        } else {
            int conePrice = 100;
            int totalPriceInPence = conePrice + (pricePerScoop * numberOfScoops);
            int pounds = totalPriceInPence / 100;
            int pence = totalPriceInPence % 100;
            System.out.printf("That will be %d.%02d please.%n", pounds, pence);
        }
        scanner.close();
    }
}