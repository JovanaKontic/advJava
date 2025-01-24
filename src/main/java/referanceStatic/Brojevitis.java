package referanceStatic;

public class Brojevitis {
    private final int proBroj;

    public Brojevitis(int proBroj) {
        this.proBroj = proBroj;
    }

    //    ako zelimo referencu memoriji samo onda ne treba nam ovo

    @Override
    public String toString() {
        return "Brojevitis{" +
                "proBroj=" + proBroj +
                '}';
    }

}
