class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

   // Implementasi overriding metode hitungGajiTotal untuk mengakomodasi regulasi tunjangan teknis.
    @Override
    public double hitungGajiTotal() {
        double gajiDasar = super.hitungGajiTotal();
        double tunjanganLevel = 0;

        // Penentuan nominal tunjangan
        if (this.level.equalsIgnoreCase("Senior")) {
            tunjanganLevel = 3000000;
        } else if (this.level.equalsIgnoreCase("Mid")) {
            tunjanganLevel = 1500000;
        }

       // Evaluasi pemberian bonus operasional (Bug Fix). 
        // Bonus bersifat kondisional dan hanya cair jika rating kinerja memenuhi standar deviasi minimal (3.0).
        double bonusBug = 0;
        if (super.getRatingKinerja() >= 3.0) {
            bonusBug = this.jumlahBugFix * 50000;
        }

        return gajiDasar + tunjanganLevel + bonusBug;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan      : Developer (" + level + ")");
        System.out.println("Bug Diselesaikan: " + jumlahBugFix);
    }
}