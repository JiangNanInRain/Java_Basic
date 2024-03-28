package Chapter6;


import java.util.List;

interface A{
    String AUTHOR = "JNInRain";
    void print();
    String getInfo();
}

interface B{
    void say();

}
class X implements A,B{
    public void say(){
        System.out.println("ysqd!");
    }
    public String getInfo(){
        return "YS";
    }
    public void print(){
        System.out.println("作者:" +AUTHOR);
    }

}



public class InterfaceDemo1 {
    public static void main(String[] args) {
        X x =new X();
        x.say();
        x.print();
    }
}
