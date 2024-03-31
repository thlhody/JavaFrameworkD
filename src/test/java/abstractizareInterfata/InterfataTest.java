package abstractizareInterfata;

import org.testng.annotations.Test;

public class InterfataTest {
    @Test
    public void testMethod(){
        PersoanaStudent Alex = new PersoanaStudent("Gheorghe","Alex", 33);
        PersoanaAngajat Andrei = new PersoanaAngajat("Vasile", "Andrei", 43);
        PersoanaStudentAngajat Tudor = new PersoanaStudentAngajat("Hody", "Tudor", 35);
    }
}
