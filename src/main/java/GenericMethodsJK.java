import java.util.Arrays;
import java.util.List;

public class GenericMethodsJK {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 5, 7};

        System.out.println("GENERICS");
        List<String> listaReci = convertArrayToList(words);
        List<Integer> listaBrojeva = convertArrayToList(numbers);
        System.out.println(words[0]);
        System.out.println(listaReci);
        System.out.println(listaBrojeva);

        System.out.println("BOUNDED GENERICS");
        // greska kod tipa String
        // List<String> listaReciBrojevi = convertArrayToNumberList(words);
        // sve OK kod tipa brojevi (int, double, float) ***/
        List<Integer> listaBrojevaBrojevi = convertArrayToNumberList(numbers);
        System.out.println(listaBrojevaBrojevi);
        Double [] decimalni = {1.5, 2.3, 12.8};
        List<Double> listaDoubleBrojeva = convertArrayToNumberList(decimalni);
        System.out.println(listaDoubleBrojeva);
    }
    /*** GENERICS ***/
    private static <T> List<T> convertArrayToList(T[] niz) {
        // private - za scope - da sakrijemo od drugih klasa
        // static -  da moze main metoda da koristi
        //da bi niz i lista bili istog tipa ali da ne specifiramo kog tipa koristimo T (moze biti bilo koje slovo ali t kao tip)
        // <T> -
        return Arrays.asList(niz);
    }
    /*** BOUNDED GENERICS ***/
    private static <T extends Number> List<T> convertArrayToNumberList(T[] nizBrojeva ) {
        // extends Number znaci da mogu da se koriste samo brojevi (int, double, float) ***/
        return Arrays.asList(nizBrojeva);
    }
}
