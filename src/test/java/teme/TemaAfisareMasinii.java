package teme;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TemaAfisareMasinii {
    List<Integer> listPosition = new ArrayList<>();
    List<String> listBrand = new ArrayList<>();
    List<Integer> listAn = new ArrayList<>();
    @Test
    public void metodaTest(){
        // declar parametrul pozitie in asa fel incat sa numere de la 1 la cate intrari am nevoie.
        Integer position=1;
        // titlu.
        System.out.println("<><><><><><><><><><><><><>");
        System.out.println("Afisam 4 modele de masini:");
        System.out.println("<><><><><><><><><><><><><>");
        //datele introduse pentru diferitele tipurid de masinii, sub forma de parametrii unei metode
        modeleMasini(position++, "Dacia", " Hatchback", 'Y','N',"Negru", false,999,7.2,2022);
        modeleMasini(position++, "Mercedes", " Sedan", 'N','Y',"Alb", true,2200,5.2,2014);
        modeleMasini(position++, "Skoda", " SUV", 'Y','Y',"Gri", true,1520,6.2,2020);
        modeleMasini(position++, "Opel", " Break", 'Y','N',"Rosu", false,1200,7.2,2021);
        //metoda care afiseaza impozitul in functie de an.
        afisareImpozit();

        System.out.println("<><><><><><><><><><><><><>");
        System.out.println("Afisam 4 modele de masini:");
        System.out.println("<><><><><><><><><><><><><>");
        System.out.println("   |  Masina  |    Model   |  Culoare   | Auto/Man | Alarma | Motorizare | ConsumMediu | Anul |");
        System.out.println("   |----------|------------|------------|----------|--------|------------|-------------|------|");

        modeleMasiniTabel(position++, "Fiat", " Sedan", 'Y','N',"Maro", true,999,4.2,2015);
        modeleMasiniTabel(position++, "BMW", " Hatchback", 'N','Y',"Verde", false,3110,10.2,2010);
        modeleMasiniTabel(position++, "Porsche", " SUV", 'N','Y',"Rosu", false,2540,9.2,2018);
        modeleMasiniTabel(position, "Toyota", " Pickup", 'Y','N',"Bej", true,4200,6.2,2023);
        afisareImpozitTabel();
    }
    public void modeleMasini(Integer pozitie, String brand, String model, Character transManual, Character transAuto,
                             String culoare, Boolean alarma, Integer motorizare, Double consumM, Integer anProd){
        //definim modelul de afisare a fiecarei masinii individual folosind parametrii metodei
        System.out.println(pozitie+". Este: "+brand+". Modelul:"+model+". Culoare: "+culoare+".");
        System.out.println("   Variante cutie de viteze automata/manuala: "+transAuto+"/"+transManual+". Alarma?: "+alarma+".");
        System.out.println("   Motorizare(cm3): "+motorizare+"cm3. Consum mediu: "+consumM+". An productie: "+anProd+".");
        System.out.println("-----------------------------------------------");
        // adaugam 3 parametri din metoda respectiva in liste individuale pentru a le putea accesa in alta metoda si le transformam in variabile globale.
        listPosition.add(pozitie);
        listBrand.add(brand);
        listAn.add(anProd);
    }
    public void afisareImpozit(){
        //titlu
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Vom afisa impozitul pentru fiecare model de masina in functie de An productie:");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        //accesam lista si folosim parametrul pozitie pentru a le lua in ordine din lista folosind functia for.
        for(int i=0; i<listPosition.size(); i++){
            // atribuim variabile pentru datele din lista ca sa putem sa le folosim la output.
            Integer pozitie=listPosition.get(i);
            String model= listBrand.get(i);
            Integer anProd=listAn.get(i);
            // folosim functia if else-if else, pentru a analiza fiecare valoare din variabila anProd, si reda raspunsul corespunzator
            if(anProd<=2015){
                // daca anul este mai mic sau egal cu 2015 (intre 0-2015 inclusiv)
                System.out.println(pozitie+". Pentru "+model+" din anul "+anProd+". Impozitul va fi de 200lei.");
                System.out.println("-----------------------------------------------");
            } else if(anProd<=2020) {
                // daca anul este mai mic sau egal cu 2020 (intre 2016-2020 inclusiv)
                System.out.println(pozitie + ". Pentru " + model + " din anul " + anProd + ". Impozitul va fi de 100lei.");
                System.out.println("-----------------------------------------------");
            }else{
                //orice este peste 2021 (de la 2021-.... in sus)
                System.out.println(pozitie+". Pentru "+model+" din anul "+anProd+". Impozitul va fi de 50lei.");
                System.out.println("-----------------------------------------------");
            }
        }
    }
    public void modeleMasiniTabel(Integer pozitie, String brand, String model, Character transManual, Character transAuto,
                                  String culoare, Boolean alarma, Integer motorizare, Double consumM, Integer anProd){
        // %d - reprezinta Integer, %s - reprezinta String, %c - reprezinta un Character, %b - reprezinta Boolean ,
        // %.2f - reprezinta Float/Double/BigDecimal si va arata doar 2 zecimale in functie de cate zecimale dorim sa afisam putem schimba .2 in orice numar dorim
        // %f - este float se asteapta la un float/double/bigdecimal
        // %x - reprezinta un Integer in format hexadecimal , se asteapta la un integer care va fii afisat in format hexadecimal
        // %e sau %E - reprezinta un numar stintific  exemplu Double 123456.789 daca il reprezentam cu %e/%E va arata 1.2345678e/E+05 - indica exponentul la puterea a 10.
        // %n - functioneza la fel \n -newline care muta obiectul pe alta linie.

        System.out.printf("%d. | %-8s | %-10s | %-10s |   %c/%c    | %-6b | %-7dcm3 |     %-7.1f | %-4d |\n",pozitie,brand,model,culoare,transAuto,transManual,alarma,
                motorizare,consumM,anProd);
        System.out.println("   |----------|------------|------------|----------|--------|------------|-------------|------|");

        listPosition.add(pozitie);
        listBrand.add(brand);
        listAn.add(anProd);
    }
    public void afisareImpozitTabel(){

        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Vom afisa impozitul pentru fiecare model de masina in functie de An productie:");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("    |  Masina  | Anul | Impozit |");
        System.out.println("    |----------|------|---------|");

        for(int i=0; i<listPosition.size(); i++){

            Integer pozitie=listPosition.get(i);
            String model= listBrand.get(i);
            Integer anProd=listAn.get(i);

            if(anProd<=2015){
                System.out.printf("%d.  | %-8s | %d | 200lei  |\n",pozitie,model,anProd);
                System.out.println("    |----------|------|---------|");
            } else if(anProd<=2020) {
                System.out.printf("%d.  | %-8s | %d | 100lei  |\n",pozitie,model,anProd);
                System.out.println("    |----------|------|---------|");
            }else{
                System.out.printf("%d.  | %-8s | %d | 50lei   |\n",pozitie,model,anProd);
                System.out.println("    |----------|------|---------|");
            }
        }
    }
}
