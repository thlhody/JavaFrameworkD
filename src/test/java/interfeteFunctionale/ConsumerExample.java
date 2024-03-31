package interfeteFunctionale;

import org.testng.annotations.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //Syntax / Prototype of Consumer Functional Interface –
    //Consumer<Integer> consumer = (value) -> System.out.println(value);
    //Functia Consumer - accepta 1 singur input pe care il proceseaza si nu returneaza nici un rezultat
    @Test
    public void metodaTest(){
        consumerExampleA();
        System.out.println("^^^^^^^^^^A");
        consumerExampleB();
        System.out.println("^^^^^^^^^^B");
        consumerExampleC();
        List<String> inputDates = Arrays.asList("1/2/2023","5/6/2021","12/12/2000");
        System.out.println("Dati modificate "+getTransformData(inputDates));
        System.out.println("^^^^^^^^^^D");
    }
    public void consumerExampleA(){
        Consumer stringConsumer = (message) -> System.out.println("Consuming message: "+message);
        stringConsumer.accept("Hello world!");
        stringConsumer.accept("Lalala");
    }
    public void consumerExampleB(){
        List<String> nume = Arrays.asList("Tudor","Andrei","Alex","Simona");
        Consumer<String> nameConsumer = (name) ->
                System.out.println("Aloha, "+name);
        nume.forEach(nameConsumer);
        System.out.println("Lista are "+nume.size()+" nume");
    }
    public void consumerExampleC(){
        List<String> nume = Arrays.asList("Tudor","Andrei","Alex","Simona");
        List<String> lowerNume = new ArrayList<>();
        Consumer<String> nameConsumerUpperCase = (name) ->
                lowerNume.add(name.toUpperCase());
//                System.out.println("Aloha, "+name.toUpperCase());
        nume.forEach(nameConsumerUpperCase);

        Consumer<String> nameConsumerPrintList = (name) ->
                System.out.println("Aloha, "+name);
        lowerNume.forEach(nameConsumerPrintList);

        System.out.println("^^^^^^^^^^C.1");

        Consumer<String> nameConsumerReplace = (name) ->
                System.out.println("Aloha, "+name.replace("r","X"));
        nume.forEach(nameConsumerReplace);
        System.out.println("Lista are "+nume.size()+" nume");
        System.out.println("^^^^^^^^^^C.2");
    }
    public List<String> getTransformData(List<String> inputDate){
        List<String> formattedDates = new ArrayList<>();
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Consumer<String> dateTransformer = (date) -> {
            LocalDate parsedDate = LocalDate.parse(date, inputFormat);
            String formattedDate = parsedDate.format(outputFormat);
            formattedDates.add(formattedDate);
        };
        inputDate.forEach(dateTransformer);
        return formattedDates;
    }
}




