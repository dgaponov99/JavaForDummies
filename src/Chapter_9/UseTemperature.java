package Chapter_9;

public class UseTemperature {
    public static void main(String[] args) {
        final String format = "%5.2f градусов по %s\n";

        Temperature temp = new Temperature();
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(32.0);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(TempScale.CELSIUS);
        System.out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(2.73, TempScale.KELVIN);
        System.out.printf(format, temp.getNumber(), temp.getScale());
    }
}
