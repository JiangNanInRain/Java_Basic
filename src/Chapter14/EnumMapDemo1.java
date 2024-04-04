package Chapter14;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo1 {
    public static void main(String[] args) {

        Map<Color,String> desc = new EnumMap<Color,String>(Color.class);
        desc.put(Color.RED,"红色");
        desc.put(Color.BLUE,"蓝色");
        desc.put(Color.GREEN,"绿色");

        for (Color c:Color.values()){
            System.out.println(c.name()+" "+desc.get(c));
        }
        for(Color c:desc.keySet()){
            System.out.print(c.name());
        }
        for(String s:desc.values()){
            System.out.print(s+"  ");
        }
    }
}
