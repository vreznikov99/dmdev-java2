package generics.practice;

public class Pair<K, V> {

    private K varK;
    private V varV;

    public Pair(K varK, V varV) {
        this.varK = varK;
        this.varV = varV;
    }

    @Override
    public String toString() {
        return "Value K-type: " + varK + "\nValue V-type: " + varV;
    }

    public K getVarK() {
        return varK;
    }

    public void setVarK(K varK) {
        this.varK = varK;
    }

    public V getVarV() {
        return varV;
    }

    public void setVarV(V varV) {
        this.varV = varV;
    }
}
