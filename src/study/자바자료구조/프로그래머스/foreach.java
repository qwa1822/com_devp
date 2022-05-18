package study.자바자료구조.프로그래머스;

public class foreach {
    public static void main(String[] args) {

        int [][] iarr={
                {0,1},{0,2},{0,4},
        };

     //   for(int i=0; i<iarr.length; i++){
   //         int value=iarr[i];

      //      System.out.println(value);
        //}

        //타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조

        for(int i=0; i<iarr.length; i++){
            for(int j=0; j<iarr[i].length; j++){
                if(iarr[i][j]==4){
                    System.out.println(iarr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
