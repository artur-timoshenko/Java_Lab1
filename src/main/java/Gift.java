import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Gift {
    private ArrayList<Sweet> gifts;

    public Gift() {
        gifts = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        gifts.add(sweet);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : gifts) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void sortCandiesBySugarContent() {
        ArrayList<Candy> candies = getCandies();
        Collections.sort(candies, new Candy.CandyComparator());
    }

    public void printGiftContents() {
        ArrayList<Candy> candies = getCandies();
        for (Candy candy : candies) {
            System.out.println(candy.getInfo());
        }
    }

    public void findCandiesBySugarRange(Scanner scanner) {
        ArrayList<Candy> candies = getCandies();

        System.out.print("Enter the minimum sugar content value: ");
        double minSugar = scanner.nextDouble();
        System.out.print("Enter the maximum sugar content value: ");
        double maxSugar = scanner.nextDouble();

        System.out.println("Candies in the gift with a sugar content starting from " + minSugar + " to " + maxSugar + " g in 100 g:");
        for (Candy candy : candies) {
            if (candy.getSugarContent() >= minSugar && candy.getSugarContent() <= maxSugar) {
                System.out.println(candy.getInfo());
            }
        }
    }

    private ArrayList<Candy> getCandies() {
        ArrayList<Candy> candies = new ArrayList<>();
        for (Sweet sweet : gifts) {
            if (sweet instanceof Candy) {
                candies.add((Candy) sweet);
            }
        }
        return candies;
    }
}
