package game;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Claude", 100.0, 30.0);
        HeroStrength hero2 = new HeroStrength("Gatotkaca", 150.0, 15.0);

        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        System.out.println("-------------------");
        hero2.display();

        System.out.println("\n=== SESI LATIHAN ===");
        hero1.berlatih();
        hero2.berlatih();

        System.out.println("\n=== SESI PERTARUNGAN ===");
        double seranganMusuh = 30.0;
        hero1.terimaSerangan(seranganMusuh);
        hero2.terimaSerangan(seranganMusuh); 

        System.out.println("\n=== STATUS AKHIR ===");
        hero1.display();
        System.out.println("-------------------");
        hero2.display();
    }
}