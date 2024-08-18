package com.example.ParkingModule.helperModules.parkingSpot;

import com.example.ParkingModule.helperModules.Vehicle.Vehicle;

public class ParkingSpotTwoWheeler extends ParkingSpot{

    @Override
    public int addVehicleToSpot(Vehicle vechicle) {
        vehicles.add(vechicle);
        System.out.println("Available Size is : " + --size);
        return size;
    }

    @Override
    public int removeVehicleFromSpot(int vechicleId) {
        vehicles.removeIf(vehicles -> vehicles.vehicleId == vechicleId);
        System.out.println("Available Size is : " + ++size);
        return size;
    }

    @Override
    public int getSpot() {
        return size;
    }
}
