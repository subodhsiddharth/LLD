package com.example.ParkingModule.helperModules.parkingSpot;

import com.example.ParkingModule.helperModules.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpot {
    abstract int addVehicleToSpot(Vehicle v);
    abstract int removeVehicleFromSpot(int v);
    abstract int getSpot();
    List<Vehicle> vehicles = new ArrayList<>();

    public void getAllVehicle(){
        for( Vehicle v : vehicles ){
            System.out.println("Vehicle id : "+ v.getVehicleId());
            System.out.println("Ticket id : "+v.getTicket().id);
            System.out.println("Price is  "+ v.getTicket().getPrice());
        }
    }

    int size = 100;
}
