package udemy;

public class BiNumberRunner {
    public static void main(String[] args) {

        BiNumber numbers=new BiNumber(2,3);  // 2+3
        System.out.println(numbers.add());
        System.out.println(numbers.multiply()); //2*3
        numbers.doubleValue();   //Double both numnbers
        System.out.println(numbers.getNumber1());//4
        System.out.println(numbers.getNumber2());//6

    }
}
