package game;

public class HeroStrength extends Hero {
    private String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe        : " + this.tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double damageDiterima = damage * 0.5;
        this.health -= damageDiterima;
        System.out.println(this.nama + " Kamu menahan damage dengan keceh. Kamu hanya menerima " + damageDiterima + " damage.");
    }
}