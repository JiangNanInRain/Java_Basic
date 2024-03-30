package Chapter9;




class  Food{
    private String name ="雪";
    private String content = "已过期(made by wyz)";
    private  boolean flag = false;
    public synchronized void set(String name,String content){
        if(!flag){
            try {
                super.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;
        super.notify();
    }
    public synchronized void get(){
        if(flag){
            try {
                super.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.getName()+":"+this.getContent());
        flag = true;
        super.notify();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


class Producer implements Runnable{
    private Food food = null;

    public Producer(Food food){
        this.food = food;
    }
    public void run(){
        boolean flag = false;
        for(int i=0;i<50;i++){
            if(flag){
                 this.food.set("雪","made by wyz");
                 flag = false;
            }else {
                this.food.set("香辣鸡腿堡","美味");
                flag = true;
            }
        }
    }
}

class Consumer implements Runnable{
    private Food food = null;

    public Consumer(Food food){
        this.food = food;
    }
    public void run(){
       for(int i=0;i<50;i++)
       {
           try {
               Thread.sleep(3000);
               this.food.get();
           }catch (Exception e){
               e.printStackTrace();
           }
       }
    }
}
public class ThreadProConDemo {
    public static void main(String[] args) {
        Food f = new Food();
        new Thread(new Producer(f),"赵甜宇").start();
        new Thread(new Consumer(f),"王义喆").start();

    }
}
