package Chapter9;


class MyThread2 implements Runnable{
    private String name;
    public MyThread2(String name){
        this.name = name;
    }

    public void run(){
        for(int i=0;i<10;i++)System.out.println(name+" -"+i);
    }
}
public class RunnableDemo1 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("王义喆");
        MyThread2 t2 = new MyThread2("忧桑");//实例化Runnable对象
        Thread mt1 = new Thread(t1);
        Thread mt2 = new Thread(t2);//仍然倚靠Thread实现多线程

        mt1.start();
        mt2.start();



    }
}
