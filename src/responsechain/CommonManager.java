package responsechain;

public class CommonManager extends Manager {

	public CommonManager (String name){
		super(name);
	}
	@Override
	void handlerRequest(Request request) {
		if(request.getType()==0 && request.getNum()<=1){
			System.out.println(this.getName()+"��׼����������");
		}
		else {
			superior.handlerRequest(request);
		}
	}
	
}
