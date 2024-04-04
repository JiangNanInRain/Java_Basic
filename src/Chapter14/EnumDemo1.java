package Chapter14;


 enum Color{
    RED,GREEN,BLUE;
}
public class EnumDemo1 {
    public static void main(String[] args) {
        Color c = Color.BLUE;//Color c = Enum.valueOf(Color.class,"BLUE");
        System.out.println(c);
        for(Color cc:Color.values()){
            System.out.print(cc+"\t");
        }
    }
}
