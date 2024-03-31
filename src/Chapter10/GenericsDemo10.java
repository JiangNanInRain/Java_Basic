package Chapter10;


import sun.misc.Perf;

interface Message{ //标记接口
}

class Contact implements Message{ //联系方式
    private String address;
    private String telephone;
    private String zipcode;//邮政编码

    public Contact(String address, String telephone, String zipcode) {
        this.address = address;
        this.telephone = telephone;
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "联系方式\n{" +
                "address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}


class Introduction implements  Message{ //个人基本信息
    private  String name;
    private  String sex;
    private  int age;

    public Introduction(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Introduction{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}


class  Person<T extends  Message>{
    private  T message;

    public Person(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Person{" +
                "message=" + message +
                '}';
    }
}

public class GenericsDemo10 {
    public static void main(String[] args) {
        Person<Contact> p =new Person<>(new Contact("杭州市","1145141919","18"));
        Person<Introduction> p2 = new Person<>(new Introduction("王义喆","女",30));

        System.out.println(p);
        System.out.println(p2);
    }
}
