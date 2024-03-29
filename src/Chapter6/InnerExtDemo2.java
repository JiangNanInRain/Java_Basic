package Chapter6;



interface K{
    void printK();
    default void fun(){//1.8开始支持普通方法，并且必须被default修饰
        System.out.println("ys");
    }
    abstract class D{
        public abstract void printD();
    }
}



class F implements K{
    public void printK(){
        System.out.println("K!");

    }
    class P extends D{
        public void printD(){
            System.out.println("D!");
        }


    }
}
public class InnerExtDemo2 {
    public static void main(String[] args) {
        K.D b = new F().new P();
        b.printD();

    }
}
