import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
        list.bubbleSort();
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
