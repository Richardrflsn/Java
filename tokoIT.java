import java.util.Scanner;

public class tokoIT{
    public static void main(String[] args){
        int choice = 0, price = 0, money = 0, moneyBack = 0, jenisIT = 0;
        String[] itList = new String[5];
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println(" Welcome to Toko IT ");
            System.out.println("|       MENU       |");
            System.out.println("|  1. Beli Barang  |");
            System.out.println("|  2. Bayar Barang |");
            System.out.println("|  3. Cetak Struk  |");
            System.out.println("|      4. Exit     |");
            System.out.println("");
            System.out.print("Select option: ");
            choice = input.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.println("              List Barang            ");
                    System.out.println("|      Router      : Rp200.000      |");
                    System.out.println("|      Laptop      : Rp3.000.000    |");
                    System.out.println("|      Speaker     : Rp 500.000     |");
                    System.out.println("|      Headset     : Rp 100.000     |");
                    System.out.println("|      Printer     : Rp 1.500.000   |");
                    System.out.println("");
                    System.out.print("Pilihan anda: ");
                    String itChoice = input.next();
                    System.out.println("");

                    if(itChoice.equalsIgnoreCase("router")) {
                        price += 200000;
                    } else if(itChoice.equalsIgnoreCase("laptop")) {
                        price += 3000000;
                    } else if(itChoice.equalsIgnoreCase("speaker")) {
                        price += 500000;
                    } else if(itChoice.equalsIgnoreCase("headset")) {
                        price += 100000;
                    } else if(itChoice.equalsIgnoreCase("printer")) {
                        price += 1500000;
                    }

                    itList[jenisIT] = itChoice;
                    System.out.println("Anda memesan produk IT: " + itChoice);
                    System.out.println("Total belanja " + price);
                    jenisIT++;
                    break;
                case 2:
                    System.out.println("Total belanja: Rp " + price);
                    do {
                        System.out.print("Pembayaran: Rp ");
                        money = input.nextInt();
                        if(money < price) {
                            System.out.println("Uang tidak cukup");
                        } else {
                            moneyBack = money - price;
                        }
                    } while (money < price);

                    System.out.println("Kembalian: Rp " + moneyBack);
                    break;
                case 3:
                    System.out.println("STRUCK BELANJA TOKO IT");
                    for(int i = 0; i < jenisIT; i++) {
                        System.out.println(itList[i]);
                    }
                    System.out.println("Total belanja: Rp " + price);
                    break;
                case 4:
                    System.out.println("TERIMA KASIH SUDAH BERBELANJA DI TOKO IT");
                    break;
            
                default:
                    System.out.println("Menu option tidak tersedia!");
                    break;
            }
        } while (choice != 4);
        input.close();
    }
}