import java.util.Scanner;

public class jne {
    public static void main(String[] args) {
        int choice = 0, item = 0, sum = 0, per1 = 0, per5 = 0, price = 0, total = 0, money = 0, moneyBack = 0;
        int[] weight = new int[100];
        String namaKota = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("  WELCOME TO JNE PROGRAM  ");
            System.out.println("|              MENU              |");
            System.out.println("|    1. Kirim Barang             |");
            System.out.println("|    2. Bayar Pengiriman         |");
            System.out.println("|    3. Cetak Struk Pengiriman   |");
            System.out.println("|    4. EXIT                     |");
            System.out.println("");
            System.out.print("Masukan pilihan: ");
            choice = input.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.println("|        Pengiriman Barang       |");
                    System.out.println("|    Bandung 5kg = Rp10.000      |");
                    System.out.println("|    Jakarta 5kg = Rp15.000      |");
                    System.out.println("|   Surabaya 5kg = Rp20.000      |");
                    System.out.println("|       Bali 5kg = Rp25.000      |");
                    System.out.println("*** /1KG DIKENAKAN BIAYA Rp2.000 ***");
                    System.out.println("");
                    System.out.print("Pilih kota: ");
                    namaKota = input.next();
                    System.out.println("");
                    System.out.print("Jumlah barang: ");
                    item = input.nextInt();
                    System.out.println("");
                    for (int i = 1; i <= item; i++) {
                        System.out.format("Masukan Berat Barang %d: ", i);
                        weight[i] = input.nextInt();
                        sum += weight[i];
                    }
                    per1 = sum % 5;
                    per5 = (sum - per1)/5;
                    if (namaKota.equalsIgnoreCase("bandung")) {
                        price = 10000;
                    } else if (namaKota.equalsIgnoreCase("jakarta")) {
                        price = 15000;
                    } else if (namaKota.equalsIgnoreCase("surabaya")) {
                        price = 20000;
                    } else if (namaKota.equalsIgnoreCase("bali")) {
                        price = 25000;
                    }
                    total = (price * per5) + (1000 * per1);
                    System.out.println("Total Pembayaran : Rp" + total);
                    break;
                case 2:
                    System.out.println("|         MENU PEMBAYARAN        |");
                    System.out.println(" TOTAL YANG HARUS DIBAYAR: Rp " + total);
                    do {
                        System.out.print("Pembayaran : ");
                        money = input.nextInt();
                        if (money < total) {
                            System.out.println("Uang anda tidak cukup");
                        } else {
                            moneyBack = money - total;
                        }
                    } while (money < total);
                    System.out.println("Kembalian : Rp" + moneyBack);
                    break;
                case 3:
                    System.out.println("|       STRUK PENGIRIMAN       |");
                    System.out.println("        Kota : " + namaKota);
                    for (int i = 1; i <= item; i++) {
                        System.out.format("         Berat Barang %d: %d\n", i, weight[i]);
                    }
                    System.out.println("Total : Rp" + total);
                    if (money > 0) {
                        System.out.println("        LUNAS               ");
                    } else {
                        System.out.println("        BELUM LUNAS         ");
                    }
                    break;
                case 4:
                    System.out.println("Terima Kasih sudah menggunakan JNE");
                    break;
            
                default:
                    System.out.println("PILIHAN YANG ANDA PILIH TIDAK ADA");
                    break;
            }
        } while (choice != 4);
        input.close();
    }
}
