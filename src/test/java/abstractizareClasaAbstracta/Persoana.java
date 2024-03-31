package abstractizareClasaAbstracta;

public abstract class Persoana {

    //Clasa abstracta - se recunoaste dupa cuvantul "abstract";
    //                - poate sau nu sa contina o metoda abstracta;
    //                - putem mosteni o singura clasa abstracta
    //                - putem avea un constructor -> nu poti face un obiect;
    //                - poate sa implementeze o interfata;
    //Metoda abstracta - trebuie sa contina cuvantul abstract;

    private String nume, prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
    //metoda cu body
    public void prezentare(){
        System.out.println("metoda cu body");
    }

    public abstract void munceste();
    public abstract void prezentareBirou();
    public abstract void pauzaMasa();
    public abstract void incasatSalariu();
    public abstract void prezentaCurs();
    public abstract void examinare();
    public abstract void studiat();
}

