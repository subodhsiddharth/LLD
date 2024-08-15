package com.example.car.Observable;

import com.example.car.Observer.STObserver;
import com.example.car.Observer.STObserverImpl;

import java.util.List;


public class STObervableImpl implements  StockTrackerObservable{

    public List<STObserverImpl> allObserver ;
    int stockPrice ;

    @Override
    public void removeStock(STObserver obj) {
        allObserver.remove(obj);
    }

    @Override
    public void addStock(STObserver obj) {
        allObserver.add((STObserverImpl) obj);
    }

    @Override
    public void notifyStock() {
        for( STObserver o : allObserver ){
            o.updateStockData();
        }
    }

    @Override
    public void setStock(int newPrice) {
        stockPrice = newPrice ;
        notifyStock();
    }

    @Override
    public int getStock() {
        return stockPrice;
    }

}
