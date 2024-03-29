package Chapter6;



abstract class aA{
    public abstract void print();

}
class  bB extends aA{
    public void print(){
        System.out.println("this is B");
    }
}
public class AbstractDemo1 {
    public static void main(String[] args) {
        aA x = new bB();
        x.print();
    }
}
