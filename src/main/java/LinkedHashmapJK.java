import java.util.LinkedHashMap;

public class LinkedHashmapJK {
    public static void main(String[] args) {
       // HashMap<String, Integer> basket = new HashMap<>();
        LinkedHashMap<String, Integer> basket = new LinkedHashMap<>();

        basket.put("apple", 2);
        basket.put("orange", 1);
        basket.put("banana", 3);

        basket.forEach((key, value) -> System.out.println(key + ": " + value));

        //kada stampamo
        /*** orange: 1
         banana: 3
         apple: 2 ***/
        // nema reda
        // i zato koristimo linked hash maps
        // get.First i get.Last nisu dostupni


    }
}
