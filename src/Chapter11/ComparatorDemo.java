package Chapter11;

import java.util.Arrays;
import java.util.Comparator;

class Stu{
    private String name;
    private int age;

    public Stu(String name, int age) {
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
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Stu)){
            return false;
        }
        Stu s = (Stu)obj;
        if(s.name.equals(this.name)&&s.age==this.age){
            return true;
        }else{
            return false;
        }

    }

}

public class ComparatorDemo {
    public static void main(String[] args) {
        Stu[] s = {
                new Stu("王义喆",22),
                new Stu("赵甜宇",21),
                new Stu("原神",13)
        };

        Arrays.sort(s, (s1, s2) -> { //compareTo方法
            if(s1.equals(s2)){
                return 0;
            }else if(s1.getAge()<s2.getAge()){
                return 1;
            }else {
                return -1;
            }
        });
    for(Stu ss:s){
        System.out.println(ss);
    }
    }
}
