package multimi;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //multimi - array, lista, map
    @Test
    public void metodaTest(){
        colegiCursArray();
        System.out.println("$$$$$$$$$");
        colegiCursList();
        System.out.println("$$$$$$$$$");
        diferiteGrupeMap();
        System.out.println("$$$$$$$$$");
        diferiteGrupeMapAndList();
        System.out.println("$$$$$$$$$");
        tariOrase();
    }
    //reprezentam multimea colegilor de la curs intr-un array
    public void colegiCursArray(){
        String[] colegii =  new String[4];
        colegii[0] = "Daniel";
        colegii[1] = "Tudor";
        colegii[2] = "Andrei";
        colegii[3] = "Vasile";
        for (int i=0; i<colegii.length; i++){
            System.out.println("Colegi nume "+colegii[i]);
        }
    }
    //reprezentam multimea colegilor de la curs intr-o lista
    public void colegiCursList(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Tudor");
        colegi.add("Andrei");
        colegi.add("Alex");
        colegi.add("Daniel");
        colegi.add("Simona");
        for (int i=0; i<colegi.size(); i++){
            System.out.println("Colegi nume "+colegi.get(i));
        }
    }
    //map => key(ar fii fruct - value(ar fi mar
    public void diferiteGrupeMap(){
        Map<String,String> obiecte = new HashMap<>();
        obiecte.put("Fructe","Mar");
        obiecte.put("Haine","Pantaloni");
        obiecte.put("Instrumente","Chitara");
        // for each pentru fiecare cheie din lista de key
        // for each key from obiecte.keySet()
        for(String key : obiecte.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoare cheii este "+obiecte.get(key));
        }
    }
    public void diferiteGrupeMapAndList(){
        Map<String,List<String>> obiecte = new HashMap<>();
        List<String> fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Pere");
        fructe.add("Banane");
        List<String> haine = new ArrayList<>();
        haine.add("Pantaloni");
        haine.add("Tricou");
        haine.add("Bluza");
        List<String> instrumente = new ArrayList<>();
        instrumente.add("Chitara");
        instrumente.add("Toba");
        instrumente.add("Vioara");

        obiecte.put("Fructe",fructe);
        obiecte.put("Haine",haine);
        obiecte.put("Instrumente",instrumente);

        // for each pentru fiecare cheie din lista de key
        // for each key from obiecte.keySet()

        for(String key : obiecte.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoare cheii este "+obiecte.get(key));
        }
    }
    public void tariOrase(){
        Map<String,List<String>> diverse = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Timisoara");
        oraseRomania.add("Cluj");
        oraseRomania.add("Oradea");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Tenerife");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        diverse.put("Romania",oraseRomania);
        diverse.put("Spania",oraseSpania);
        diverse.put("Italia",oraseItalia);

        for(String key : diverse.keySet()){
            if(key.equals("Spania")) {
                System.out.println("Tara este " + key);
                System.out.println("Orasele sunt " + diverse.get(key).get(1));
            }
        }
    }
}

