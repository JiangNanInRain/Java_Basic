public class InnerClassDemo2 {
    public static void main(String[] args) {
        new Outer2().fun(30);//调用外部类方法
    }
}
class Outer2{
    private String info = "hello";
    public void fun(int temp){//从1。8开始参数可以不加final修饰也能被内部类访问
        class Inner{
            public void print(){
                System.out.println("类中的属性:"+info);
                System.out.println("方法中的参数:"+temp);

            }
        }
        new Inner().print();
    }
}