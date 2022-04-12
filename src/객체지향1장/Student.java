package 객체지향1장;

public class Student {
    public int studentID;
    public String StudentName;
    public String address;



    public void  setStudentName(String name){
        StudentName=name;
    }

    public String getStudentName(){
        return StudentName;
    }

    public void showStudentInfo(){
        System.out.println("학생의 학번은"+studentID+"이름은"+StudentName+"주소는"+address+"입니다");
    }


}
