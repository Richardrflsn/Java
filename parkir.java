import java.util.Scanner;

public class parkir {
    public static void main(String[] args){
        float jamMasuk = 0, jamKeluar = 0, lamaJam = 0;
        int biaya = 0, biayaParkir = 0;
        String jenisKendaraan = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Pembayaran Parkir");
        System.out.print("Masukan jenis kendaraan : ");
        jenisKendaraan = input.next();
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biayaParkir = 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biayaParkir = 1500;
        } else {
            System.exit(0);
        }
        System.out.println("");
        System.out.print("Masukan jam masuk kendaraan : ");
        jamMasuk = input.nextFloat();
        System.out.print("Masukan jam keluar kendaraan : ");
        jamKeluar = input.nextFloat();
        if (jamKeluar >= jamMasuk) {
            lamaJam = jamKeluar - jamMasuk;
        } else {
            lamaJam = (12 - jamMasuk) + jamKeluar;
        }
        biaya = (int)lamaJam * biayaParkir;
        System.out.println("biaya parkir yang harus dibayar : Rp" + biaya);
        input.close();
    }
}
