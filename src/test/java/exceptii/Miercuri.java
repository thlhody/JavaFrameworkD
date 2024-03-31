package exceptii;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Miercuri {

    //exceptie - eroare care apare in momentul cand programul ruleaza;
    //         - trebuie tratate deoarce contin informatii care pot sa fie exploatate;
    //exemplu - citim continutul unui fisier care nu exista -> fileNotFoundException;
    //        - citim date dintr-un tabel din baza de date -> sqlException;
    //        - exista 2 ctipuri de exceptii: checked si unchecked;
    //checked -> exceptii care se trateaza in timpul compilarii;
    //unchecked -> exceptii care nu se trateaza in timpul compilarii;
    //ca sa tratam o exceptie, ne folosim de constructie: try..catch..finally;
    //exista 2 cuvinte cheie pentru tratarea exceptiilor: throw si throws;
    //throw -> ii folosit sa arunce o exceptie anume(explicit);
    //      -> este regasit in interiorul unei metodel
    //throws -> este folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie;

    @Test
    public void testMethod() throws FileNotFoundException {
        incarcareFisier();
        System.out.println();
        afisareCursanti();
        System.out.println();
        //cumparEnergizant();
        System.out.println();
        incarcaFisierV2();
    }
        //checked exception(sublinieaza cu rosu);
    public void incarcareFisier(){
        try{
            File file = new File("addres/resources/file");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Nu exista fisierul: "+e);
        }
        finally {
            System.out.println("A intrat pe finally indiferent daca a cazut sau nu");
        }
    }
        //unchecked exception(nu subliniaza);
    public void afisareCursanti(){
        String[] cursanti = new String[2];
        cursanti[0]="Tudor";
        cursanti[1]="Bogdan";
        //cursanti[2]="Alex";
        for (int i=0; i<cursanti.length; i++){
            System.out.println("Nume Cursanti: "+cursanti[i]);
        }
    }

    public void cumparEnergizant(){
        Integer varsta=15;
        if(varsta<=18){
            throw new RuntimeException("Esti minor");
        }
    }

    public void incarcaFisierV2() throws FileNotFoundException {
        File file = new File("addres/resources/file");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

}
