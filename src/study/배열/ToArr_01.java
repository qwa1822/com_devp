package study.배열;

public class ToArr_01 {
    public static void main(String[] args) {

        //[6]:String 2차원 배열 만들기-->2x3 Shape
        //2행 3열 ==2x3 Shape
        //아시아 -->동북아시아(한국,중국,일본),동남아시아(태국,베트남,필리핀)


        String[][] asia_nations = {
                {"한국", "중국", "일본"},
                {"태국", "베트남", "필리핀"}
        };


        System.out.println(asia_nations[0][1]); //중국 0번째 1
        System.out.println(asia_nations[0]);  //---동북아시아 국가를 저장하고있는 1차원배열을 찍으라는 소리이기때문에 값이안나온다

        //배열의 주소를 참조하는 값이 나오는 것
        System.out.println(asia_nations[1]);
        System.out.println(asia_nations[1][0]);    //---태국
        System.out.println(asia_nations[1][2]);

        System.out.println(asia_nations.length);  // 1차원배열 2개를 가지고있어서 2라고나옴
        System.out.println(asia_nations[0].length);  //3
        System.out.println(asia_nations[1].length); //3

        //[7]: 반복문을 사용한 String 2차원 배열 값 출력
        //바깥 for문
        for (int i = 0; i < asia_nations.length; i++) {
            for (int j = 0; j < asia_nations[i].length; j++) {  //안쪽 for문
                System.out.println(asia_nations[i][j] + " "); // 한국 중국 일본
                //태국 베트남 필리핀


            }
        }

    }
}
