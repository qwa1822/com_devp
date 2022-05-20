package cju.공부.인프런자료구조.자바기능;

public class code17 {
    public static void main(String[] args) {


        for(int n=2; n<=100000; n++){
            if(isPrime(n))
                System.out.println(n);
        }
    }


     static boolean isPrime(int n){


        if(n<2)
            return false;

        for(int i=2; i*i<=n; i++)
            if(i%n==0)
                return false;
        return true;
    }
}
