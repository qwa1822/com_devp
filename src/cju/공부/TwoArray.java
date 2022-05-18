package cju.공부;

public class TwoArray {
    public static void main(String[] args) {


       int arr[][]=new int[10][5];

       int arr1[]=new int[arr.length*arr[0].length];

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){

               arr[i][j]=(i+1)*(j+1);
           }
       }

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               System.out.println("\t"+arr[i][j]);
           }
           System.out.println();
       }

        System.out.println("변환");

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               arr1[(i*arr[i].length)+j]=arr[i][j];
           }
       }

        System.out.println("1차원 배열 출력");
        for(int i=0; i<arr1.length; i++){
            if(i%arr[0].length==0){
                System.out.println();
            }
            System.out.println("\t"+arr1[i]);
        }
    }
}
