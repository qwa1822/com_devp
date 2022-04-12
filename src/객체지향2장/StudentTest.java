package 객체지향2장;

public class StudentTest {
    public static void main(String[] args) {


        Student Student=new Student();
        Student.studentNumber=010;
        Student.studentName="kim";
        Student.grade=3;

        System.out.println(Student.showStudentInfo());


        Student studentKim=new Student(12345,"kim",3);

        System.out.println(studentKim.showStudentInfo());

    }
}
