package teme;

import org.testng.annotations.Test;
import java.util.*;

public class TemaReteta {

    @Test
    public void mainRetete (){
        retete();
    }
    public void retete(){
        Map<String,List<String>> listaRetete = getRetete();
        for(String key : listaRetete.keySet()){
            System.out.println("Reteta - "+key+" Ingrediente:"+listaRetete.get(key));
        }
    }
    public Map<String,List<String>> getRetete(){
        Map<String, List<String>> listaRetete = new HashMap<>();
        List<String> retetaMuffin = new ArrayList<>(Arrays.asList("Banana","Zahar","Oua","Bicarbonat Sodiu","Scortisoara"));
        List<String> retetaSarmale = new ArrayList<>(Arrays.asList("Carne tocata","Varza","Ceapa","Orez","Ulei","Marar","Cimbru","Dafin","Sare","Piper"));
        List<String> retetaCiorbaPleurotus = new ArrayList<>(Arrays.asList("Pleurotus","Ardei gras","Samantana","Usturoi","Morcovi","Telina","Pastarnac","Ceapa","Oua","Lamaie"));
        List<String> retetaPasteCarb = new ArrayList<>(Arrays.asList("Paste","Costita","Pecorino","Oua","Sare","Piper"));

        listaRetete.put("Banana Muffin",retetaMuffin);
        listaRetete.put("Sarmale",retetaSarmale);
        listaRetete.put("Ciorba Pleurotus", retetaCiorbaPleurotus);
        listaRetete.put("Paste Carbonara", retetaPasteCarb);

        return listaRetete;
    }
}
