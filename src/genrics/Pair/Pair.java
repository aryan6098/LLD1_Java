package genrics.Pair;

public class Pair {

    private Object first;
    private Object second;

    public Object getSecond() {
        return second;
    }

    public Object getFirst() {
        return first;
    }

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public void setSecond(Object second) {
        this.second = second;
    }
}
