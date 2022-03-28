package cju;

 /*


 정수(0>n<10000)과 String(s)를 입력받아 , s를 n번 출력하는 메소드만들기
  */
public class methodex01 {

    public static void main(String[] args) {


        getNumberString(2,"hello");
    }

    public static void getNumberString(int a,String b){

        if(a>=0 && a<=10000){
            for(int i=0; i<a; i++){
                System.out.println(b);
            }
        }
    }
}
