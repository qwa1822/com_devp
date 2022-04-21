package study.배열;
import java.util.Arrays;
public class Arr_01 {
    public static void main(String[] args) {


        //[!]:Arrays.toString()메서드
        //반복문을 사용하지않고 배열의 값을 출력하고자 한다면
        /*
        Arrays클래스의 toString() 메서드를 사용하면된다.
        toString()인자로는 배열명을 넣어주면된다
        사용을 위해서는 기본적으로 java.util.Arrays 임포트 선언이
        되어져 있어야 한다.
        -->이떄도 세미콜론(;)까먹지 않도록 주의!
         */

        //[1] :배열선언
        int[]arr={238,483,294,522,442,487,592,873};
        
        
        //[2]:toString()메서드 이용하여 값 출력
        System.out.println(Arrays.toString(arr));  //[]괄호의 형태로 배열표시를 보여줌.
        System.out.println(arr[0]); //238

        //[3]:for반복문
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
