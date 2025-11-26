import java.util.Scanner;
// Saya Izin pakai command line biar memudahkan pada saaat membaca alurnya ibu 
public class RekapPenjualanCafeNoAbsen {
    // Pembuatan Array 2D
    String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    int[][] penjualan = new int[5][7];
    int JUMLAH_MENU = 5;
    int JUMLAH_HARI = 7;

    // input data penjualan (array 2D)
    void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // menampilkan seluruh data penjualan dalam bentuk tabel
    void tampilkanSemuaData() {
        // Header tabel
        System.out.print("Menu\t\t");
        for (int h = 1; h <= JUMLAH_HARI; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        // Data per menu
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8) System.out.print("\t"); // tambahan tab agar rapi
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // menu dengan total penjualan tertinggi
    void tampilkanMenuTertinggi() {
        int indeksTertinggi = 0;
        int totalTertinggi = 0;

        for (int i = 0; i < JUMLAH_MENU; i++) {
            int total = 0;
            for (int j = 0; j < JUMLAH_HARI; j++) {
                total += penjualan[i][j];
            }
            if (i == 0 || total > totalTertinggi) {
                totalTertinggi = total;
                indeksTertinggi = i;
            }
        }
        System.out.println("\nMenu dengan total penjualan tertinggi: " + namaMenu[indeksTertinggi]);
        System.out.println("Total penjualan: " + totalTertinggi);
    }

    // rata-rata penjualan untuk setiap menu selama 7 hari
    void tampilkanRataRata() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < JUMLAH_MENU; i++) {
            int total = 0;
            for (int j = 0; j < JUMLAH_HARI; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / JUMLAH_HARI;
            System.out.println(namaMenu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        RekapPenjualanCafeNoAbsen app = new RekapPenjualanCafeNoAbsen();
        app.inputDataPenjualan();
        app.tampilkanSemuaData();
        app.tampilkanMenuTertinggi();
        app.tampilkanRataRata();
    }
}
