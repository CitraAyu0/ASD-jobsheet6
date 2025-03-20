import java.util.Scanner;

public class DosenMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen05 list = new DataDosen05();
        boolean menu = true;

        while (menu) {
            System.out.println("\n===== MENU PILIHAN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DESC (Selection Sort)");
            System.out.println("5. Sorting DESC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < list.dataDosen05.length) {
                        System.out.print("Kode               :");
                        String kode = sc.nextLine();
                        System.out.print("Nama               :");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P):");
                        char jk = sc.next().charAt(0);
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Usia               :");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen05 dsn = new Dosen05(kode, nama, jenisKelamin, usia);
                        list.tambah(dsn);
                    } else {
                        System.out.println("Data sebelum sorting: ");
                        list.tampil();
                    }
                    break;

                case 2:
                    System.out.println("\n== Data Dosen ==");
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("\n== Data Setelah Sorting ASC ==");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDESC();
                    System.out.println("\n== Data Setelah Sorting DESC (Selection Sort) ==");
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("\n== Data Setelah Sorting DESC (Insertion Sort) ==");
                    list.tampil();
                    break;

                case 6:
                    menu = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                    break;
                
            }
        }
    }
}
