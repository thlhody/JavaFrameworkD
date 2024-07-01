package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev elev = new Elev("Tudor","Hody");
        elev.prezentare();
        System.out.println();
        Elev elevA = new Elev("Andrei","Vasile");
        elevA.prezentare();
    }

}
