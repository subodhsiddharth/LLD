package com.example.ParkingModule;

import com.example.ParkingModule.helperModules.Gate;
import com.example.ParkingModule.helperModules.Ticket.FourWheelerTicket;
import com.example.ParkingModule.helperModules.Ticket.Ticket;
import com.example.ParkingModule.helperModules.Ticket.TwoWheelerTicket;
import com.example.ParkingModule.helperModules.Vehicle.FourWheelerVehicle;
import com.example.ParkingModule.helperModules.Vehicle.TwoWheelerType;
import com.example.ParkingModule.helperModules.Vehicle.Vehicle;
import com.example.ParkingModule.helperModules.parkingSpot.ParkingSpot;
import com.example.ParkingModule.helperModules.parkingSpot.ParkingSpotFourWheeler;
import com.example.ParkingModule.helperModules.parkingSpot.ParkingSpotTwoWheeler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingModuleApplication {

	public static void main(String[] args) {
		ParkingSpotFourWheeler fwp = new ParkingSpotFourWheeler();
		ParkingSpotTwoWheeler twp = new ParkingSpotTwoWheeler();
		Gate gate = new Gate(fwp,twp);

		for( int i = 0 ; i < 10 ; i++){
			if( i % 2 == 0 ){
				Ticket ticket = new FourWheelerTicket(i);
				FourWheelerVehicle xcar = new FourWheelerVehicle(i*2,ticket);
				gate.fwps.addVehicleToSpot(xcar);
			} else{
				Ticket ticket = new TwoWheelerTicket(i);
				TwoWheelerType ybike = new TwoWheelerType(i*2,ticket);
				gate.twps.addVehicleToSpot(ybike);
			}
		}

		gate.fwps.getAllVehicle();
		gate.fwps.removeVehicleFromSpot(0);


		gate.fwps.getAllVehicle();
	}

}
