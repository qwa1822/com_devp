package study.배열;

public class ToArr_02 {
    public static void main(String[] args) {
        //[8] charAt() 메서드사용-->해당 인덱스에 있는 값을 반환->단어를 char배열에 한글자를 지정할수있음.
        String[] strAt = {"hong", "kim", "park"};
        System.out.println(strAt[0].charAt(2)); // ----n
        System.out.println(strAt[1].charAt(2)); //----m
        System.out.println(strAt[2].charAt(2)); //----r
        //[9]:반복문에서 charAt()메서드 사용
        //[9-1] 잘못된 예1
        for (int i = 0; i < strAt.length; i++) {          //length 3
            System.out.print(strAt[i].charAt(i) + " ");  //---hir<< 0,1,2
            //이중 반복문을 사용해줘야한다--;;;
        }
        System.out.println();

        //[9-2] 잘못된예 2
        for (int i = 0; i < strAt.length; i++)
            for (int j = 0; j < strAt.length; j++)
                System.out.print(strAt[i].charAt(j)); //- hong kim par
        System.out.println();

        //[9-3]
        System.out.println(strAt.length); // 3
        //    System.out.println(strAt[0].length);  Error
        System.out.println(strAt[1].length());


        for (int i = 0; i < strAt.length; i++) {
            for (int j = 0; j < strAt[i].length(); j++) {  //length() <<붙여줘야함
                System.out.println(strAt[i].charAt(j));

            }
            System.out.println();
        }


        //[10]: length(배열의 길이)vs length() <<문자열의 길이
        int[] aaa=new int[10];
        System.out.println(aaa.length);  //---10;

        String bbb="Welcome to Seoul";      
        System.out.println(bbb.length());   // --- 16개
    }
}
