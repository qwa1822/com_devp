package ch03;

public class Student {

    String address;
    int studentID;
    String setStudentName;


    public void showstudentInfo(){

        System.out.println("그 학생의 학번은"+studentID+"학생의 이름은"+setStudentName+"주소는"+
                address);
    }
    public String StudentName(String name){
        setStudentName=name;
        return name;
    }


    public void setStudentName(String name) {
        setStudentName=name;
    }
}
