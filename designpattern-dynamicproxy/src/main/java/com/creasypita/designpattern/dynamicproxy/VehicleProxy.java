package com.creasypita.designpattern.dynamicproxy;

public class VehicleProxy implements Vehicle{

	Vehicle vehicle =null;
	public void run() {
		// TODO Auto-generated method stub
		if(vehicle == null){
			vehicle = new Bike();
		}
		vehicle.run();
	}

}
