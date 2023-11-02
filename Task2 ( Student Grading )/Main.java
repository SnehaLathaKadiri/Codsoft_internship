import java.util.Scanner;

class Grade{
    public String grade(int avgScr){
        switch (avgScr / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Main{
    public static void main(String[] args){
        Grade grd = new Grade();
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects : ");
        int t_subs = sc.nextInt();
        int t_marks = 0;

        
        for (int i = 0; i < t_subs; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1)+" : ");
            int marks = sc.nextInt();
            System.out.println(" ");
            t_marks += marks;
        }

        
        int avgScr = t_marks / t_subs;

        
        String Grade = grd.grade(avgScr);

        
        System.out.print("Total marks obtained : " + t_marks + " \n\n");
        System.out.print("Percentage obtained : " + avgScr+"%\n\n");
        System.out.print("Grade obtained : " + Grade+"\n\n");

        sc.close();
        
    }
}
