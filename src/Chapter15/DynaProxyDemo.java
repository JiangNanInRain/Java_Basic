package Chapter15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MyInvocationHandler implements InvocationHandler{
    private Object obj;         //真实主题
    public Object bind(Object obj){ //绑定真实主题
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this); //取得代理对象

    }
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{//动态调用方法
        Object temp = method.invoke(this.obj,args);//调用方法，传入真实主题和参数
        return temp;    //返回方法的返回信息
    }

}
interface Subject{ //定义Subject接口
    public String  say(String  name,int age);
}
class RealSubject implements  Subject{//真实主题类
    public String  say(String name,int age){
        return "姓名:"+name+"，年龄:"+age; //返回信息
    }
}

//测试动态代理
public class DynaProxyDemo {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Subject sub = (Subject) handler.bind(new RealSubject());
        String info = sub.say("王义喆",22);
        System.out.println(info);
    }
}
