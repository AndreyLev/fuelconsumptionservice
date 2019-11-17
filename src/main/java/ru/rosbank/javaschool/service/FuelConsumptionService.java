package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.Fuel;

public class FuelConsumptionService {

    public int howMuchFuelIsEnough(Fuel fuel)
    {
        int enoughDistance = 0;

        if (fuel.getCurrentVolume() <= 0)  {
            return 0;
        }

        if (fuel.getConsumptionPerOneHundredKm() <= 0) {
            return 0;
        }

        enoughDistance = (int)Math.round((double)(fuel.getCurrentVolume()) / fuel.getConsumptionPerOneHundredKm());

        return enoughDistance;
    }

}
