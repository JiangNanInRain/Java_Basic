package Chapter15;

interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class WYZ implements Fruit{
    public void eat(){
        System.out.println("吃王义喆");
    }
}

class Factory{
    public static Fruit getInstance(String className){
        Fruit fruit =null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}
public class FactoryDemo { //将反射应用在工厂设计模式上
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("Chapter15.WYZ");
        if(f!=null){
            f.eat();
        }
    }
}
