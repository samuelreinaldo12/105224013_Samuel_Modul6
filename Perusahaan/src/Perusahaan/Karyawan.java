import java.util.ArrayList;

class Karyawan {
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // Penyediaan fungsi Getter untuk atribut yang perlu diakses secara read-only oleh subclass atau kelas luar.
    public double getRatingKinerja() {
        return ratingKinerja;
    }

    public String getNama() {
        return nama;
    }

    public double hitungGajiTotal() {
        int masaKerja = 2026 - this.tahunMasuk;
        double bonusLoyalitas = 0.05 * this.gajiPokok * masaKerja;
        double gajiSementara = this.gajiPokok + bonusLoyalitas;

        if (this.ratingKinerja < 2.5) {
            gajiSementara = gajiSementara - (gajiSementara * 0.10);
        }

        return gajiSementara;
    }

    public void displayInfo() {
        System.out.println("ID Karyawan  : " + idKaryawan);
        System.out.println("Nama         : " + nama);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Rating       : " + ratingKinerja);
        System.out.println("Gaji Pokok   : Rp " + String.format("%,.2f", gajiPokok));
    }
}