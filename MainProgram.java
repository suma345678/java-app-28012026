import java.util.Scanner;

class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter Student Rollno : ");
        student.rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        student.studentName = sc.nextLine();

        System.out.print("Enter Course : ");
        student.courseName = sc.nextLine();

        student.subjectMarks = new int[5];

        System.out.print("SubjectMarks1 : ");
        student.subjectMarks[0] = sc.nextInt();

        System.out.print("SubjectMarks2 : ");
        student.subjectMarks[1] = sc.nextInt();

        System.out.print("SubjectMarks3 : ");
        student.subjectMarks[2] = sc.nextInt();

        System.out.print("SubjectMarks4 : ");
        student.subjectMarks[3] = sc.nextInt();

        System.out.print("SubjectMarks5 : ");
        student.subjectMarks[4] = sc.nextInt();

        student.subjectTotal();
        student.percentageMarks();
        student.displayOutput();
    }
}
