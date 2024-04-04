package Chapter13;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("王义喆","铸币");
        map.put("赵甜宇","原神");
        map.put("捷豹","yys");
        Set<String> keys = map.keySet();//如果要values集合,换成Collection<String> values  =  map.values();
        Iterator<String > it = keys.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+"  ");
        }


    }
}
