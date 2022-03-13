public class 중첩반복문 {
    public static void main(String[] args) {

        int dan=2;
        int count=1;


        for(dan=2; dan<=9; dan++){
            for(count=1; count<=9; count++){
                System.out.println(dan+"x"+count+"="+dan*count);
            }
            System.out.println();
        }


        dan=2;
        count=1;
        while(dan<=9){
            count=1;

            //들어가기전에 초기화를 시켜줘야함 (while문 같은경우)
            while(count<=9){
                System.out.println(dan+"x"+count+"="+dan*count);
                count++;
            }



            dan++;
            System.out.println();
        }
    }
}
