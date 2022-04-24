package study.자바자료구조;

import java.util.Scanner;

public class 배열2 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int ace[]=new int[n];


        for(int i=0; i<n; i++)
            ace[i]=sc.nextInt();
            sc.close();;

            //n-1 는 배열의 맨끝자리를 애기함.
        //temp에 맨마지막 자릿수를 킵해놈.
        int temp=ace[n-1];
        //n-2자리부터 거꾸로 0보다클떄까지 감소시킴.
        //맨마지막값은 킵해놨기 떄문에.
        for(int i=n-2; i>=0; i--)
            ace[i+1]=ace[i];

        //맨마지막값은 맨앞자리로 보냄.
        ace[0]=temp;


        for(int i=0; i<n; i++)
            System.out.println(ace[i]);



    }
}
