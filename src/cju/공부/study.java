package cju.공부;

import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        
        
        //n개의 정수를 입력받아 순서대로 배열에저장
        //그리고 그런다음 모든정수들을 한칸씩 오른쪽shift
        //마지막정수는 배열의 첫칸으로 이동

        Scanner sc=new Scanner(System.in);


        int b=sc.nextInt();
        int ace[]=new int[b];

        for(int i=0; i<ace.length; i++) {

            ace[i]=sc.nextInt();   //배열값을 저장
        }


        int temp=ace[b-1];    //맨뒤에값을 저장 temp값에다가 저장
        for(int i=b-2; i>=0; i--){   //배열의 역순으로 출력

            ace[i+1]=ace[i];   //i+1 부분에 i값을 전달 0->1 이런식

            }
        ace[0]=temp;


        for(int i=0; i<ace.length; i++){
            System.out.print(ace[i]+"\t");

        }




    }
}
