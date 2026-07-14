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
        
        help(arr,0,0,0);
        System.out.print("Max :"+max);
    }
    
    static int max = 0;
    
    static void help(int arr[][], int i, int j, int sum){
        int r = arr.length;
        int c = arr[0].length;
        
        if(i >= r || j >= c)
            return;
            
        if(i == r-1 && j == c-1)
            max = Math.max(sum + arr[i][j], max);
        
        help(arr, i+1, j, sum+arr[i][j]);
        help(arr, i, j+1, sum+arr[i][j]);
    }
}
