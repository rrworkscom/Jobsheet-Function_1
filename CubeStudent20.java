import java.util.Scanner;

public class CubeStudent20 {

    static Scanner input = new Scanner(System.in);

    static String[] names = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    static int[][] inputData() {
        int[][] grades = new int[5][7];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Input grades for " + names[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
            }
        }
        return grades;   
    }

    static void showAll(int[][] grades) {
        System.out.println("\n=== ALL STUDENT GRADES ===");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int highestWeek(int[][] grades) {
        int max = -1, weekIndex = -1;

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 5; i++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                    weekIndex = j;
                }
            }
        }
        return weekIndex;
    }

    static int highestStudent(int[][] grades) {
        int max = -1, studentIndex = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        return studentIndex;
    }

    public static void main(String[] args) {

        int[][] grades = inputData();   
        showAll(grades);

        int week = highestWeek(grades);
        System.out.println("\nHighest score is in Week " + (week + 1));

        int student = highestStudent(grades);
        System.out.println("Highest score achieved by: " + names[student]);

        System.out.println("\nAll scores of " + names[student] + ":");
        for (int j = 0; j < 7; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[student][j]);
        }
    }
}
