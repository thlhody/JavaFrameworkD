package abstractizareInterfata;

public class PersoanaAngajat extends Persoana implements Angajat {

    public PersoanaAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul merge la munca!");

    }

    @Override
    public void prezentaBirou() {
        System.out.println("Angajatul ponteaza zilnic!");

    }

    @Override
    public void pauzaMasa() {
        System.out.println("Angajatul ia pauza de masa!");

    }

    @Override
    public void incasatSalariu() {
        System.out.println("Angajatul s-a 'imbogatit'!");

    }
}
