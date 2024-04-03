package Chapter12;

import java.io.*;

class Person2 implements Externalizable {
    private String name;
    private transient int age;  //如果是基于Serializable接口，被transient修饰，则该变量不再被序列化
    public Person2(){}; //必须有,反序列化构建对象
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "姓名:"+this.name+"年龄:"+this.age;
    }

    public void readExternal(ObjectInput in)throws IOException ,ClassNotFoundException{
        this.name = (String) in.readObject();
        this.age = in.readInt();
    }

    public void writeExternal(ObjectOutput out)throws IOException{
        out.writeObject(this.name);
        out.writeInt(this.age);
    }

}
public class SerializeDemo2 {
    public static void main(String[] args)throws Exception {
        ser();
        dser();
    }
    public static void ser()throws Exception{
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"SerTest.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(new Person2("王义喆",10000));
        out.close();

    }

    public static void dser()throws Exception{
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"SerTest.txt");
        ObjectInputStream in = new  ObjectInputStream(new FileInputStream(f));
        Object obj = in.readObject();
        in.close();
        System.out.println(obj);

    }
}
