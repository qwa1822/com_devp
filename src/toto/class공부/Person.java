package toto.class공부;

public class Person {
   String name;    //인스턴스 필드(Static이 붙어있지 않음)
   String address;
   boolean isVip;
   static int count=0; // 클래스필드

   

   //클래스안에서는 파라미터없어도 클래스내 메소드에서 파라미터사용가능
   public void printName(){    //인스턴스 메소드
      System.out.println("내이름은"+name);
   }



   public static void printCount(){   //클래스 메소드
      //static 한 메소드에서는 인스턴스 필드나,.인스턴스 메소드를 사용할수 없다.
      System.out.println("count : "+ count);
   }
}
