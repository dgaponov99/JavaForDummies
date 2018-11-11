package Chapter_10;

public class TrackPopulation {

    public static void main(String[] args) {
        City smackoverAR = new City();
        smackoverAR.population = 2232;
        birth(smackoverAR);

        System.out.println(smackoverAR.population);
    }

    static void birth(City aCity) {
        aCity.population++;
    }
}
