package Java;

public class UserInfoTest {
    public static void main(String[] args) {

        UserInfo userLee=new UserInfo();
        userLee.userId="a12345";
        userLee.userPassword="zxcvbn12345";
        userLee.userName="Lee";
        userLee.phoneNumber="01034556699";
        userLee.userAddress="Seoul, Korea";


        System.out.println(userLee.showUserInfo());

        UserInfo userKime=new UserInfo("a34555","1231231zdzz","Mr's Kim");


        System.out.println(userKime.showUserInfo());

    }
}
