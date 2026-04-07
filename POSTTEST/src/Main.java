import rental.Kendaraan;
import rental.Mobil;
import rental.Motor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deklarasi ArrayList dengan tipe Kendaraan
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        // 1) Mobil lama (< 2015) berkapasitas > 5
        daftarKendaraan.add(new Mobil("B 1234 ABC", "Toyota Innova", 2013, 300000, 7));
        
        // 2) Mobil baru (>= 2015) berkapasitas <= 5
        daftarKendaraan.add(new Mobil("D 5678 DEF", "Honda Brio", 2020, 250000, 5));
        
        // 3) Motor ber-CC >= 250
        daftarKendaraan.add(new Motor("B 9101 GHI", "Kawasaki Ninja", 2019, 150000, 250));
        
        // 4) Motor standar ber-CC < 250
        daftarKendaraan.add(new Motor("F 1121 JKL", "Honda Beat", 2022, 100000, 110));

        System.out.println("=== SISTEM PENDATAAN PENYEWAAN KENDARAAN ===\n");

        // menelusuri setiap objek
        for (Kendaraan k : daftarKendaraan) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + k.hitungHargaSewa(5));
            System.out.println("--------------------------------------------------");
        }
    }
}