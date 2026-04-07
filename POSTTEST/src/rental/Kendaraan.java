package rental;

public class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("Nomor Polisi   : " + nomorPolisi);
        System.out.println("Merk           : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("Harga Sewa/Hari: Rp" + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari) {
        double total = hargaSewaDasar * hari;
        //Jika tahun produksi di bawah 2015, akan mendapatkan diskon 10%
        if (tahunProduksi < 2015) {
            total = total - (total * 0.10); 
        }
        return total;
    }
}