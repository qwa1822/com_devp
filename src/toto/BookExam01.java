package toto;

public class BookExam01 {
    public static void main(String[] args) {
        Book b1=new Book();

//        b1.price=100;
//      setter,getter=프로퍼티(property)
//        System.out.println(b1.price);

        b1.setPrice(500);
        System.out.println(b1.getPrice());


        b1.Settitle("수민");
        System.out.println(b1.gettitle());
    }
}
