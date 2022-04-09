package ch03;

public class Exam01 {
    public static void main(String[] args) {



        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();


        }


        for(int i=0; i<5; i++){
            if(i==2){
               break;
            }

            for(int j=0; j<i*1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("== for each ==");
        int[]nums={1,2,3,4,5};

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }


        for(int i=0; i<8;  i++){
            if(i%2==0){
                continue;
            }

           for(int j=0; j<i; j++){
               System.out.print("*");
           }

            System.out.println();

        }


        System.out.println("==02==");
        //10도간격으로 물온도를 출력 100도까지

        int waterTemperature=0;

        while(waterTemperature<100){
            waterTemperature++;


            if(waterTemperature%10==0){
                System.out.println(waterTemperature+"도 입니다.");
            }
        }


    }

}
