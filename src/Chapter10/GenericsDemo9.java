package Chapter10;

import java.beans.Introspector;

class MapWYZ <K,V>{
    private K key;
    private V value;

    public MapWYZ(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class ZTY<S>{
    private S info;

    public ZTY(S info) {
        this.info = info;
    }

    public S getInfo() {
        return info;
    }

    public void setInfo(S info) {
        this.info = info;
    }
}


public class GenericsDemo9 {
    public static void main(String[] args) {
        MapWYZ<String, Integer> map =new MapWYZ<>("王义喆",18);
        ZTY<MapWYZ<String,Integer>>  i = new ZTY<>(map);
        System.out.println(i.getInfo().getKey());
        System.out.println(i.getInfo().getValue());

    }
}
