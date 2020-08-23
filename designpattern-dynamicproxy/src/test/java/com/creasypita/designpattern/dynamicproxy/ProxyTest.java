package com.creasypita.designpattern.dynamicproxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void Test(){
		Vehicle vehicle = new VehicleProxy();
		vehicle.run();
		
	}
}
