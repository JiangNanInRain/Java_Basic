package Chapter14;

import java.util.EnumSet;

public class EnumSetDemo2 {
    public static void main(String[] args) {
        EnumSet<Color> esO = EnumSet.noneOf(Color.class);
        esO.add(Color.BLUE);
        esO.add(Color.RED);
        EnumSet<Color> esN = EnumSet.complementOf(esO);
        print(esN);
    }
    public static void print(EnumSet<Color> t){
        for(Color c:t){
            System.out.print(c+" ");
        }
    }
}
