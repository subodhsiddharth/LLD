package com.example.ParkingModule.helperModules.Vehicle;

import com.example.ParkingModule.enums.Vehicles;
import com.example.ParkingModule.helperModules.Ticket.Ticket;

public class TwoWheelerType extends Vehicle{
    public TwoWheelerType(int id, Ticket ticket) {
        vehiclesType = Vehicles.TWO_WHEELER;
        vehicleId = id ;
        this.ticket = ticket;
    }
}
