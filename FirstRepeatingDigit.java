import java.util.Scanner;

public class FirstRepeatingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long temp = num;
        int repeat = -1;

        while (temp > 0) {
            int digit = (int)(temp % 10);
            long check = temp / 10;

            while (check > 0) {
                if (digit == check % 10) {
                    repeat = digit;
                }
                check /= 10;
            }
            temp /= 10;
        }

        if (repeat != -1)
            System.out.println("First Repeating Digit = " + repeat);
        else
            System.out.println("No Repeating Digit");
    }
}
