package referanceStatic;

import java.util.Arrays;
import java.util.List;

public class MainReferanceStatic {
    //postoje 4 vrste metod referenci
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //lambda
        //numberList.forEach((someNumber)-> EvenOrOdd.evenOrOdd(someNumber));
        // method refrence za statik metodu
        numberList.forEach(EvenOrOdd::evenOrOdd);


    }
}
