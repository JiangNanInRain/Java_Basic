package Chapter10;


import java.security.Key;

class Notepad<K,V>{
    private K key;
    private V value;

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
public class GenericsDemo {
    public static void main(String[] args) {
        Notepad<String,Integer> m = new Notepad<>();
        m.setKey("原神等级");
        m.setValue(60);

        System.out.println(m.getKey()+":"+m.getValue());
    }
}
