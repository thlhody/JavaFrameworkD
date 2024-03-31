package interfeteFunctionale;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    @Test
    public static void metodaTest(){
        exempluSupplierA();
        exempluComplexSupplier();
        exempluSupplierB();
        System.out.println("Lazy Value "+getExempluSupplierLazyValue());
    }
    public static void exempluSupplierA(){
        Supplier<String> supplier = () -> "Hello, this a supplier example!";
        String result = supplier.get();
        System.out.println(result);
    }
    public static void exempluSupplierB(){
        Supplier<Integer> numereAleatori = () -> (int) (Math.random() * 100);
        Integer numarAleator = numereAleatori.get();
        System.out.println("Numar generat aleatoriu: " +numarAleator);
    }
    public static List<Integer> generateRandomValues(int numar, Supplier<Integer> supplier){
        List<Integer> valori = new ArrayList<>();
        for (int i=0; i<numar; i++){
            valori.add(supplier.get());
        }
        return valori;
    }
    public static void exempluComplexSupplier(){
        List<Integer> randomInt = generateRandomValues(10,()-> new Random().nextInt(100));
        System.out.println(randomInt);
    }
    public static String getExempluSupplierLazyValue (){
        Supplier<String> lazyValue = () -> {
            System.out.println("Initializare lazy value");
            return "Lazy value initiat";
        };
        return lazyValue.get();
    }
}
