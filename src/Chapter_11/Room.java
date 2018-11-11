package Chapter_11;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Room {
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

    public void readRoom(Scanner diskScanner){
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom() {
        System.out.println("\t" + guests + "\t  " + currency.format(rate) + " " + (smoking ? "да" : "нет"));
    }
}
