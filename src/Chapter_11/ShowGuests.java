package Chapter_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowGuests {

    public static void main(String[] args) throws FileNotFoundException {
        int guests[] = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }

        System.out.println("Комната\tКоличество");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(guests[roomNum]);
        }

        diskScanner.close();
    }
}
