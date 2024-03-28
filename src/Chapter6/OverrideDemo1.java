package Chapter6;

class Person{
    private void print(){
        System.out.println("Person");
    }
    public Person(){
        System.out.println("我是你爹");
    }

    public void fun(){
        this.print();
    }

}
class Student extends Person{
        private String school;
        public Student(){

            System.out.println("我是儿子");
        }
        public Student(String school){
            this();//不能写super()此时，但是依然会自动调用父类构造器
            this.school = school;
            System.out.println();
         }
      void print(){
        System.out.println("Student");
    }

}


public class OverrideDemo1 {
    public static void main(String[] args) {
        new Student("清华");
    }
}
