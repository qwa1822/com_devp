package toto.class공부;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        p1.name="홍길동"; //문자열은 new를 사용하지않고 인스턴스가 사용할수있다. 되도록 new를 사용하지말자(String사용화면)
        p2.name="조조";



        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.isVip);

        System.out.println("-------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
