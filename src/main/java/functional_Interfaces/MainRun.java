package functional_Interfaces;

public class MainRun {
    public static void main(String[] args) {
        HelloGreeting sayHello = new HelloGreeting();
        sayHello.printSomething();
        GoodGreeting sayGood = new GoodGreeting();
        sayGood.printSomething();
    }
}
