public class PairValue<K,V> {
    private K k;
    private V v;

    public PairValue(K k, V v) {
        this.k = k;
        this.v = v;
    }
    public V getVFromK(K k){
        if(k.equals(this.k)){
            return v;
        }
        return null;
    }

    @Override
    public String toString() {
        return "PairValue{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
