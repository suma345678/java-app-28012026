import java.util.Scanner;

class Student {
    int rollno;
    String studentName;
    String courseName;

    int[] subjectMarks = new int[5];
    int totalMarks;
    double percentage;

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
        System.out.println("Percentage obtained is " + percentage +  " out of 100");
    }
}
