package com.example.car.Observer;

import com.example.car.Observable.StockTrackerObservable;

public class STObserverImpl implements  STObserver{

    StockTrackerObservable stObj ;
    String name ;

    public STObserverImpl(StockTrackerObservable obj, String name ){
        this.stObj = obj ;
        this.name = name ;
    }

    @Override
    public void updateStockData() {
        System.out.println("Price for Observer : "+ name + " is : "+stObj.getStock());
    }
}
