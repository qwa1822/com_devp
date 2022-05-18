package study.자바자료구조.Chapter3String;

import java.util.Scanner;

public class Leason3 {
    public static void main(String[] args) {



  // 문자열 처음부터 검사.
    int i=0;
    Scanner sc=new Scanner(System.in);
    //charAt(i) 문자열str 에서 chatAt을 뽑아내줌
        String str=sc.next();
        int j=str.length()-1; //문자열 끝자리부터 검사.
 
//    while(!Character.isLetter(str.charAt(i)) {  // 234&^&^& 이런코드도 들어올수있음
//            i++;                            //문자열의 유효한범위를 벗어날수도 있기떄문에
//
//        }



        //while  i-th character is not letter 영어알파벳이 아닌경우
        //i++값을 증가시켜줌
        //i의 유효한 범위를 지정해줌 
        //-1이면 문자 끝에까지
        //i 가 제로부터 시작해서 str.length()-1 까지 검사를 충족하고
        while(i<str.length() -1&& !Character.isLetter(str.charAt(i)))
            i++;
        while(j>=0 && !Character.isLetter(str.charAt(i)))
            j--;

        if(i>j)
            System.out.println(str.substring(i,j+1));

        
        
        //잘라낸 문자열을 저장
            // i<=....   <=j+1
       String trimmed=str.substring(i,j+1);







    }
    }

