package lambdas;

public class MainRunLambdas {
    public static void main(String[] args) {
        // prvo tip varijable pa onda naziv kao i obicno i znak jednakosti
        // sa druge strane prvo zagrade,i ako bi trebao neki argument da se stavi, bio bi u zaradi
        // onda strelica ->
        // onda ono sto bi stavili u telo metode
        Greeting sayGoodAfternoon =() -> System.out.println("good afternoon");
        sayGoodAfternoon.printAnything();
        Greeting sayHelloWorld = () -> System.out.println("HelloWorld");
        sayHelloWorld.printAnything();
        Greeting sayGoodMorning = ()-> System.out.println("GoodMorning");
        sayGoodMorning.printAnything();
    }
}
