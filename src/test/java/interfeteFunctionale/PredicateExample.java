package interfeteFunctionale;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    @Test
    public void metodaTest(){
        List<Integer> numere = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        exempluPredicate(numere);
        Map<String,Integer> numeVarsta = new HashMap<>();
        numeVarsta.put("Tudor",36);
        numeVarsta.put("Simona",25);
        numeVarsta.put("Andrei",20);
        numeVarsta.put("Vasile",18);
        exempluPredicateA(numeVarsta);
    }
    public void exempluPredicate(List<Integer> numere){
        Predicate<Integer> numarPar = num -> num%2 ==0;
        List<Integer> numerePareList = numere.stream().filter(numarPar).collect(Collectors.toList());
        System.out.println("Numerele Pare sunt: "+numerePareList);
        Predicate<Integer> numarImPar = num -> !(num%2 ==0);
        List<Integer> numereImpareList = numere.stream().filter(numarImPar).toList();
        System.out.println("Numerele Impare sunt: "+numereImpareList);
    }
    public void exempluPredicateA(Map<String,Integer> numeVarsta){
        Predicate<Map.Entry<String,Integer>> varstaPesteSauEgal = intrare -> intrare.getValue() >= 25;
        numeVarsta.entrySet().stream().filter(varstaPesteSauEgal).forEach(intrare -> System.out.println("Pentru "+intrare.getKey()+
                " este " + intrare.getValue()+" ani. Accesul permis!"));
        numeVarsta.entrySet().stream().filter(varstaPesteSauEgal.negate()).forEach(intrare -> System.out.println("Pentru "+intrare.getKey()+
                " este " + intrare.getValue()+" ani. Accesul interzis sub 25 ani"));
    }
}
