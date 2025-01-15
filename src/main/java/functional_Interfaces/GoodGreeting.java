package functional_Interfaces;

public class GoodGreeting implements Greetings {
    @Override
    public void printSomething() {
        System.out.println("Good");
    }
}