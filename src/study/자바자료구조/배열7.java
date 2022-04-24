package study.자바자료구조;

import java.util.Scanner;

public class 배열7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n];


        for(int i=0; i<n; i++)
            number[i]=sc.nextInt();

        int max=0;
        for(int i=0; i<n; i++){
            //입력받은 곳 까지
            for(int j=i; j<n; j++){

                //convert data[i]...data[j] into an integer
            //test if it is a prime
                //소수인지검사 그게 소수라면 yes, compere to the max


                int val=0;


                for(int k=i; k<=j; k++)
                    
                    //이게인제 데이터 i~j 까지 벨류
                    val=val*10+(number[k]);

                    //소수인지 검사해야함

                    boolean isPrime=true;

                    for(int k=2; k*k<=val && isPrime; k++)
                        if(val%k==0)
                            isPrime=false;
                    if(isPrime && val>max)
                        max=val;


            }


        }
        if(max>0)
            System.out.println(max);
        else
            System.out.println("No Prime number");

        System.out.println(max);

    }
}
