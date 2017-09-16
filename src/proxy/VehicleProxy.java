package proxy;

public class VehicleProxy implements Vehicle{

	Vehicle vehicle =null;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//使用时加载
		if(vehicle == null){
			vehicle = new Bike();
		}
		vehicle.run();
	}

}
