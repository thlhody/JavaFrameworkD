package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative - if...then...else / switch...case
    // if - se bazeaza pe conditii
    // case - se bazeaza pe valoare
    @Test
    public void metodaTest(){
        numarMaiMareCaX(9);
        numarMaiMareCaX(10);
        numarMaiMareCaX(11);
        numarParPozitiv(0);
        numarParPozitiv(10);
        numarParPozitiv(9);
        numarParPozitiv(-10);
        numarParPozitiv(-9);
        propozitie("Ana are mere","Ana","mere");
        propozitie("Ana are mere","Ana","pere");
        propozitie("ana are mere","Ana","mere");
        zileleSaptamana(2);

    }
    //verificam daca un numar este mai mare ca 10
    public void numarMaiMareCaX (Integer numar){
        if(numar>10){
            System.out.println("Numarul "+numar+" este mai mare ca 10");
        }else if(numar==10){
            System.out.println("Numarul "+numar+" este egal cu 10");
        }else {
            System.out.println("Numarul "+numar+" este mai mic ca 10");
        }
    }
    //verificam daca un numar este par si pozitiv
    public void numarParPozitiv(Integer numar){
        if(numar%2==0){
            if(numar>=0){
                System.out.println("Numarul "+numar+" este par si pozitiv");
            }else {
                System.out.println("Numarul "+numar+" este par si negativ");
            }
        }else {
            if(numar>=0){
                System.out.println("Numarul "+numar+" este impar si pozitiv");
            }else {
                System.out.println("Numarul "+numar+" este impar si negativ");
            }
        }
    }
    //verificam ca o propozitie contine 2 cuvinte
    //Ana are mere => caut ana si mere
    //! negatia lui &&
    public void propozitie(String propozitie, String cuvant1, String cuvant2){
        if(!(propozitie.contains(cuvant1) && propozitie.contains(cuvant2))){
            System.out.println(cuvant1+" chiar are "+cuvant2);
        }else {
            System.out.println("Ana nu are mere");
        }
    }
//reprezentam cazurile pentru zilele saptamani
    public void zileleSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi e Luni");
                break;
            case 2:
                System.out.println("Azi e Marti");
                break;
            case 3:
                System.out.println("Azi e Miercuri");
                break;
            default:
                System.out.println("Nu exista ziua respectiva");
        }
    }
}
