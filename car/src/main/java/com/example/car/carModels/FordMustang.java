package com.example.car.carModels;

import com.example.car.baseCars.BaseCar;
import com.example.car.baseCars.ElectricCars;
import com.example.car.baseCars.FuelCars;

public class FordMustang extends carModels {
    BaseCar baseElectricCar;
    public FordMustang(BaseCar bc){
        this.baseElectricCar = bc;
    }

    @Override
    public int power() {
        return 100 + this.baseElectricCar.power();
    }
}
