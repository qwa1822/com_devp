package ch06;

public class Student    {

    public int studentNumber;
    public String studentName;
    public int grade;
    
    //기본생성자를 만들어줌 그럼 오류가없어짐d Default 생성자--
    public Student(){
        
    }
    //멤버변수를 설정 this를설정
    public Student(int studentNumber,String studentName,int grade){

        this.studentNumber=studentNumber;
        this.studentName=studentName;
        this.grade=grade;

    }
    public String showStudentInfo(){


        return studentName+"학생의 학번은"+studentNumber+"이고,"+grade+"학년입니다.";
    }
}
