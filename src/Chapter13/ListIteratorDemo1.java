package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo1 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("王1喆");
        all.add("王2喆");
        all.add("王3喆");
        ListIterator<String> it = all.listIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        while (it.hasPrevious()){
            System.out.print(it.previous());
        }

    }
}
