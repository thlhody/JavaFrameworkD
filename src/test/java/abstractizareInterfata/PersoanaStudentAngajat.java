package abstractizareInterfata;

public class PersoanaStudentAngajat extends Persoana implements Student, Angajat {
    public PersoanaStudentAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {

    }

    @Override
    public void prezentaBirou() {

    }

    @Override
    public void pauzaMasa() {

    }

    @Override
    public void incasatSalariu() {

    }

    @Override
    public void prezentaCurs() {

    }

    @Override
    public void examinare() {

    }

    @Override
    public void studiat() {

    }
}
