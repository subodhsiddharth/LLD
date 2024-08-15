package com.example.car;

import com.example.car.Observable.STObervableImpl;
import com.example.car.Observer.STObserverImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StockTrackerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StockTrackerApplication.class, args);
		STObervableImpl stObj = new STObervableImpl();
		List<STObserverImpl> allObserver = new ArrayList<>();
		for( Integer i = 10 ; i <= 20 ; i++  ){
			STObserverImpl obj = new STObserverImpl(stObj,"observe " + i.toString() );
			allObserver.add(obj);
		}
		stObj.allObserver = allObserver ;
		System.out.println("Stocks Old price: ");
		stObj.setStock(10);
		System.out.println("New stock price: ");
		stObj.setStock(25);
	}

}
