package teme;

import org.testng.annotations.Test;
import java.util.*;
import java.util.stream.Collectors;

public class TemaTaraJudetOrasePopulatie {
    @Test
    public void mainTest(){
        taraJudetOras();
        System.out.println("========================");
        taraJudetOrasPopulatie();
        System.out.println("========================");
        populationOrasSort("Ascending");
        System.out.println("----------------------");
        populationOrasSort("Descending");
        System.out.println("----------------------");
    }
    public void taraJudetOras(){
        Map<String, Map<String, List<String>>> organizare = getTaraJudetOras();

        for (Map.Entry<String,Map<String,List<String>>> taraIntrari : organizare.entrySet()){
            String tari = taraIntrari.getKey();
            Map<String,List<String>> judetMap = taraIntrari.getValue();
            for(Map.Entry<String,List<String>> judetIntrari : judetMap.entrySet()){
                String judet = judetIntrari.getKey();
                List<String> oras = judetIntrari.getValue();
                System.out.println("Tara: "+tari+", Judet: "+judet+", Orase:"+oras);
            }
        }
    }
    public Map<String, Map<String, List<String>>> getTaraJudetOras() {

        Map<String,Map<String, List<String>>> organizare= new HashMap<>();
        List<String> timisOrase = new ArrayList<>(Arrays.asList("Timisoara","Lugoj","Buzias","Recas"));
        List<String> clujOrase = new ArrayList<>(Arrays.asList("Cluj-Napoca","Dej","Huedin","Turda"));
        List<String> bihorOrase = new ArrayList<>(Arrays.asList("Oradea","Salonta","Beius","Alesd"));
        List<String> hunedoaraOrase = new ArrayList<>(Arrays.asList("Hunedoara","Brad","Calan","Deva","Simeria"));

        Map<String,List<String>> romaniaMap = new HashMap<>();
        romaniaMap.put("Timis",timisOrase);
        romaniaMap.put("Cluj",clujOrase);
        romaniaMap.put("Bihor",bihorOrase);
        romaniaMap.put("Hunedoara",hunedoaraOrase);

        organizare.put("Romania",romaniaMap);
        return organizare;
    }
    public void taraJudetOrasPopulatie(){
        Map<String, Map<String, Map<String,Integer>>> organizare = getTaraJudetOrasPopulatie();

        for (Map.Entry<String,Map<String,Map<String,Integer>>> taraIntrari : organizare.entrySet()){
            String tari = taraIntrari.getKey();

            Map<String,Map<String,Integer>> judetMap = taraIntrari.getValue();
            for(Map.Entry<String,Map<String,Integer>> judetIntrari : judetMap.entrySet()){
                String judet = judetIntrari.getKey();

                Map<String,Integer> orasMap = judetIntrari.getValue();
                for (Map.Entry<String,Integer> orasIntrari : orasMap.entrySet()){
                    String oras = orasIntrari.getKey();
                    Integer populatie = orasIntrari.getValue();
                    System.out.println("Tara: "+tari+", Judet: "+judet+", Orase: "+oras+", Locuitori:"+populatie);
                }
            }
        }
    }
    public void populationOrasSort(String sortOrder){
        Map<String, Map<String, Map<String,Integer>>> organizare = getTaraJudetOrasPopulatie();
        for(Map.Entry<String,Map<String,Map<String,Integer>>> taraIntrari : organizare.entrySet()){
            String tara = taraIntrari.getKey();

            for(Map.Entry<String, Map<String,Integer>> judetIntrari : taraIntrari.getValue().entrySet()){
                String judet = judetIntrari.getKey();
                Map<String,Integer> orasMap = judetIntrari.getValue();
                Map<String, Integer> sortareOrasMap;

                // 1.interfete functionale, 2.colectii cu stream.
                switch (sortOrder){
                    case "Ascending":
                        sortareOrasMap = orasMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
                        System.out.println(tara +", "+judet+", "+ sortareOrasMap);
                        break;
                    case "Descending":
                        sortareOrasMap = orasMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
                        System.out.println(tara +", "+judet+", "+ sortareOrasMap);
                        break;
                    default:
                        taraJudetOrasPopulatie();
                }
            }
        }
    }
    public Map<String, Map<String, Map<String,Integer>>> getTaraJudetOrasPopulatie() {

        Map<String,Map<String, Map<String,Integer>>> organizare= new HashMap<>();

        Map<String,Integer>  timisOrase = new HashMap<>();
        timisOrase.put("Timisoara",317660);
        timisOrase.put("Lugoj",44600);
        timisOrase.put("Buzias",7700);
        timisOrase.put("Recas",8560);

        Map<String,Integer>  clujOrase = new HashMap<>();
        clujOrase.put("Cluj-Napoca",310240);
        clujOrase.put("Dej",38610);
        clujOrase.put("Huedin",9700);
        clujOrase.put("Turda",57380);

        Map<String,Integer>  bihorOrase = new HashMap<>();
        bihorOrase.put("Oradea",205000);
        bihorOrase.put("Salonta",18400);
        bihorOrase.put("Beius",11000);
        bihorOrase.put("Alesd",10400);

        Map<String,Integer>  hunedoaraOrase = new HashMap<>();
        hunedoaraOrase.put("Hunedoara",70000);
        hunedoaraOrase.put("Brad",15800);
        hunedoaraOrase.put("Calan",12800);
        hunedoaraOrase.put("Deva",68800);
        hunedoaraOrase.put("Simeria",13500);

        Map<String,Map<String , Integer>>  romaniaMap = new HashMap<>();
        romaniaMap.put("Timis",timisOrase);
        romaniaMap.put("Cluj",clujOrase);
        romaniaMap.put("Bihor",bihorOrase);
        romaniaMap.put("Hunedoara",hunedoaraOrase);

        organizare.put("Romania",romaniaMap);
        return organizare;
    }
}
