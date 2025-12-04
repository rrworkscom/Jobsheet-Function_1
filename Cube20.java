import java.util.Scanner;

public class Cube20 {
    static int calculateArea (int s) {
        int area = 6 * s * s;
        return area;
    }

    static int calculateVolume (int s) {
        int vol = s * s * s;
        return vol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;
        System.out.print("Input side: ");
        s = input.nextInt();

        L = calculateArea(s);
        System.out.println("Area of the cube: " + L);
        vol = calculateVolume(s);
        System.out.println("Volume of the cube: " + vol);
    }
}
