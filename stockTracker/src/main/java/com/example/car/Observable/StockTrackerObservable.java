package com.example.car.Observable;

import com.example.car.Observer.STObserver;

public interface StockTrackerObservable {
    public void removeStock(STObserver obj );
    public void addStock(STObserver obj);
    public void notifyStock();
    public void setStock(int newPrice);
    public int getStock();

}
