import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;
        int temp2 = 0;
        
        while(temp > 0){
            temp2 = (temp2*10) + (temp%10);
            temp /= 10;
        }
        
        System.out.print(n+((temp2 == n)? " - Palindrome" : " - Not a Palindrome"));
        
    }
}
