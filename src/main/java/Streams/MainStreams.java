package Streams;


import java.util.*;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args) {
        List<String> vockice = Arrays.asList("jabuka", "banana", "kruska", "apple", "pineapple", "banana", "pear", "strawberry");

        List<String> vockiceSaVelikimSlovima1 = radnjeBezStrimova(vockice);
        System.out.println(vockiceSaVelikimSlovima1);

        System.out.println("***************************************");

        System.out.println(vockice);
        List<String> VockiceSaStrimovima2 = radnjaSaStrimovima(vockice);
        System.out.println(VockiceSaStrimovima2);
    }

    static List<String> radnjeBezStrimova(List<String> listaVoca) {
//        pravimo novu listu
        List<String> voceSaVelikimSlovima = new ArrayList<>();
//        prosledjenu listu
        for (String el : listaVoca) {
//            menjamo u velika slova
            el=el.toUpperCase();
//            ako pocinje sa p
            if (el.startsWith("P")) {
//                stavljamo u novu listu
                voceSaVelikimSlovima.add(el);
            }
        }
//        sortiramo novu listu
        Collections.sort(voceSaVelikimSlovima);
        return voceSaVelikimSlovima;
    };
/**                                               *****************   STREAMS API   *****************                                            **/

    /* .map() - unutra ide lambda ili methode reference, intermediate i vraca stream ako je zadat stream

     */
    static List<String> radnjaSaStrimovima (List<String> listaStreamVoca) {
        return listaStreamVoca.stream()
                .map(String::toUpperCase)
                .filter(elem->elem.startsWith("P"))
                .sorted()
                .collect(Collectors.toList());
    };




}
