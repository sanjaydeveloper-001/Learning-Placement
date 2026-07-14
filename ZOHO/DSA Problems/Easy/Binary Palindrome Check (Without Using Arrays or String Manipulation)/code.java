import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0 - Palindrome");
            return;
        }

        int temp = n;
        long binary = 0;
        long place = 1;

        // Convert decimal to binary (stored as a number)
        while (temp > 0) {
            binary += (temp % 2) * place;
            place *= 10;
            temp /= 2;
        }

        long original = binary;
        long reverse = 0;

        // Reverse the binary number
        while (binary > 0) {
            reverse = reverse * 10 + (binary % 10);
            binary /= 10;
        }

        if (original == reverse) {
            System.out.println(original + " - Palindrome");
        } else {
            System.out.println(original + " - Not a Palindrome");
        }

        sc.close();
    }
}
