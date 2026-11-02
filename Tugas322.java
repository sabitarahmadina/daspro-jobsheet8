import java.util.Scanner;

public class Tugas322 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        }

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif!");
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah barang pelanggan ke-" + j + ": ");
                int jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif!");
                    System.out.print("Jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: "
                + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        sc.close();
  }  
}
