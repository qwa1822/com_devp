package cju.String;

public class Exam04 {
    public static void main(String[] args) {

        int i=7;
        System.out.println("Java"+i);
        System.out.println("Java"+7);
        System.out.println(7+1+"Java"+7+1);


        //문자열 'JDK'와 정수 14를 포맷명시자 "%s %d"에 맞춘 문자열을 반화한다.
        String version=String.format("%s %d", "JDK",14);
        System.out.println(version);

        String fruits=String.join(",","apple","banana","cherry","durrian");

        System.out.println(fruits);


        String Pi=String.valueOf(3.14);
        System.out.println(Pi);
    }
}
