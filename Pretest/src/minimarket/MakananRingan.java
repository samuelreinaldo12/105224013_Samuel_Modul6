package minimarket;

public class MakananRingan extends Produk {
    private String rasa;

    // Konstruktor untuk subclass
    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga); 
        this.rasa = rasa;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); 
        System.out.println("Rasa        : " + rasa);
    }
}