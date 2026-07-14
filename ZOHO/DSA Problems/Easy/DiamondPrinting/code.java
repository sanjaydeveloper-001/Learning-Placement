import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            arr[i][0] = d;

            int sum = 0;
            for (int j = 2; j <= d / 2; j++) {
                if (d % j == 0)
                    sum += j;
            }

            arr[i][1] = sum;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
