package Chapter5;

public class InnerClassDemo1 {


    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in =  out.new Inner();
        in.print();

    }

}
class Outer{
    private String info = "hello world";
    class Inner{
        public void print(){
            System.out.println(info);
        }

    }
}