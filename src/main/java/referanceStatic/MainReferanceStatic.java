package referanceStatic;

import java.util.Arrays;
import java.util.List;

public class MainReferanceStatic {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,9,10,4,5,6,7,8);
        //postoje 4 vrste metod referenci
        // 1. when calling static method
        //lambda
        //numberList.forEach((someNumber)-> EvenOrOdd.evenOrOdd(someNumber));
        // method refrence za statik metodu
//        method reference je u stvari skracena verzija lambde
        numberList.forEach(EvenOrOdd::evenOrOdd);

//        jos jedan primer
//        numberList.forEach((broj)-> System.out.println(broj));
        numberList.forEach(System.out::println);

        System.out.println("*******************************");


//       2.when calling instance method of a particular object
        EvenOrOdd greeter = new EvenOrOdd();
//        numberList.forEach((broj)-> greeter.greet(broj);
        numberList.forEach(greeter::greet);

///*        jos jedan primer ako ne bi evenOrOdd bila static        *///
//        numberList.forEach((broj)->greeter.evenOrOdd(broj));
//        numberList.forEach(greeter::evenOrOdd);

        System.out.println("*******************************");

//        3. when calling instance method of an arbitrary object of a particular type
//        numberList.sort((s1,s2)->s1.compareTo(s2));
        numberList.sort(Integer::compareTo);
        System.out.println(numberList);

        System.out.println("*******************************");

//        4. when calling a constructor
//        ako zelimo referencu memoriji
//        List<Brojevitis> nekiBrojevi= numberList.stream().
//                map((broj)->new Brojevitis(broj)).toList();
        List<Brojevitis> nekiBrojevi= numberList.stream().
                map(Brojevitis::new).toList();
        System.out.println(nekiBrojevi);


    }
}
