package Chapter_10;

public class EnglishSpeakingWorld2 {
    String mars;

    void visitIdaho() {
        System.out.println("Выполняется visitIdaho():");

        mars = "   красная планета";
        String atomicCity = "   население: 25 человек";

        System.out.println(mars);
        System.out.println(atomicCity);
    }

    void visitNewJersey() {
        System.out.println("Выполняется visitNewJersey:");

        System.out.println(mars);
        //System.out.println(atomicCity);  Неразрешимая ссылка
    }
}
