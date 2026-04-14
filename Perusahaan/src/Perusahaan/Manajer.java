class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        double gajiDasar = super.hitungGajiTotal();
        
        double tunjanganManajerial = this.jumlahAnggotaTim * 300000;
        double totalSementara = gajiDasar + tunjanganManajerial;

        if (super.getRatingKinerja() > 4.5) {
            totalSementara += (totalSementara * 0.15);
        }

        return totalSementara;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan      : Manajer Divisi " + divisi);
        System.out.println("Anggota Tim  : " + jumlahAnggotaTim + " Orang");
    }
}