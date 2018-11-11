package Chapter_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {
        final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
        final String CONNECTION = "jdbc:derby:AccountDatabase";

        try {
            Class.forName(DRIVER).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(CONNECTION);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("create table ACCOUNTS                 "
                    + "  (NAME VARCHAR(32) NOT NULL PRIMARY KEY,  "
                    + "   ADDRESS VARCHAR(32),                     "
                    + "   BALANCE FLOAT)                         ");

            statement.executeUpdate("insert into ACCOUNTS values ('Барри Берд', 'улица Киберов, 222', 24.02 )");
            statement.executeUpdate("insert into ACCOUNTS values ('Джо Доу', 'улица Лудитов, 112', 55.63 )");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
