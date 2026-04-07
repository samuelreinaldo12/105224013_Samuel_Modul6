package rental;

public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Pnmpng: " + kapasitasPenumpang + " orang");
    }

    @Override
    public double hitungHargaSewa(int hari) {
        // Panggil perhitungan dasar dari superclass
        double total = super.hitungHargaSewa(hari);
        
        // Tambah asuransi wajib per hari
        total += (50000.0 * hari); 
        
        // Tambah biaya kebersihan flat jika kapasitas > 5
        if (kapasitasPenumpang > 5) {
            total += 50000.0; 
        }
        
        return total;
    }
}