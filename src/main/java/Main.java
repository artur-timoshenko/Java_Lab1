import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        Scanner scanner = new Scanner(System.in);

        gift.addSweet(new Candy("Mars", 50, 15));
        gift.addSweet(new Candy("Bounty", 45, 50));
        gift.addSweet(new Candy("Snickers", 55, 35));

        System.out.println("Total weight of the gift: " + gift.calculateTotalWeight() + " g");

        gift.sortCandiesBySugarContent();
        System.out.println("Candies in the gift are sorted by sugar content:");
        gift.printGiftContents();

        gift.findCandiesBySugarRange(scanner);

        scanner.close();
    }
}
