package Chapter_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FindVacancy {

    public static void main(String[] args) throws FileNotFoundException {
        int gusets[] = new int[10];
        int roomNum;

        Scanner discScanner = new Scanner(new File("GuestList.txt"));

        for (roomNum = 0; roomNum < 10; roomNum++) {
            gusets[roomNum] = discScanner.nextInt();
        }
        discScanner.close();

        roomNum = 0;
        while (roomNum < 10 && gusets[roomNum] != 0){
            roomNum++;
        }

        if (roomNum == 10) {
            System.out.println("Извините, свободных комнат нет.");
        } else {
            System.out.print("Сколько человек поселятся в комнате " + roomNum + "? ");

            Scanner keyboard = new Scanner(System.in);
            gusets[roomNum] = keyboard.nextInt();
            keyboard.close();

            PrintStream listOut = new PrintStream("GuestList.txt");
            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(gusets[roomNum] + " ");
            }
            listOut.close();
        }
    }
}
