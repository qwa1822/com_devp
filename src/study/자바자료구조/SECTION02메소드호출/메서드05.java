package study.자바자료구조.SECTION02메소드호출;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 메서드05 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        Scanner inFile;
        try {
            inFile = new Scanner(new File(fileName));
            String name=inFile.next();
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No File");


            //프로그램 자체를 종료해라. 0이면 정상적인 종료
            System.exit(0);
        }

    }
}
