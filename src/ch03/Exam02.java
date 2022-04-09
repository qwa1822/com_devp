package ch03;

public class Exam02 {
    public static void main(String[] args) {


        //일차우 배열

        System.out.println("일차원 배열====");
        int[]myArray={1,2,3};
        System.out.println("myArray[1]"+myArray[1]);

        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("------for each----------");
        for(int i : myArray){
            System.out.println(i);
        }


        //2차원 배열
        System.out.println("--2차원 배열--");
        int[][]myArray2={{1,2,3},{4,5,6}};
        System.out.println("myArray[1][2]"+myArray2[1][2]);


            //바깥문은 행을 갖고오고 안쪽은 각각의숫자를 가져온다.
        for(int i=0; i<myArray2.length; i++){
            for(int j=0; j<myArray2[i].length; j++){
                System.out.println(myArray2[i][j]);
            }
        }



        for(int[] ints:myArray2){
            for(int anInt:ints){
                System.out.println("anInt="+anInt);
            }
        }

        //q1 아래와 같이 3x3행렬이 2차원배열로 초기화 되어있다.
        //모든원소를 1로 변경하고 ,대각 원소는 10으로 변경하시오.
        int[][]testArray1={{0,0,0},{0,0,0},{0,0,0}};


        for(int i=0; i<testArray1.length; i++){
            for(int j=0; j<testArray1[i].length; j++){
              testArray1[i][j]=1;

              if(i==j){
                  testArray1[i][j]=10;

              }
            }
        }
                for(int[]itemRow: testArray1){
                    for(int itemCol:itemRow){
                        System.out.print(itemCol+" ");
            }
            System.out.println();
        }
    }
}
