package day03;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private List<String> lines = new ArrayList<>();
    private List<Integer> dicounts = new ArrayList<>();

    public void readFile(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            scanner.nextLine();
            while ((scanner.hasNextLine())) {
                lines.add(scanner.nextLine());
                String[] parts = scanner.nextLine().split("[%;]");
                dicounts.add(Integer.parseInt(parts[2]));
            }
        } catch (NumberFormatException | IOException ioe) {
            throw new IllegalStateException("Not read file", ioe);
        }
    }

    public int getDiscountFromAge(int age, int numberOfChildren) {
        int discounts = 0;
        if (age <= 6) {
            discounts = Math.max(discount, discounts.get(0));
        }
        if (age < 26) {
            discounts = Math.max(discount, discounts.get(1));
        }
        if (age < 65) {
            discounts = Math.max(discount, discounts.get(2));
        }
        if (age > 18 && numberOfChildren >= 3) {
            discounts = Math.max(discount, discounts.get(3));
        }
        return discounts;
    }

    public int getDiscountFromAge(int age) {
        return getDiscountFromAge(age, 0);
    }
}
