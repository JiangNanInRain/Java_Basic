package Chapter6;


import java.util.List;

interface AA{
    String AUTHOR = "JNInRain";
    void print();
    String getInfo();
}

interface BB{
    void say();

}
class X implements AA,BB{
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
