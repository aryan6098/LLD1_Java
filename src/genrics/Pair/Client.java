package genrics.Pair;

public class Client {

    public static void main(String[] args) {
        PairGenric<String, Integer> p = new PairGenric<>("Raj", 537754);
        p.setFirst("Aryna");

        PairGenric p1 = new PairGenric("Aryan", 34); // Raw Types
        p1.setFirst(22);

        // This disabled checks and is not recommended because it looses type safety
    }

}
