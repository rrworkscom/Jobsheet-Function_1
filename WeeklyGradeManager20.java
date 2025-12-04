import java.util.Scanner;

public class WeeklyGradeManager20 {

    static Scanner input = new Scanner(System.in);

    static String[] inputNames(int studentCount) {
        String[] names = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Input name of student " + (i + 1) + ": ");
            names[i] = input.next();
        }

        return names;
    }

    static int[][] inputData(String[] names, int weeks) {
        int[][] grades = new int[names.length][weeks];

        for (int i = 0; i < names.length; i++) {
            System.out.println("\nInput grades for " + names[i] + ":");
            for (int j = 0; j < weeks; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
            }
        }
        return grades;
    }

    static void showAll(String[] names, int[][] grades) {
        System.out.println("\n=== ALL STUDENT GRADES ===");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int highestWeek(int[][] grades) {
        int max = -1, weekIndex = -1;

        for (int week = 0; week < grades[0].length; week++) {
            for (int student = 0; student < grades.length; student++) {
                if (grades[student][week] > max) {
                    max = grades[student][week];
                    weekIndex = week;
                }
            }
        }
        return weekIndex;
    }

    static int highestStudent(int[][] grades) {
        int max = -1, studentIndex = -1;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        return studentIndex;
    }

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();

        System.out.print("Enter number of weeks: ");
        int weeks = input.nextInt();

        String[] names = inputNames(studentCount);

        int[][] grades = inputData(names, weeks);

        showAll(names, grades);

        int week = highestWeek(grades);
        System.out.println("\nHighest score is found in Week " + (week + 1));

        int student = highestStudent(grades);
        System.out.println("Highest score achieved by: " + names[student]);

        System.out.println("\nAll scores of " + names[student] + ":");
        for (int j = 0; j < grades[student].length; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[student][j]);
        }
    }
}
