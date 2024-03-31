package Chapter11;


import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + '\t' +age +'\t'+ score;
    }
    public int compareTo(Student stu){
        if(this.score> stu.score){
            return -1;//降序
        }else if (this.score < stu.score){
            return 1;
        }else {
            if (this.age>stu.age){
                return 1;
            }else if (this.age<stu.age){
                return -1;
            }else {
                return 0;
            }
        }
    }

}
public class ComparableDemo {
    public static void main(String[] args) {
        Student stu[] = {
                new Student("王义喆",20,59.5),
                new Student("老赵头",19,99.5),
                new Student("赵甜宇",28,59.5)
        };
        Arrays.sort(stu);
        for(Student s:stu){
            System.out.println(s);
        }
    }
}
