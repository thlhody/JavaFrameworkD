package interfeteFunctionale;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    //o functie in Java acepta un argument si produce un rezultat
    @Test
    public void metodaTest(){
        exempluFunctie("exemplu de functie");
        List<String> nume = Arrays.asList("A","Tudor","BB","Andrei","CCC","Alexandru","DDDD","Simona");
        exempluFunctieA(nume);
        exempluFunctieB("castravete");
        List<Integer> numere = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
    }
    public void exempluFunctie(String input){
        Function<String,String> toUpperCase = str -> str.toUpperCase();
        String raspuns = toUpperCase.apply(input);
        System.out.println(raspuns);
    }
    public void exempluFunctieA(List<String> names){
        Function<String,Integer> lungimeNumeFunctie = String::length;
        List<Integer> lungimeNume = names.stream().map(lungimeNumeFunctie).collect(Collectors.toList());
        System.out.println("Lungimea Nume "+names+" este "+lungimeNume);
    }
    public void exempluFunctieB(String input){
        Function<String,String> toUpperCase = String::toUpperCase;
        Function<String,String> adaugaCuvProcesat = s->s+" Procesat";
        Function<String,String> procesareFinala = toUpperCase.andThen(adaugaCuvProcesat);
        String output = procesareFinala.apply(input);
        System.out.println(output);
    }
}
