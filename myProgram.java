public class myProgram {
    public static void ShowUntil (int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Amount (int num1, int num2) {
        return (num1 + num2);
    }

    public static void ShowAmount (int num1, int num2) {
        ShowUntil(Amount(num1, num2));
    }

    public static void main(String[] args) {
        int temp = Amount(1, 1);
        ShowAmount(temp, 5);
    }

}
