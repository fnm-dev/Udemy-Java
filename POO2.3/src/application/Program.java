package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("NAME: ");
        st.name=sc.nextLine();
        System.out.print("FIRST GRADE: ");
        st.gradeOne=sc.nextDouble();
        System.out.print("SECOND GRADE: ");
        st.gradeTwo=sc.nextDouble();
        System.out.print("THIRD GRADE: ");
        st.gradeThree=sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f", st.finalGrade());
        System.out.println(st.studentSituation());

        sc.close();
    }
}
