package responsechain;

public class Major extends Manager {
	public Major (String name){
		super(name);
	}
	@Override
	void handlerRequest(Request request) {
		if(request.getType()==0 && request.getNum()<=3){
			System.out.println(this.getName()+"��׼����������");
		}
		else {
			superior.handlerRequest(request);
		}
	}
	
}
