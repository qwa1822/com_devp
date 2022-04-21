package study;

public class Java100_varaible__003 {
    public static void main(String[] args) {
        //2            //2
        //byte,short,int,long,char


        int a = 12345;


        String str = "12345";

        System.out.println(str.length());

        
        //정수-->문자열로 변환-->자릿수 구하기
        String stra = String.valueOf(a);
        System.out.println(stra.length());


        /*
         * 문자열+정수형=?*/
        System.out.println(12345+1);   //12346
        System.out.println(str+1);  // 12345+1=123451
    }
}
