package responsechain;

public class GeneralManager extends Manager {
	public GeneralManager (String name){
		super(name);
	}
	@Override
	void handlerRequest(Request request) {
		if(request.getType()==0 ){
			System.out.println(this.getName()+"批准天的请假申请");
		}
		else if(request.getType()==1 && request.getNum()<1000){
			System.out.println(this.getName()+"批准"+request.getNum()+"刀的加薪申请");
		}
		else {
			System.out.println(this.getName()+"继续努力，下次在再说呗");
		}
	}
	
}
