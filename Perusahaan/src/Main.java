import java.util.ArrayList;
import perusahaan.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        daftarKaryawan.add(new Karyawan("EMP001", "Andi", 2020, 5000000, 2.0));
        daftarKaryawan.add(new Developer("DEV001", "Budi", 2018, 7000000, 4.0, "Senior", 20));
        daftarKaryawan.add(new Developer("DEV002", "Citra", 2024, 6000000, 2.8, "Mid", 15));
        daftarKaryawan.add(new Manajer("MGR001", "Deni", 2015, 10000000, 4.8, "IT", 10));
        daftarKaryawan.add(new Manajer("MGR002", "Eka", 2025, 8000000, 3.5, "HR", 3));

        double totalAnggaran = 0;
        double gajiTertinggi = 0;
        String namaHighestEarner = "";
        double akumulasiRating = 0;

        System.out.println("=== REKAPITULASI PENGGAJIAN KARYAWAN ===");
        System.out.println("========================================");

        for (Karyawan k : daftarKaryawan) {
            k.displayInfo();
            double gajiDiterima = k.hitungGajiTotal();
            
            System.out.println("Total Gaji Bulan Ini: Rp " + String.format("%,.2f", gajiDiterima));
            System.out.println("----------------------------------------");

            totalAnggaran += gajiDiterima;
            akumulasiRating += k.getRatingKinerja();

            if (gajiDiterima > gajiTertinggi) {
                gajiTertinggi = gajiDiterima;
                namaHighestEarner = k.getNama();
            }
        }

        double rataRataRating = akumulasiRating / daftarKaryawan.size();

        System.out.println("\n=== ANALISIS METRIK PERUSAHAAN ===");
        System.out.println("Total Anggaran Gaji  : Rp " + String.format("%,.2f", totalAnggaran));
        System.out.println("Highest Earner       : " + namaHighestEarner + " (Rp " + String.format("%,.2f", gajiTertinggi) + ")");
        System.out.printf("Rata-rata Rating     : %.2f\n", rataRataRating);
    }
}