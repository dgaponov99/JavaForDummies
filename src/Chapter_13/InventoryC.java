package Chapter_13;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryC {

    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Сколько коробок вы насчитали? ");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);

            if (numBoxes < 0) {
                throw new OutOfRangeException();
            }

            System.out.println("Общая стоимость: " + currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Это не число");
        } catch (OutOfRangeException e) {
            System.out.println("Это невозможно!");
        }

        keyboard.close();
    }
}
