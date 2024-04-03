package Chapter12;


import java.io.*;

class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "姓名:"+this.name+"年龄:"+this.age;
    }
}
public class SerializeDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"SerTest.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(new Person("王义喆",3));
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        Object obj = in.readObject();
        in.close();
        System.out.println(obj instanceof Serializable);
    }
}
