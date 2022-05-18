package study.자바자료구조.Chapter3String;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leason2 {
    public static void main(String[] args) {


//괄호안 조건을 true인동안 반복
        while(true){

            Scanner sc=new Scanner(System.in);
            System.out.println("$ ");

            String command=sc.next();
            if(command.equals("read")){
                String fileName=sc.next();
                makeIndex(fileName);
            }
            else if(command.equals("find")){

            }
            else if(command.equals("saveas")){

            }
            else if(command.equals("exit")){
                    break;
            }

            sc.close();

        }




    }

    static  void makeIndex(String fileName){


    }

}
