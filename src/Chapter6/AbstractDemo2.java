package Chapter6;



abstract class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
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
    public  void    say(){
        System.out.println(this.content());
    };

    public abstract String content();
}

class Student1 extends Person1{
    public double score;

    public Student1(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String content(){
        return "姓名"+super.getName()+
                "年龄"+super.getName()+
                "成绩"+this.score;
    }
}


class Worker extends Person1{
    private float salary;

    public Worker(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String content(){
        return "姓名:"+super.getName()+
                "年龄"+super.getAge()+
                "工资"+this.salary;
    }

}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Person1 p1 = new Student1("张三",20,99.9);
        Person1 p2 = new Worker("李四",30,300.9F);
        p1.say();
        p2.say();


    }
}
