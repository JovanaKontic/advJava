package functional_Interfaces;

public class HelloGreeting implements Greetings {
    @Override
    public void printSomething() {
        System.out.println("Hello");
    }
}
