import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();
        scan.close();
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 65) {
            grade = "B";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);
    }
}
