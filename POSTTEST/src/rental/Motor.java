package rental;

public class Motor extends Kendaraan {
    private int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }

    @Override
    public double hitungHargaSewa(int hari) {
        // Panggil perhitungan dasar dari superclass
        double total = super.hitungHargaSewa(hari);
        
        // Tambah pajak barang mewah per hari jika CC >= 250
        if (kapasitasMesin >= 250) {
            total += (25000.0 * hari); 
        }
        
        return total;
    }
}