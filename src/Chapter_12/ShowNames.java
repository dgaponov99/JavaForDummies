package Chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShowNames {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> people = new ArrayList<>();
        Scanner diskScanner = new Scanner(new File("names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        people.remove(0);
        people.add(2, "Димочка");

        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        diskScanner.close();
    }
}
