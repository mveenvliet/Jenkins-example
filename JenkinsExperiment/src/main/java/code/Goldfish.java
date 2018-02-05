package code;

public class Goldfish implements fish {
    private double sizeInCm;
    private double speedInKmh;
    private int amountOfFins;
    private String collor;

    public Goldfish(){
        this(100.0, 25.0, 7, "Gold");
    }
    public Goldfish(double sizeInCm, double speedInKmh, int amountOfFins, String collor){
        this.sizeInCm = sizeInCm;
        this.speedInKmh = speedInKmh;
        this.amountOfFins = amountOfFins;
        this.collor = collor;
    }

    public double getSize() {
        return speedInKmh;
    }

    public double getSpeedInKmh() {
        return speedInKmh;
    }

    public int getAmountOfFins() {
        return amountOfFins;
    }

    public String getCollor() {
        return collor;
    }
}
