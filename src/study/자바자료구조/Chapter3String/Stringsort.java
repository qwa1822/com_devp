package study.자바자료구조.Chapter3String;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
    public static void main(String[] args) {

//방법1
//        Scanner sc=new Scanner(System.in);
//
//        String str=sc.next();
//        char[]StringtoChar=str.toCharArray();
//        Arrays.sort(StringtoChar);
//        String sortedString=new String(StringtoChar);
//
//        System.out.println("The Unsorted string is:"+str);
//        System.out.println("The sorted String is :"+sortedString);

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char[]StringtoChar=str.toCharArray();
        for(int i=0; i<(StringtoChar.length-1); i++){
            for(int j=i+1; j>0; j--){
                if(StringtoChar[j]<StringtoChar[j-1]){
                    char temp=StringtoChar[j-1];
                    StringtoChar[j-1]=StringtoChar[j];
                    StringtoChar[j]=temp;
                }
            }
        }
        String SortedString = new String(StringtoChar);
        System.out.println("The Unsorted String is : " + str);
        System.out.println("The Sorted String is : " + SortedString);

    }
}
