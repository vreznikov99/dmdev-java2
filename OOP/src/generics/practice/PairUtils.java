package generics.practice;

public final class PairUtils {
    private PairUtils() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K,V> pair){
        return new Pair<>(pair.getVarV(), pair.getVarK());
    }
}
