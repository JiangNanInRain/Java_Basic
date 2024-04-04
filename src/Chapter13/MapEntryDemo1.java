package Chapter13;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo1 {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("王义喆","铸币");
        map.put("赵甜宇","原神");
        map.put("捷豹","yys");
        Set<Map.Entry<String,String>> set = map.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,String>  me = it.next();
            System.out.println(me.getKey()+" ->"+me.getValue());
        }
    }
}
