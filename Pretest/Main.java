package minimarket;

public class Main {
    public static void main(String[] args) {
        MakananRingan snackKu = new MakananRingan("Indomie goreng", 3500.0, "Rendang");
        System.out.println("=== Detail Produk ===");
        snackKu.tampilkanDetail();
    }
}