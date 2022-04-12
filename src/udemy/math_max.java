package udemy;

public class math_max {
    public static void main(String[] args) {


        System.out.println(sumofThreeNumbers(15,25,30));
        System.out.println(CalculateThirdAngle(20,30));
    }



    static int sumofThreeNumbers(int firstNumbers,int secondNumber,int thirdNumbers){
        int sum=firstNumbers+secondNumber+thirdNumbers;
        return sum;
    }

    static int CalculateThirdAngle(int angle1,int angle2){
        int angle3=180-(angle1+angle2);
        return angle3;
    }



}
