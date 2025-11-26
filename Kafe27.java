public class Kafe27{
    public static void Menu (String namaPelanggan,boolean isMember) {
        System.out.println("Selamat Datang," +namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda Adalah Member, Dapatkan Diskon 10% untuk Setiap Pembelian!");
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
    public static void main(String[] args) {
        Menu("Andi", true);
    }
}
   