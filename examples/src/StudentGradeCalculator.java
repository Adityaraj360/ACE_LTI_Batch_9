
class Student{
    int rollno;
    String name;
    int marks;

    Student(int rollno,int marks,String name){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public void info(){
        System.out.println("This is "+this.name);
    }
}

class StudentGradeUtility{

    public void gradeCalculator(Student st){
        if(st.marks >= 90 && st.marks<=100){
            System.out.println("Grade A");
        }else if(st.marks >= 80 && st.marks<=90){
            System.out.println("Grade B");
        }else if(st.marks >= 70 && st.marks<=80){
            System.out.println("Grade C");
        }else {
            System.out.println("Failure");
        }
    }
}

//driver class/main class
public class StudentGradeCalculator {

    public static void main(String[] args){
        Student st1 = new Student(111,76,"Rajesh");

        StudentGradeUtility utility = new StudentGradeUtility();
        utility.gradeCalculator(st1);
    }
}
