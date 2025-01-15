import java.util.HashMap;

public class HashmapJK {
    public static void main(String[] args) {
        /***
         * KEY - VALUE
         */

        //The first type is going to be the type of the key and the second type is the type of the value associated with that key
        /*** the key is going to be a string to represent the name of the product,
         * and then the value is going to be an integer to represent how many times it's been scanned.
         */

        HashMap<String, Integer> korpa = new HashMap<>();

        // ADDING = PUT
        korpa.put("apple", 1);
        System.out.println(korpa);
        System.out.println(korpa.get("apple"));

        System.out.println("UPDATE");
        korpa.put("apple", 2);
        System.out.println(korpa);
        System.out.println(korpa.get("apple"));

        System.out.println(korpa.containsKey("apple"));
        System.out.println(korpa.containsKey("bannana"));

        System.out.println("MERGE");
        korpa.merge("apple", 1, Integer::sum);
        System.out.println(korpa);

        korpa.merge("bannana", 1, Integer::sum);
        System.out.println(korpa);








    }
}
