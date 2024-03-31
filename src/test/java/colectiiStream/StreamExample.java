package colectiiStream;

import org.testng.annotations.Test;
import java.util.*;

public class StreamExample {
    @Test
    public void metodaTest(){
        // List
        List<String> nume = Arrays.asList("A","Tudor","BB","Andrei","CCC","Alexandru","DDDD","Simona");
        List<Integer> numere = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        streamExempluStringInteger(nume,numere);
        // Set - este o colectie care nu accepta elemente duplicate.
        Set<String> numeSet = new LinkedHashSet<>(Arrays.asList("A","Tudor","BB","Andrei","CCC","Alexandru","A","Simona"));
        Set<Integer> numereSet = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5,13));
        streamExempluSetIntegerString(numeSet,numereSet);
        // Map
        Map<String, Integer> cuvinte = new HashMap<>();
        cuvinte.put("Aloha", 5);
        cuvinte.put("Plane", 5);
        cuvinte.put("Suma", 4);
        cuvinte.put("stream", 6);
        cuvinte.put("example", 7);
        streamExempluMap(cuvinte);
        // arrays
        int[] inputA = {1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5,13};
        Integer[] inputB = {1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5,13};
        streamExempluArray(inputA,inputB);
    }
    public void streamExempluStringInteger(List<String> nume,List<Integer> numere){
        nume.stream().filter(name->name.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        nume.stream().filter(name->!name.startsWith("A")).map(String::toLowerCase).forEach(name -> System.out.println("Nu incepe cu A: "+name));

        numere.stream().filter(numar->numar%2==0).map(numar->numar*numar).forEach(numar -> System.out.println("Numere pare la patrat: "+numar));
        numere.stream().filter(numar->numar%2!=0).map(numar->numar*100).forEach(numar -> System.out.println("Numere impare *100: "+numar));
    }
    public void streamExempluSetIntegerString(Set<String> numeSet,Set<Integer> numereSet){
        numeSet.stream().map(String::toUpperCase).forEach(nume -> System.out.println("------>>>>" + nume));

        numereSet.stream().map(n->n+1000).forEach(n -> System.out.println(">>>>" + n + "<<<<"));
    }
    public void streamExempluMap(Map<String,Integer> cuvinte){
        Integer adunareKeyPlusValue = cuvinte.entrySet().stream().mapToInt(c->c.getKey().length()+ c.getValue()).sum();
        System.out.println("Total"+ adunareKeyPlusValue);
    }
    public void streamExempluArray(int[] inputA, Integer[] inputB){
        int sumaPatratuluiNumerelorPareA = Arrays.stream(inputA).filter(n-> n%2==0).map(n->n*n).sum();
        System.out.println("Suma patratului numerelor Pare "+ sumaPatratuluiNumerelorPareA);

        Integer sumaPatratuluiNumerelorPareB = Arrays.stream(inputB).filter(n-> n%2!=0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println("Suma patratului numerelor Impare "+ sumaPatratuluiNumerelorPareB);
    }
}
