package generic;

public class Pair<T1,T2> {
    private T1 typeOne;
    private T1 typeTwo;

    public Pair() {
    }

    public Pair(T1 typeFirst, T1 typeTwo) {
        this.typeOne = typeFirst;
        this.typeTwo = typeTwo;
    }

    public T1 getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(T1 typeFirst) {
        this.typeOne = typeFirst;
    }

    public T1 getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(T1 typeTwo) {
        this.typeTwo = typeTwo;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "typeOne=" + typeOne +
                ", typeTwo=" + typeTwo +
                '}';
    }
}
