import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GiftTest {

    @Test
    public void testGift() {
        Gift gift = new Gift();

        gift.addSweet(new Candy("Mars", 50, 15));
        gift.addSweet(new Candy("Bounty", 45, 50));
        gift.addSweet(new Candy("Snickers", 55, 35));

        double expectedTotalWeight = 50 + 45 + 55;
        assertEquals(expectedTotalWeight, gift.calculateTotalWeight(), 0.01);

        // Mocking user input for the scanner
        String input = "10\n40\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        gift.findCandiesBySugarRange(scanner);

        // Reset System.in
        System.setIn(System.in);
    }
}
