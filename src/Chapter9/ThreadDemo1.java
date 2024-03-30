package Chapter9;

class MyThread extends Thread{
    private String name;
    public  MyThread(String name){
        this.name = name;
    }


    public void run(){
        for (int i = 0;i<19;i++){
            System.out.println(name+"i="+i);
        }
    }

}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("王义喆");
        MyThread t2 = new MyThread("赵甜宇");
        t1.start();//如果用的run ，则结果是顺序执行的
        t2.start();
    }
}
