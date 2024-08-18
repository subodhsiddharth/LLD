package com.example.ParkingModule.helperModules.Vehicle;

import com.example.ParkingModule.enums.Vehicles;
import com.example.ParkingModule.helperModules.Ticket.Ticket;

public abstract class Vehicle {

    public Vehicles getVehicleType() {
        return vehiclesType;
    }
    Ticket ticket;
    public  int vehicleId;
    Vehicles vehiclesType;

    public Ticket getTicket(){
        return ticket;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void removeTicket(){
        ticket = null;
    }

}
