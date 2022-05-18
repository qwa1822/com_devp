package cju.공부.JavaStduy;

import java.util.Scanner;

public class 문자열판별 {
    public static void main(String[] args) {

        //입력된 수가 정수인지 실수인지 판별하는 함수 제작
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력");
        String num = sc.next();
        if (isNumber(num)) {            //문자열을 입력받음
            System.out.println("숫자입니다");
        } else {
            System.out.println("문자가 껴있습니다..");
        }

    }

    //문자열이 숫자(정수, 실수)인지 아닌지 판별한다.
    static boolean isNumber(String str) {
        char tempCh;
        int dotCount = 0;	//실수일 경우 .의 개수를 체크하는 변수
        boolean result = true;

        for (int i=0; i<str.length(); i++){
            tempCh= str.charAt(i);	//입력받은 문자열을 문자단위로 검사
            //아스키 코드 값이 48 ~ 57사이면 0과 9사이의 문자이다.
            if ((int)tempCh < 48 || (int)tempCh > 57){
                //만약 0~9사이의 문자가 아닌 tempCh가 .도 아니거나
                //.의 개수가 이미 1개 이상이라면 그 문자열은 숫자가 아니다.
                if(tempCh!='.' || dotCount > 0){
                    result = false;
                    break;
                }else{
                    //.일 경우 .개수 증가
                    dotCount++;
                }
            }
        }
        return result;
    }
}