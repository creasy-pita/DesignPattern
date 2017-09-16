package proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void Test(){
		Vehicle vehicle = new VehicleProxy();
		vehicle.run();
		
	}
}
