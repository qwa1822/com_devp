package cju.공부.JavaStduy;

import java.util.Scanner;

public class 버블소트 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int ace[]={1,2,3,414512,4212421,2213,343,312,122,133,455,677};

        for(int i=0; i<ace.length; i++){
            for(int j=i+1; j<ace.length; j++){
                if(ace[i]>ace[j]){
                    int temp=ace[i];
                    ace[i]=ace[j];
                    ace[j]=temp;
                }
        }


        }

        for(int i=0; i<ace.length; i++){
            System.out.println(ace[i]);
        }
    }
}
