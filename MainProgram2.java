import java.util.Scanner;

class MainProgram2{
    public static void main(String[] args) {
        Student student = new Student(1 , "Shashisuma" , "Java Full Stack " , new int[] {11,12,13,14,15} );
		
		student.printStudentInfo();
        student.subjectTotal();
        student.percentageMarks();
        student.displayOutput();
    }
}

			