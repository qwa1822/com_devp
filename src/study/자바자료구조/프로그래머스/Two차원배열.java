package study.자바자료구조.프로그래머스;

import java.util.Scanner;

public class Two차원배열 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]number={
                {1},{0,1},{0,12},
        };


        for(int i=0; i<number.length; i++){
            for(int j=0; j<number[i].length; j++){
                System.out.println(i+"번쨰줄 배열 출력"+number[i][j]);
            }
            System.out.println();
        }
    }
}
