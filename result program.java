import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects (out of 100):");
        System.out.print("Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int s3 = sc.nextInt();
        System.out.print("Subject 4: ");
        int s4 = sc.nextInt();
        System.out.print("Subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500.0) * 100;

        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75)
            System.out.println("Grade: Distinction");
        else if (percentage >= 60)
            System.out.println("Grade: First Class");
        else if (percentage >= 50)
            System.out.println("Grade: Second Class");
        else if (percentage >= 35)
            System.out.println("Grade: Pass");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}
