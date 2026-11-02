import java.util.Scanner;

public class Tugas122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int totalAngka = 0;

        if (n < 1) {
            System.out.println("Nilai n minimal 1.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalAngka++;
                }
                System.out.println();
            }

            System.out.println("Total angka tercetak: " + totalAngka);
        }

        sc.close();
    }
}
