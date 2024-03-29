package Chapter6;

class C extends  A{
    public void fun1(){
        System.out.println("C->fun1");
    }
    public void fun5(){
        System.out.println("C->fun5");
    }
}


public class InstanceDemo {
    public static void main(String[] args) {
        func(new B());
        func(new C());

    }
    public static void func(A a){
        a.fun1();
        if(a instanceof B){
            B b =(B)a;
            b.fun3();
        }
        if(a instanceof C){
            C c = (C) a;
            c.fun5();
        }


    }
}
