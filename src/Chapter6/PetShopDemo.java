package Chapter6;


import java.nio.channels.SelectionKey;

interface Pet{
    public String getName();
    public String getColor();
    public int getAge();
}

class Cat implements Pet{
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog implements Pet{
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class PetShop{
    private Pet[]  pets;
    private int foot;
    public PetShop(int len){
        if(len > 0){
            this.pets = new Pet[len];
        }else {
            this.pets = new Pet[1];
        }

    }
    public boolean add(Pet p){
        if(this.foot<this.pets.length){
            this.pets[this.foot++] = p;
            return true;
        }else {
            return false;
        }

    }

    public Pet[] search(String key){
        Pet[] p = null;
        int count = 0;
        for(Pet pet:pets){
            if(pet!=null){
                if(pet.getName().indexOf(key)!=-1||pet.getColor().indexOf(key)!=-1){
                    count++;
                }

            }
        }
        p = new Pet[count];
        int f = 0;
        for(Pet pet:pets){
            if(pet!=null){
                if(pet.getName().indexOf(key)!=-1||pet.getColor().indexOf(key)!=-1){
                  p[f++] = pet;
                }

            }
        }
        return p;
    }

}
public class PetShopDemo {
    public static void main(String[] args) {
        PetShop ps =  new PetShop(5);
        ps.add(new Cat("白猫","白色的",2));
        ps.add(new Cat("黑猫","黑色的",3));
        ps.add(new Cat("花猫","花色的",3));
        ps.add(new Dog("拉布拉多","黄色的",3));
        ps.add(new Dog("金毛","金色的",3));
        ps.add(new Dog("黄狗","黑色的",3));


        print(ps.search("黑"));

    }
    public  static void print(Pet[] p){
        for(Pet k:p){


                if(k!=null)System.out.println(k.getName()+"-"+k.getColor()+"-"+k.getAge());



        }
    }
}
