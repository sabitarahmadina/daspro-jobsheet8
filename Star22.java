import java.util.Scanner;

public class Star22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
           System.out.print(i + "   ");
        }

        System.out.println();
        sc.close();
    }
}