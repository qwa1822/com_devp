package Java.ch09;

public class Person {

    public int height;
    public int weight;
    public String name;
    public int old;



    public Person(int height, int weight, String name, int old){
        this.height=height;
        this.weight=weight;
        this.name=name;
        this.old=old;

    }

    public void showInfo(){
        System.out.println("키는"+this.height+"이고,"+"몸무게는"+this.weight+"이고, 이름은"+this.name+"이고 ,그의 나이는"+this.old+"입니다");
    }




}

