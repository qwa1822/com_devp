package ch03;

public class studentTest1 {
    public static void main(String[] args) {

        Student studentLee=new Student();


        studentLee.studentID=12345;
        studentLee.setStudentName("kim");
        studentLee.address="서울";


        studentLee.showstudentInfo();

    }
}
