// Menggunakan import untuk memanggil kelas-kelas dari package perusahaan.
import perusahaan.Karyawan;
import perusahaan.Developer;
import perusahaan.Manajer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi struktur data dinamis menggunakan tipe data superclass (Polymorphism).
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        // Injeksi objek untuk simulasi kasus uji komprehensif. (Asumsi gaji pokok ditetapkan secara arbitrer)
        
        // Objek 1: Karyawan reguler yang diproyeksikan menerima penalti reduksi kompensasi.
        daftarKaryawan.add(new Karyawan("EMP001", "Andi", 2020, 5000000, 2.0));
        // Objek 2: Spesialis teknis senior dengan pencapaian optimal.
        daftarKaryawan.add(new Developer("DEV001", "Budi", 2018, 7000000, 4.0, "Senior", 20));
        
        // Objek 3: Spesialis teknis menengah yang kehilangan bonus perbaikan bug akibat rasio kinerja rendah.
        daftarKaryawan.add(new Developer("DEV002", "Citra", 2024, 6000000, 2.8, "Mid", 15));
        
        // Objek 4: Pimpinan departemen teknis dengan kinerja superior yang mendapat insentif ekstra.
        daftarKaryawan.add(new Manajer("MGR001", "Deni", 2015, 10000000, 4.8, "IT", 10));
        
        // Objek 5: Pimpinan operasional standar.
        daftarKaryawan.add(new Manajer("MGR002", "Eka", 2025, 8000000, 3.5, "HR", 3));

        // Variabel akumulator
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