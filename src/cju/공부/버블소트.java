package cju.공부;

public class 버블소트 {
    public static void main(String[] args) {


        int number[] =
                {1, 3, 4, 65, 46, 46, 84, 51, 23, 4,
                        84, 6541, 32, 15, 34, 894, 9874, 651,
                        32, 1, 4, 6847, 65, 41};

        int temp;
        //bubble sort
        //number.length-1 마지막은 이미 정렬이 되었기 때문에 비교해줄 필요가 없다.
        for(int i=0 ; i<number.length-1; i++) {
            for (int j = i+1; j < number.length; j++) {
                //앞의 수가 더 크다면 swap
                if(number[i] >number[j]) {		//부호만 바꾸면 내림차순으로 정렬할 수 있다.
                    temp = number[i];
                    number[i] = number[j];
                    number [j] = temp;
                }
            }
        }
        //정렬 출력
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

}
