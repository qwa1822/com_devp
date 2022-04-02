package toto.class공부;

public class PersonTest4 {
    static int i;
    static{
        i=500;
        System.out.println("static block"); //원래는 static필드 초기화한다
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
