package Chapter9;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallThread implements Callable<String>{
    private int ticket = 5;

    public String call()throws Exception{
        for (int i=0;i<100;i++){
            if(ticket>0)System.out.println("卖票,余票："+this.ticket--);
        }
        return "票已经卖光";
    }

}

public class CallableDemo1  {
    public static void main(String[] args) throws Exception{
        CallThread t1 = new CallThread();
        CallThread t2 = new CallThread();
        FutureTask<String> task1 = new FutureTask<>(t1);
        FutureTask<String> task2 = new FutureTask<>(t2);
        new Thread(task1).start();
        new Thread(task2).start();

        System.out.println("A:"+task1.get());
        System.out.println("B:"+task2.get());

    }
}
