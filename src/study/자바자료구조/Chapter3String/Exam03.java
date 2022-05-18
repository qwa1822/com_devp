package study.자바자료구조.Chapter3String;

public class Exam03 {

    public static void main(String[] args) {

        int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};


        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println(i+"번쨰줄 배열 출력"+array[i][j]);
            }
            System.out.println();
        }


    }
}
