package ru.rosbank.javaschool;

public class Fuel {

    final static int millilitersInOneLiter = 1_000;

    private int currentVolume;
    private int consumptionPerOneHundredKm;

    public Fuel(double currentVolume, double consumptionPerOneHundredKm) {
        this.currentVolume = (int)(currentVolume * millilitersInOneLiter);
        this.consumptionPerOneHundredKm = (int)(consumptionPerOneHundredKm * millilitersInOneLiter);
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public double getConsumptionPerOneHundredKm() {
        return consumptionPerOneHundredKm;
    }

    public void setConsumptionPerOneHundredKm(int consumptionPerOneHundredKm) {
        this.consumptionPerOneHundredKm = consumptionPerOneHundredKm;
    }

}
