package Chapter11;

import java.util.Observable;
import java.util.Observer;

//观察者设计模式
class  House extends Observable{
     private float price;

    public House(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();             //设置变化点
        super.notifyObservers(price);        //通知所有观察者价格改变
        this.price = price;
    }
}


class  HousePriceObserver implements Observer{
    private  String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }
    public  void  update(Observable obj,Object arg){
        if(arg instanceof Float){
            System.out.println(this.name +"观察到价格变为:"+((Float)arg).floatValue());
        }
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
        House house = new House(1000000);
        house.addObserver(new HousePriceObserver("王1喆"));
        house.addObserver(new HousePriceObserver("王2喆"));
        house.addObserver(new HousePriceObserver("王3喆"));
        house.setPrice(999999);

    }
}
