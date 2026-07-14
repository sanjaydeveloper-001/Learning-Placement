import java.util.Scanner;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String st1 = sc.next();
        String st2 = sc.next();
        
        int n = st1.length();
        
        for(int i=0; i<n-1; i++){
            char ch1 = st1.charAt(i);
            char ch2 = st2.charAt(i);
            
            char ch3 = st1.charAt(i+1);
            char ch4 = st2.charAt(i+1);
            
            if(ch1 != ch2 && ch3 != ch4){
                System.out.println(ch1 + "" + ch3 + ", " + ch2 + "" + ch4 + " ");
                i++;
            }
            else if(ch1 != ch2){
                System.out.println(ch1 + ", " + ch2);
            }
        }
    }
}
