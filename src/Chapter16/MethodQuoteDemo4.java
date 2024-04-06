package Chapter16;



@FunctionalInterface
interface IMessage4<T>{
    public T create(String t,double p);
}

class Book{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

public class MethodQuoteDemo4 {
    public static void main(String[] args) {
        IMessage4<Book>  msg = Book::new;//构造方法
        Book book = msg.create("王义喆",23.1);
        System.out.println(book);
    }
}
