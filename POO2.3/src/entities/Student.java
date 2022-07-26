package entities;

public class Student {
    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;

    public double finalGrade(){
        return gradeOne+gradeTwo+gradeThree;
    }

    public String studentSituation(){
        if(finalGrade()>=60) return "\nPASSED";
        else return "\nFAILED"+"\nMISSING "+String.format("%.2f", 60.00-finalGrade())+" POINTS";
    }

}
