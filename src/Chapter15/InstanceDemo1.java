package Chapter15;


class Person{
    private String name;
    private int age;
    public static final String SEX = "王义喆";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void say(){
        System.out.println("我是王义喆");
    }
}
public class InstanceDemo1 {
    public static void main(String[] args) {
        Class<?> c =null;
        try{
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        Person per =null;
        try{
            per = (Person) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        per.setName("王义喆");
        per.setAge(99);
        System.out.println(per);


    }
}
