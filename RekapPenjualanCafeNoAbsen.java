import java.util.Scanner;
// Izin memakai Command line agar gampang memahami alurnya ibu
public class RekapPenjualanCafeNoAbsen {

    String[] namaMenu;   
    int[][] penjualan;   
    int JUMLAH_MENU;
    int JUMLAH_HARI;

    //input jumlah menu, jumlah hari, nama menu, dan penjualan
    void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);

        // Input jumlah menu dan jumlah hari
        System.out.print("Masukkan jumlah menu: ");
        JUMLAH_MENU = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        JUMLAH_HARI = sc.nextInt();

        // Membuat array sesuai input pengguna
        namaMenu = new String[JUMLAH_MENU];
        penjualan = new int[JUMLAH_MENU][JUMLAH_HARI];

        // Input menu
        sc.nextLine(); 
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        // Input penjualan menu per hari
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    //data penjualan dalam bentuk tabel
    void tampilkanSemuaData() {
        System.out.print("Menu\t\t");
        for (int h = 1; h <= JUMLAH_HARI; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8) System.out.print("\t"); 
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //menu dengan total penjualan tertinggi
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

    // Menampilkan rata-rata penjualan setiap menu
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
