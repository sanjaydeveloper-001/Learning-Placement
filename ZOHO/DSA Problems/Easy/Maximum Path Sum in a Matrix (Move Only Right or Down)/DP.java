import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) arr[i][j] = sc.nextInt();
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i == 0 && j > 0)
                    arr[i][j] += arr[i][j-1];
                else if(i > 0 && j == 0)
                    arr[i][j] += arr[i-1][j];
                else if(i > 0 && j > 0)
                    arr[i][j] += Math.max(arr[i][j-1], arr[i-1][j]);
            }
        }
        
        System.out.print("Max:"+arr[r-1][c-1]);
    }
}
