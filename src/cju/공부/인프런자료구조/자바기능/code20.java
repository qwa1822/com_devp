package cju.공부.인프런자료구조.자바기능;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code20 {


  static String [] name=new String[1000];     //메인함수 바깥이기떄문에
  static String [] number=new String[1000];   //전역변수
                //클래스어디에서 든지 사용가능하다.

    static int n=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            Scanner inFile = new Scanner(new File("input.txt"));
            while (inFile.hasNext()) {
                name[n] = sc.next();
                number[n] = sc.next();
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No File");
            System.exit(9);
        }

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + ":" + number[i]);
        }
    }

    static void bubbleSort(){

        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){

                                                //문자열
                if(name[j].compareTo(name[j+1])>0){          //str1.equals(str2) 같은지다른지 비교
                    //swap name[j]....and name[j+1]
                    //compareTo 는 비교하라는것
                    //name[j] 가 name[j+1] 보다큰지 비교 >
                    //name[j] 가 name[j+1]보다 크냐?? > 부등호
                    //name[j]가 name[j+1]보다 작냐? < 부등호
                    String tmp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=tmp;

                    tmp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=tmp;
                }
                }
        }
        }

    }

