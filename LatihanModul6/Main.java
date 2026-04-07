import game.Hero;
import game.HeroStrength;

public class Main {
    public static void main(String[] args) {
        // Soal 5: Membuat dua objek Hero yang berbeda
        // Bebas berkreasi dengan nama dan status awalnya!
        Hero hero1 = new Hero("Arthur", 100.0, 20.0);
        HeroStrength hero2 = new HeroStrength("Gatotkaca", 150.0, 25.0);

        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        System.out.println("-------------------");
        hero2.display();

        System.out.println("\n=== SESI LATIHAN ===");
        hero1.berlatih();
        hero2.berlatih();

        System.out.println("\n=== SESI PERTARUNGAN ===");
        // Mari kita simulasikan keduanya terkena serangan sebesar 30 damage
        double seranganMusuh = 30.0;
        hero1.terimaSerangan(seranganMusuh);
        hero2.terimaSerangan(seranganMusuh); 
        // hero2 seharusnya hanya menerima 15 damage karena overridenya

        System.out.println("\n=== STATUS AKHIR ===");
        hero1.display();
        System.out.println("-------------------");
        hero2.display();
    }
}