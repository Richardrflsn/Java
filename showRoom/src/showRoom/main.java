package showRoom;

import java.util.Scanner;

class Vehicle {
    
}

// inherit dari kelas vehicle
class Jeep extends Vehicle {
    public String modelName = "Monte";
    public String carName = "Jeep";
    public int capacity = 30;
    public int speed = 120;
    public int price = 120000;
}

class Suv extends Vehicle {
    public String modelName = "BMW X6";
    public String carName = "SUV";
    public int capacity = 15;
    public int speed = 100;
    public int price = 100000;
}

class Sedan extends Vehicle {
    public String modelName = "Honda City";
    public String carName = "Sedan";
    public int capacity = 10;
    public int speed = 120;
    public int price = 90000;
}

public class main {

    public static void main(String[] args) {
    	// deklarasi variabel yang dibutuhkan
        int choice = 0;
        Scanner input = new Scanner(System.in); // scanner untuk menerima input dari user
        Vehicle vehicle = null; // inisialisasi selected vehicle ke null
        
        // untuk mendapatkan nama model dari setiap jenis kendaraan
        String jeepModel = new Jeep().modelName;
        String suvModel = new Suv().modelName;
        String sedanModel = new Sedan().modelName;
        
        // melakukan looping dowhile sehingga menu terus berjalan sampai user melakukan input 3 baru berhenti
        do {
            System.out.println("SHOWROOM");
            System.out.println("========");
            System.out.println("1. Buy");
            System.out.println("2. Show");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            choice = input.nextInt(); // menerima input dari user untuk memilih menu
            System.out.println();
            
            // switch digunakan untuk menjalankan menu yang dipilih sesuai dengan keinginan user
            switch (choice) {
                case 1:
                    System.out.println("1. Jeep");
                    System.out.println("2. SUV");
                    System.out.println("3. Sedan");
                    System.out.print("Car's name: ");
                    String carChoice = input.next(); // Meminta user mengisi input berupa string kendaraan yang ingin dibeli
                    if (carChoice.equalsIgnoreCase("jeep")) {
                        vehicle = new Jeep();
                        // Display output spesifikasi jeep
                        System.out.println(((Jeep) vehicle).carName);
                        System.out.println(((Jeep) vehicle).modelName);
                        System.out.println("Capacity: " + ((Jeep) vehicle).capacity);
                        System.out.println("Speed: " + ((Jeep) vehicle).speed);
                        System.out.println("Price: " + ((Jeep) vehicle).price);
                        System.out.println();
                    } else if (carChoice.equalsIgnoreCase("suv")) {
                        vehicle = new Suv();
                        // Display output spesifikasi suv
                        System.out.println(((Suv) vehicle).carName);
                        System.out.println(((Suv) vehicle).modelName);
                        System.out.println("Capacity: " + ((Suv) vehicle).capacity);
                        System.out.println("Speed: " + ((Suv) vehicle).speed);
                        System.out.println("Price: " + ((Suv) vehicle).price);
                        System.out.println();
                    } else if (carChoice.equalsIgnoreCase("sedan")) {
                        vehicle = new Sedan();
                        // Display output spesifikasi sedan
                        System.out.println(((Sedan) vehicle).carName);
                        System.out.println(((Sedan) vehicle).modelName);
                        System.out.println("Capacity: " + ((Sedan) vehicle).capacity);
                        System.out.println("Speed: " + ((Sedan) vehicle).speed);
                        System.out.println("Price: " + ((Sedan) vehicle).price);
                        System.out.println();
                    }
                    break;

                case 2:
                	// Display output dari jenis kendaraan dan model yang ada di setiap kendaraan tersebut
                    System.out.println("List Car");
                    System.out.println("========");
                    System.out.println("Jeep");
                    System.out.println("========");
                    System.out.println("Jeep Model: " + jeepModel);
                    System.out.println();
                    System.out.println("========");
                    System.out.println("SUV");
                    System.out.println("========");
                    System.out.println("SUV Model: " + suvModel);
                    System.out.println();
                    System.out.println("========");
                    System.out.println("Sedan");
                    System.out.println("========");
                    System.out.println("Sedan Model: " + sedanModel);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Thank you for using the showroom application");
                    break;

                default:
                    System.out.println("NO OPTION!");
                    break;
            }
        } while (choice != 3);

        input.close();
    }
}
