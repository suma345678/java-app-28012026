import java.util.Scanner;

class Student {
    int rollno;
    String studentName;
    String courseName;

    int[] subjectMarks = new int[5];
    int totalMarks;
    double percentage;
	
	Student(int rNumber , String sName , String cName , int[] sMarks){
		rollno = rNumber;
		studentName = sName;
		courseName = cName;
		subjectMarks = sMarks;
		}
		
    void storeMarks() {
		int[] sMarks = {subjectMarks[0], subjectMarks[1], subjectMarks[2], subjectMarks[3],subjectMarks[4]};
		subjectMarks = sMarks;

    }

    void subjectTotal() {
        totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }
    }

    void percentageMarks() {
        int maxMarks = subjectMarks.length * 100;
        percentage = (totalMarks * 100.0) / maxMarks;
    }

	void displayOutput() {
		System.out.println("Total Marks obtained is " + totalMarks + " out of 500");
		System.out.println("Percentage obtained is " + (int)percentage + "% out of 100");

    }
	void printStudentInfo(){
		System.out.println("Roll Number : " +rollno );
		System.out.println("Student Name: " + studentName);
		System.out.println("Course  Name : " + courseName );	
	}
}
