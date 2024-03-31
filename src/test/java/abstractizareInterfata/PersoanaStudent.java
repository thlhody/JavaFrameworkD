package abstractizareInterfata;

public class PersoanaStudent extends Persoana implements Student {
    public PersoanaStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void prezentaCurs() {
        System.out.println("Studentul merge la curs!");

    }

    @Override
    public void examinare() {
        System.out.println("Studentul sustine examen!");

    }

    @Override
    public void studiat() {
        System.out.println("Studentul invata!");

    }
}
