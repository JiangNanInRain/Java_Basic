package Chapter6;

abstract class abA{
    public abstract void printA();
    interface BBB{
        public void printB();
    }

}

class XX extends abA{
    public void printA(){
        System.out.println("A!");
    }
    class Y implements BBB{
        public void printB(){
            System.out.println("B!");
        }
    }

}
public class InnerExtDemo1 {
    public static void main(String[] args) {
        abA.BBB b = new XX().new Y();
        b.printB();

    }
}
