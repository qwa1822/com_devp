package cju.공부.인프런자료구조.자바기능;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {




        String []name=new String[1000];   //배열의 크기를 지정 String형
        String []number=new String[1000];   //전화번호도 String 형식으로받음.

        int n=0;

        Scanner inFile= null;
        try {
            inFile = new Scanner(new File("input.txt")); //detect End  of File

            while(inFile.hasNext()){
                name[n]=inFile.next();
                number[n]=inFile.next();
                n++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(9);
        }

        for(int i=0; i<n; i++){
            System.out.println(name[i]+" :"+ number[i]);
        }





    }
}
