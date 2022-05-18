package study.자바자료구조.Chapter3String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leason {

 //   static int numbers[] = new int[1000];
 //   static String[] names = new String[1000];
  //  static int n = 0;

    public static void main(String[] args) {
         int numbers[] = new int[1000];
         String[] names = new String[1000];
         int n = 0;

        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt"));

            while(sc.hasNext()){
                names[n]=sc.next();
                numbers[n]=sc.nextInt();
                n++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No File");
            System.exit(1);
        }
        //정렬 함수
        bubbleSort(n,names,numbers);


        sc.close();

        for (int i = 0; i < n; i++)
            System.out.println(i + "Name:" + names[i] + ", Number:" + numbers[i]);


    }

    static public void bubbleSort(int n,String[]names,int[]numbers) {


        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(numbers[j]>numbers[j+1]){


                    //str1.equals(str) <<두문자열이 같으면 true가 됨.
                //누가 사전식을 먼저썻냐를 검사하는거기떔에
                    //compareTo 비교대상 둘중하나가
                    //두개중 누가더크냐 아니면같냐를 출력하기때문에
                    //두개가 동일하면 0을 출력하고
                    //names[j]>compareTo(names[j+1)]>0 <이렇게쓰면
                    //앞에가 뒤에보다 크냐고 묻는것.


                    //swap numbers[j] > numbers[j+1]
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;


                    String tmpser=names[j];
                    names[j]=names[j+1];
                    names[j+1]=tmpser;
                }
            }
        }

    }
}
