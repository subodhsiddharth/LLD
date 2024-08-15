package com.example.car;

import com.example.car.baseCars.ElectricCars;
import com.example.car.baseCars.FuelCars;
import com.example.car.carModels.AstonMartinDB5;
import com.example.car.carModels.FordMustang;
import com.example.car.carModels.TeslaModelS;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class car {
	public static void main(String[] args) {
		FordMustang newExtendedModel = new FordMustang(new AstonMartinDB5 (new TeslaModelS(new ElectricCars())));
		System.out.println(newExtendedModel.power());
	}

}
