package Chapter13;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {
        Vector<String > all = new Vector<>();
        all.add("王义喆");
        all.add("王义喆");
        all.add("王义喆");
        Enumeration<String> enu = all.elements();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement()+" ");
        }
    }
}
