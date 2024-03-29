package Chapter6;


class A{
    public void fun1(){
        System.out.println("A->fun1");
    }
    public void fun2(){
        this.fun1();
    }
}

class B extends A{
    public void fun1(){
        System.out.println("B->fun1");

    }
    public void fun3(){
        System.out.println("B->fun3");
    }


}


public class InstanceDemo1 {
    public static void main(String[] args) {
        A a1 = new B();
        System.out.println("A a1 = new B():"+(a1 instanceof  A));
        System.out.println("A a1 = new B():"+(a1 instanceof  B));

        A a2 = new A();
        System.out.println("A a2 = new A():"+(a2 instanceof  A));
        System.out.println("A a2 = new A():"+(a2 instanceof  B));


    }
}
