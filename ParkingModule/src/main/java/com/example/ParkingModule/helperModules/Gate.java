package com.example.ParkingModule.helperModules;

import com.example.ParkingModule.helperModules.parkingSpot.ParkingSpotFourWheeler;
import com.example.ParkingModule.helperModules.parkingSpot.ParkingSpotTwoWheeler;

public class Gate {
   public ParkingSpotFourWheeler fwps;
   public ParkingSpotTwoWheeler twps;

    public Gate(ParkingSpotFourWheeler fwps, ParkingSpotTwoWheeler twps) {
        this.fwps = fwps;
        this.twps = twps;
    }
}
