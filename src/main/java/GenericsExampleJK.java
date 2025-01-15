import java.util.ArrayList;
import java.util.List;

public class GenericsExampleJK {

    public static void main(String[] args) {

        //List shapes = new ArrayList();
        List<String> shapes = new ArrayList<>();

        shapes.add("Circle");
        System.out.println(shapes.get(0));

        // greska zato sto je shapes instanca objekta
       /*** String circle = shapes.get(0); ***/
        // da prebacimo u String:
         String circle = (String) shapes.get(0); /*** onda nam je (String) nepotrebno sa desne strane ***/
        System.out.println(circle);
        // ako dodamo u shapes neku drugu vrstu varijable npr. objekat Restangle
        /*** shapes.add(new Rectangle()); ***/
        // se menja u
        shapes.add("Rectangle");
        //moramo dodati tip koji dodajemo
        /*** Rectangle pravougaonik = shapes.get(1); ***/
        // i ovo ide u
        /*** Rectangle pravougaonik = (Rectangle) shapes.get(1); ***/
        String  pravougaonik =shapes.get(1);
        // ako ova lista shapes se sastoji od razlicitih vrsta objekata i varijabli
        // lako se moze pogresiti oko tipa objekta ( String ili Rectangle)
        /*** Integer pravougaonik = (Integer) shapes.get(1); ***/
        // i ovo moze da prodje i necemo moci da znamo da smo pogresili dok ne pokrenemo program
        // a onda nam moze biti tesko i da pronadjemo gde smo pogresili
        // zato umesto
        /*** List shapes = new ArrayList(); ***/
        // koristimo na pocetku
        /*** List<String> shapes = new ArrayList<>(); ***/
         }
}
