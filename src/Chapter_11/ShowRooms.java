package Chapter_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowRooms {

    public static void main(String[] args) throws FileNotFoundException {
        Room rooms[];
        rooms = new Room[10];

        Scanner diskScanner = new Scanner(new File("RoomList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }

        System.out.println("Комната Кол-во Тариф Для курящих");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum + "\t");
            rooms[roomNum].writeRoom();
        }

        diskScanner.close();
    }
}
