import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        final double Assignment = .2;
        final double Project = .2;
        final double Quizzes = .1;
        final double Exams = .3;
        final double Final = .2;
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter your assignment grade average: ");
        double AssignmentGrade = Scan.nextDouble();
        System.out.print("Enter your project grade average: ");
        double ProjectGrade = Scan.nextDouble();
        System.out.print("Enter your quizzes grade average: ");
        double QuizzesGrade = Scan.nextDouble();
        System.out.print("Enter your exams grade average: ");
        double ExamsGrade = Scan.nextDouble();
        System.out.print("Enter your targetGrade: ");
        double TargetGrade = Scan.nextDouble();
        Scan.close();
        DSAFinal(AssignmentGrade,
                ProjectGrade,
                QuizzesGrade,
                ExamsGrade,
                Assignment,
                Project,
                Quizzes,
                Exams,
                Final,
                TargetGrade);
    }

    static void DSAFinal(double AssignmentGrade,
            double ProjectGrade,
            double QuizzesGrade,
            double ExamsGrade,
            double Assignment,
            double Project,
            double Quizzes,
            double Exams,
            double Final,
            double TargetGrade) {
            double FinalGrade = (TargetGrade
                - (AssignmentGrade * Assignment + ProjectGrade * Project + QuizzesGrade * Quizzes + ExamsGrade * Exams))
                / Final;
        FinalGrade = Math.round(FinalGrade * 100.0) / 100.0;
        System.out.println("You need a " + FinalGrade + " on the final to get a " + TargetGrade + " in the class.");
    }
}
