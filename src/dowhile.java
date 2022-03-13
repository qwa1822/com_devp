import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int input;
        int sum=0;


    // 0을 입력받으면 끝 총합계산
        do{
            input=scanner.nextInt();
            sum+=input;






        } while(input!=0);
        System.out.println(sum);

    }
}
