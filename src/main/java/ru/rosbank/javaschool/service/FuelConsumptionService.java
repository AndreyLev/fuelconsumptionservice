package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.Fuel;

public class FuelConsumptionService {

    public int howMuchFuelIsEnough(Fuel fuel)
    {
        double enoughDistance = 0;
        double roundingScore = 0.5;

        if (fuel.getCurrentVolume() > 0 && fuel.getConsumptionPerOneHundredKm() > 0) {

            enoughDistance = (double)(fuel.getCurrentVolume()) / fuel.getConsumptionPerOneHundredKm();

            if (Math.ceil(enoughDistance) - enoughDistance > roundingScore) {
                enoughDistance = (int) Math.floor(enoughDistance);
            }

            if (Math.ceil(enoughDistance) - enoughDistance < roundingScore) {
                enoughDistance = (int) Math.ceil(enoughDistance);
            }

            if (Math.ceil(enoughDistance) - enoughDistance == roundingScore) {
                enoughDistance = (int) Math.ceil(enoughDistance);
            }

        }
        return (int)enoughDistance;
    }

}
