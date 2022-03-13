public class breakmon {
    public static void main(String[] args) {



      int num;

      int sum=0;



      //1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력하세요.
      for(num=1; ;num++){
          sum+=num;


          if(sum>=100)break;
      }

        System.out.println(sum);
        System.out.println(num);
    }
}
