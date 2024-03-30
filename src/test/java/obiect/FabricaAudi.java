package obiect;

import java.util.List;

public class FabricaAudi extends Masina {

    private List<String> dotariExterioare;
    private Integer pretFinal;


    public FabricaAudi(String marca, String model, String culoare, String carburant, Integer anProd, Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, anProd, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi() {
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare + "\n" + "Pretul final cu dotari este: " + pretFinal);

    }

    public void calculDotari() {
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "Oglinzi electrice":
                    pretFinal += 99;
                    break;
                case "Faruri Led":
                    pretFinal += 119;
                    break;
                case "Camera video":
                    pretFinal += 129;
                    break;
                default:
                    System.out.println("Fara dotarii!");
            }
        }
    }

    public void pornesteMasina() {
//        super.pornesteMasina();
        System.out.println("Masina Audi porneste de la buton");
    }
}
