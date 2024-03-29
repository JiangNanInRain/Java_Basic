package Chapter6;

interface  inter1{
    void print();
}
class  Bb implements inter1{
    public void print(){
        System.out.println("this Bb");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        inter1 x = new Bb();
        x.print();
    }
}
