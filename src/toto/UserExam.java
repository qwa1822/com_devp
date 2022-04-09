package toto;

public class UserExam {
    public static void main(String[] args) {
        User user=new User("김수민","asdzxc1822@naver.com");

        System.out.println(user.getName());
        System.out.println(user.getEmail());

        System.out.println(user);
        User user2=new User("홍길동","asdzxc1822@naver.com","1234");

        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmail());

        System.out.println(user2);
    }
}
