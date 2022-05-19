package cju.공부.인프런자료구조;

public class 소수찾기_배열2 {
    public static void main(String[] args) {



// 1~100000의 모든 소수들을 찾아서 출력하는 프로그램
        for (int n = 2; n <= 100000; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n && isPrime; i++) {

            }
            if (isPrime)
                System.out.println(n);
        }


        //2,3,...,n/2;  ,,, root(n) 까지만 돌아도 충분하다. sqrt(n)
/*
    boolean isPrime=true;

    for(int i=2; i<=n/2; i++){
        if(n%i==0){
            isPrime=false;
            break;     //break를 만나면 바로멈춘다.!
        }
    }
    if(isPrime)
        System.out.println(n);
        첫번째 방법이다
    }*/

    /*
     방법2

     boolean isPrime=true;
        for(int i=2; i<=n/2 && isPrime; i++){  //isPrime이 false가되면 빠져나옴

        }
        if (isPrime)
            System.out.println(n);
    }
*/


        /*
        방법3
        boolean isPrime=true;
        for(int i=2; i*i<=n && isPrime; i++){  //i*i의 제곱이 n보다작다는것과 같은것
                                            //root를 계산하는것


        }

        if(isPrime)
            System.out.println(n);
    }*/
    }
}
