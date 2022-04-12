package 객체지향1장;

public class StudentTest {
    public static void main(String[] args) {

        int num=10;

        Student studentLee=new Student();

        studentLee.studentID=12345;
        studentLee.setStudentName("Lee");
        studentLee.address="서울 강남구";


        studentLee.showStudentInfo();

        Student studentKim=new Student();

        studentKim.studentID=54321;
        studentKim.StudentName="Kim";
        studentKim.address="경기도 성남시";


        studentKim.showStudentInfo();
    }
}
