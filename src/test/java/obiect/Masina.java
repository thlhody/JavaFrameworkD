package obiect;

public class Masina {
    private String marca;
    private String model, culoare, carburant;
    private Integer anProd, capacitateCilindrica;
    private Integer pret;

    public Masina(String marca, String model, String culoare, String carburant, Integer anProd, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anProd = anProd;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public Masina(String marca, String model, String culoare, String carburant, Integer anProd, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anProd = anProd;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }


    public void prezentareMasina() {
        if (pret != null) {
            System.out.println("Marca masinii este " + marca + " avand modelul " + model + ". Culoarea " + culoare + ", tip carburant " +
                    carburant + ".\nAvand capacitatea cilindrica: " + capacitateCilindrica + ". Produsa in anul: " + anProd +
                    ". Pretul initial: " + pret + "lei");
        } else {
            System.out.println("Marca masinii este " + marca + " avand modelul " + model + ". Culoarea " + culoare + ", tip carburant " +
                    carburant + ".\nAvand capacitatea cilindrica: " + capacitateCilindrica + ". Produsa in anul: " + anProd +
                    " masina moca");
        }
    }
    //>=2023 = 5lei
    //2020-2023 = 10lei
    //<=2020 = 20lei

    public void calculImpozit() {
        if (anProd >= 2023) {
            System.out.println("Platesti pentru " + marca + " din anul " + anProd + " Impozit: 5lei");
        } else if (anProd > 2020 && anProd <= 2022) {
            System.out.println("Platesti pentru " + marca + " din anul " + anProd + " Impozit: 10lei");
        } else if (anProd == 2020) {
            System.out.println("Platesti pentru " + marca + " din anul " + anProd + " Impozit: 20lei");
        } else {
            System.out.println("Nu platesti impozit!");

        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public Integer getAnProd() {
        return anProd;
    }

    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAnProd(Integer anProd) {
        this.anProd = anProd;
    }
}
