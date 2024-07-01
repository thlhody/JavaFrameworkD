package staticKeyword;

public class Elev {

    public String nume;
    public String prenume;
    public String scoala = "Mihai Eminescu";
    public static Integer nrElevi=0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;

    }
    public void prezentare () {
        System.out.println("Numele este: "+nume);
        System.out.println("Prenumele este: "+prenume);
        System.out.println("La scoala: "+scoala);
        nrElevi++;
        System.out.println("Numar elevi: "+nrElevi);
    }
}
