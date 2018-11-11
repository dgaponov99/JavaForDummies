package Chapter_11;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class MakeRandomNumsFile {

    public static void main(String[] args) throws FileNotFoundException {
        Random generator = new Random();

        if (args.length < 2) {
            System.out.println("Использование: MakeRandomNumsFile имя_файла.txt число");
            System.exit(1);
        }

        PrintStream printOut = new PrintStream(args[0]);
        int numLines = Integer.parseInt(args[1]);

        for (int count = 0; count < numLines; count++) {
            printOut.println(generator.nextInt(10) + 1);
        }

        printOut.close();
    }
}
