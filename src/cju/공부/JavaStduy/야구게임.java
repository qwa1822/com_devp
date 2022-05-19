package cju.공부.JavaStduy;

import java.util.Scanner;

public class 야구게임 {
    public static void main(String[] args) {


        int r_num[], u_num[];
        boolean clear;


        r_num = new int[3];
        u_num = new int[3];

        clear = false;


        random(r_num);

        clear = loop(r_num, u_num);

    }


    static void random(int r_num[]) {


        int w = 0;
        int r;

        boolean[] hey = new boolean[10];

        for (int i = 0; i < hey.length; i++) {
            hey[i] = false;
        }


        while (w < 3) {
            r = (int) (Math.random() * 10);
            if (hey[r] == false) {
                hey[r] = true;
                r_num[w] = r + 1;
                w++;
            }
        }

        for (int i = 0; i < r_num.length; i++) {
            System.out.println("r_num[" + i + "]=" + r_num[i]);
        }


    }


    static boolean loop(int r_num[], int u_num[]) {
        //finding
        boolean clear = false;
        int strike;
        int ball;
        int w = 0;

        while(w < 10) {
            strike = 0;
            ball = 0;
            //user 의 숫자 입력
            userInput(u_num);
            // ball
            for(int i = 0;i < 3; i++){
                for(int j = 0;j < 3; j++){
                    //숫자는 같지만 자리가 다르면 볼
                    if(u_num[i] == r_num[j] && i != j){
                        ball++;
                    }
                }
            }
            // strike
            for(int i = 0;i < 3; i++){
                //숫자도 같고 자리도 같으면 스트라이크
                if(u_num[i] == r_num[i]){
                    strike++;
                }
            }
            if(strike > 2){
                clear = true;
                break;
            }

            // message ..strike ..ball
            System.out.println(strike + "스트라이크 " + ball + "볼입니다");
            w++;
        }

        return clear;
    }

    static void userInput(int[] u_num){
        int w=0;
        Scanner sc=new Scanner(System.in);

        while(w<3){
            System.out.println((w+1)+"번쨰 수");
            u_num[w]=sc.nextInt();
            w++;
        }
    }

    static void result(boolean clear){
        if(clear) {
            System.out.println("축하합니다!");
        }else{
            System.out.println("아쉽습니다.");
        }
    }

    }

