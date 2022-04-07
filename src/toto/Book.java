package toto;

public class Book {

    private int price;  //field price
    private String title;

    public  int getPrice(){
        return this.price; //this는 내자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price){  //지역변수
        this.price=price;
    }

    public String gettitle(){
        return this.title;
    }

    public void Settitle(String title){
        this.title=title;
    }
}
