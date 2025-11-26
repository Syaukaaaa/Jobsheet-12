public class Kubus27 {
    public static int volume(int sisi){
        return sisi*sisi*sisi;
    }
    public static int alas(int sisi){
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        int sisi=5;
        int volume=volume(sisi);
        int alas=alas(sisi);

         System.out.println("Sisi Kubus       : " + sisi);
        System.out.println("Volume Kubus     : " + volume);
        System.out.println("Luas Permukaan Kubus  : " + alas);
    }
}

