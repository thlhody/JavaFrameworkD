package obiect;

import java.util.ArrayList;
import java.util.List;

public class FabricaBmw extends Masina {

    List<String> dotariExterioare = new ArrayList<>();
    List<String> dotariInterioare = new ArrayList<>();
    private Integer pretFinal;

    public FabricaBmw(String marca, String model, String culoare, String carburant, Integer anProd,
                      Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare, List<String> dotariInterioare) {
        super(marca, model, culoare, carburant, anProd, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareBmw() {
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
        System.out.println("Pretul final cu dotari este: " + pretFinal);
    }

    public void afisarePret() {
        System.out.println("Pret final: " + pretFinal);
    }

    public void afisarePret(Integer reducere) {
        System.out.println("Pre final cu reducere:");
    }

    public void afisarePret(String voucher) {
        System.out.println("Pre final cu reducere:");
    }


    public void calculDotari() {
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "Oglinzi electrice":
                    pretFinal += 69;
                    break;
                case "Faruri Led":
                    pretFinal += 89;
                    break;
                case "Camera video":
                    pretFinal += 109;
                    break;
                default:
                    System.out.println("Fara dotarii!");
            }
        }
        for (int i = 0; i < dotariInterioare.size(); i++) {
            switch (dotariInterioare.get(i)) {
                case "Scaune incalzite":
                    pretFinal += 99;
                    break;
                case "Incalzire volan":
                    pretFinal += 189;
                    break;
                case "Senzor parcare":
                    pretFinal += 79;
                    break;
                default:
                    System.out.println("Fara dotarii!");
            }
        }
    }

    public void pornesteMasina() {
        System.out.println("Masina BMW porneste de la buton si cheie si distanta");
    }
}
