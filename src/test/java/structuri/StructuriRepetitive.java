package structuri;

import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class StructuriRepetitive {
    //structuri repetitive - for,while,for each

    @Test
    public void metodaTest(){
        afisamPrimeleNnumere(10);
        System.out.println("lalala");
        afisamPrimeleNrWhile(15);
        System.out.println("lalala");
        afisamNrPare();

    }

    //afisam primele 15numere
    // for (Integer index=0; index<=capat; index=index+1)
    // definim var index de unde incepe; conditia care trebuie sa o indeplineasca adica mai mic decat capat;
    // pana se indeplineste conditia index<=capat adica aduna dupa fiecare +1

    public void afisamPrimeleNnumere (Integer capat){
        for(int i=0; i<=capat; i++){
            System.out.println("Valeleu "+ i);
        }
    }
    // aceasi medtoa cu while

    public void afisamPrimeleNrWhile(Integer capat){
        Integer i=5;
        while (i<=capat){
            System.out.println("Valeleu "+ i);
            i++;
        }
    }
    public void afisamNrPare(){
        for (int i=0; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
