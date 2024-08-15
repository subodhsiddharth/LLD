package com.example.car.carModels;

import com.example.car.baseCars.BaseCar;
import com.example.car.baseCars.ElectricCars;
import com.example.car.baseCars.FuelCars;

public class AstonMartinDB5 extends carModels {
    BaseCar baseElectricCar;
    public AstonMartinDB5(BaseCar bc){
        this.baseElectricCar = bc;
    }

    @Override
    public int power() {
        return 75 + this.baseElectricCar.power();
    }
}
