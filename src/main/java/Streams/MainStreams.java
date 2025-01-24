package Streams;


import java.util.*;

public class MainStreams {
    public static void main(String[] args) {
        List<String> vockice = Arrays.asList("jabuka", "banana", "kruska", "apple", "pineapple", "banana", "pear", "strawberry");
        List<String> vockiceSaVelikimSlovima = radnjeBezStrimova(vockice);
        System.out.println(vockiceSaVelikimSlovima);
    }

    static List<String> radnjeBezStrimova(List<String> listaVoca) {
        List<String> vockiceSaVelikimSlovima = new ArrayList<>();
        for (String el : listaVoca) {
            el=el.toUpperCase();
            if (el.startsWith("P")) {
                vockiceSaVelikimSlovima.add(el);
            }
        }
        Collections.sort(vockiceSaVelikimSlovima);
        return vockiceSaVelikimSlovima;
    };

    /* .map() - unutra ide lambda ili methode reference, intermediate


     */




}
