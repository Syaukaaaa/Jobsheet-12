import java.util.Scanner;
public class Kafe27{
    public static void Menu (String namaPelanggan,boolean isMember,String kodePromo) {
        System.out.println("Selamat Datang," +namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda Adalah Member, Dapatkan Diskon 10% untuk Setiap Pembelian!");
    }
      if (isMember) {
            System.out.println("Anda adalah Member, dapatkan diskon 10%!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo DISKON50 → Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo DISKON30 → Diskon 30%");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===Menu Resto Kafe===");
        System.out.println("1.Kopi Hitam - Rp.15.000");
        System.out.println("2.Cappuccino - Rp.20.000");
        System.out.println("3.Latte - Rp.22.000");
        System.out.println("4.Teh Tarik - Rp.12.000");
        System.out.println("5.Roti Bakar - Rp.10.000");
        System.out.println("6.Mie Goreng - Rp.18.000" );
        System.out.println("======================================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");

    }
    public static int hitungTotalHarga(int pilihanMenu,int banyakItem){
        int[]hargaItems={15000,20000,22000,12000,10000,18000};
        int hargaTotal=hargaItems[pilihanMenu-1]*banyakItem;
        return hargaTotal;
    }

    
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        Menu("Andi", true,"DISKON50");
          System.out.println("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
         System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}
   