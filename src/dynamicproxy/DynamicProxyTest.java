package dynamicproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

import proxy.Bike;
import proxy.Vehicle;

public class DynamicProxyTest {
	@Test
	public void Test(){
		Vehicle vehicle = new Bike();
		TransInvocationHandler th = new TransInvocationHandler(vehicle);
		Vehicle v = (Vehicle) Proxy.newProxyInstance(vehicle.getClass().getClassLoader()
				, vehicle.getClass().getInterfaces(), th);
		v.run();
	}
}
