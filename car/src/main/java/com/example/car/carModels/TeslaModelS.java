package com.example.car.carModels;

import com.example.car.baseCars.BaseCar;
import com.example.car.baseCars.ElectricCars;

public class TeslaModelS extends carModels {
    BaseCar baseElectricCar;
    public TeslaModelS(BaseCar bc){
        this.baseElectricCar = bc;
    }

    @Override
    public int power() {
        return 50 + this.baseElectricCar.power();
    }
}
