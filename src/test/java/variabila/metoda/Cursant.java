package variabila.metoda;

import org.testng.annotations.Test;

public class Cursant {

    //clasa - sablon specific unui anumit obiect/produs.
    //o clasa trebuie sa contina un nume.
    //recunoastem o clasa intr-un fisier java dupa cuvantul class.
    //intr-un fisier java putem aveam mai multe (nu este un practice bun).

    //variabila - proprietata unei clase(atribuit unei clase).
    //intr-o clasa putem aveam mai multe variabile.
    //exista 2 tipuri de variabile:globale si locale.
    //variabila globala = vizibila peste tot in acest fisier.
    //variabile locala = vizibila doar in locul unde este definita.
    //pentru inceput toate variabilele globale sunt publice.
    //diferenta dintre global si local o face access control (public).
    //tipuri de date: String - sir de caractere.
    //                Integer - numere intregi.
    //                Double/Float - numere cu zecimale. double 64bit, float 32bit
    //                Character - caractere
    //                Boolean - true/false only.
    //nu este obligatoriu ca o variabile sa primeasca o valoare cand o definim.

    public String nume,prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sexul;
    public Boolean areRestante;

    //metoda - actiunea unei clase.
    //intr-o clasa putem avea mai multe metode diferentiate prin nume.
    //metodele sunt de 2 feluri: void si return
    //void - cea mai des folosita care are ca scop sa execute si sa afiseze informatia.
    //return - are ca scop sa execute si sa returneze informatia.
    //o metoda poate sau nu sa contina parametri.
    //parametri se diferentiaza prin numar/nume/tip.

    @Test
    public void metodaTest(){
        nume="Hody";
        prenume="Tudor";
        varsta=36;
        inaltime=1.72;
        greutate= 65.0f; //f - face conversia din double in float.
        sexul='M';
        areRestante=false;
        prezentareCursant();
        prezentareCursantParam("Hody","Tudor",36,1.72,65.0f,'M',false);
        calculMedie(9,10,8,7,6);
        System.out.println(getSalariu());

    }
    public void prezentareCursant(){

        System.out.println("Ma cheama "+prenume+" "+nume+". An varsta de "+varsta+"ani, inaltimea "+inaltime+
                "cm si greutatea de "+greutate+"kg. Avand sexul: "+sexul+". Are restante: "+areRestante);
    }
    public void prezentareCursantParam(String param1, String param2, Integer param3, Double param4, Float param5,
                                       Character param6,Boolean param7){

        System.out.println("Parametrizare: Ma cheama "+param2+" "+param1+". An varsta de "+param3+"ani, inaltimea "+param4+
                "cm si greutatea de "+param5+"kg. Avand sexul: "+param6+". Are restante: "+param7);
    }
    //calculam media cursantului din sesiune
    public void calculMedie(Integer nota1, Integer nota2, Integer nota3, Integer nota4, Integer nota5){

        Integer media=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("Media cursantului este: "+media);
        // variabila media este variabila locala este folosita doar in metoda curenta.
    }

    //exemplu metoda cu return
    //am facut o actiune care returneaza salar
    public Integer getSalariu(){
        Integer salar= 3999;
        return salar;
    }
}
