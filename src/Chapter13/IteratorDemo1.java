package Chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("王义喆");
        all.add("_");
        all.add("赵甜宇");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            if("_".equals(str)){
                iter.remove();
            }else {
                System.out.println(str+" ");
            }
        }
        System.out.println(all);

    }
}
