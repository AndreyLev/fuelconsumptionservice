package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.Fuel;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumptionServiceTest {

    @Test
    void shouldCalculateWhenFuelCurrentVolumeIsZero() {

        Fuel fuel = new Fuel(0, 56);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(0,result);

    }

    @Test
    void shouldCalculateWhenFuelCurrentVolumeIsNegative() {

        Fuel fuel = new Fuel(-23, 56);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(0,result);

    }

    @Test
    void shouldCalculateWhenFuelConsumptionPerOneHundredKmIsNegative() {

        Fuel fuel = new Fuel(23, -34);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(0,result);

    }

    @Test
    void shouldCalculateWhenFuelConsumptionPerOneHundredKmIsZero() {

        Fuel fuel = new Fuel(23, 0);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(0,result);

    }

    @Test
    void shouldCalculateWhenTheEnoughDistanceIsCloserToTheCeilingValue() {

        Fuel fuel = new Fuel(23, 7);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(3,result);

    }

    @Test
    void shouldCalculateWhenTheEnoughDistanceIsCloserToTheFloorValue() {

        Fuel fuel = new Fuel(24.5, 7);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(4,result);

    }

    @Test
    void shouldCalculateWhenTheEnoughDistanceIsBetweenCeilingAndFloorValue() {

        Fuel fuel = new Fuel(26, 7);
        FuelConsumptionService fuelConsumptionService = new FuelConsumptionService();

        int result = fuelConsumptionService.howMuchFuelIsEnough(fuel);

        assertEquals(4,result);

    }

}