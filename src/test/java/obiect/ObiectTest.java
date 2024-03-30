package obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {
    @Test
    public void metodaTest() {

        List<String> dotariExterioareAudi = Arrays.asList("Oglinzi electrice", "Faruri Led", "Camera video");
        FabricaAudi AudiPrimavera = new FabricaAudi("Audi", "R5", "Negru"
                , "Benzina", 2024, 1999, 20000, dotariExterioareAudi);
        AudiPrimavera.prezentareAudi();
        AudiPrimavera.setCuloare("verde");
        System.out.println();
        AudiPrimavera.prezentareAudi();
        AudiPrimavera.pornesteMasina();
        System.out.println();


        List<String> dotariExterioareBmw = Arrays.asList("Oglinzi electrice", "Faruri Led", "Camera video");
        List<String> dotariInterioareBmw = Arrays.asList("Scaune incalzite", "Incalzire volan", "Senzor parcare");
        FabricaBmw BMWVerde = new FabricaBmw("BMW", "X5", "Verde",
                "Diesel", 2021, 2999, 15000, dotariExterioareBmw, dotariInterioareBmw);
        BMWVerde.prezentareBmw();
        BMWVerde.pornesteMasina();
        System.out.println();

        Masina Toyota = new Masina("Toyota", "Prius", "Alb",
                "Benzina", 2015, 999, 10000);
        Toyota.prezentareMasina();

        System.out.println();
        AudiPrimavera.calculImpozit();
        System.out.println();
        BMWVerde.calculImpozit();
    }
}
