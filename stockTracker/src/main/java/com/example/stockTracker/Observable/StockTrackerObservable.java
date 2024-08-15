package com.example.stockTracker.Observable;

import com.example.stockTracker.Observer.STObserver;
import lombok.Getter;
import lombok.Setter;

public interface StockTrackerObservable {
    public void removeStock(STObserver obj );
    public void addStock(STObserver obj);
    public void notifyStock();
    public void setStock(int newPrice);
    public int getStock();

}
