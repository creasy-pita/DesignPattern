package responsechain;

public class GeneralManager extends Manager {
	public GeneralManager (String name){
		super(name);
	}
	@Override
	void handlerRequest(Request request) {
		if(request.getType()==0 ){
			System.out.println(this.getName()+"��׼����������");
		}
		else if(request.getType()==1 && request.getNum()<1000){
			System.out.println(this.getName()+"��׼"+request.getNum()+"���ļ�н����");
		}
		else {
			System.out.println(this.getName()+"����Ŭ�����´�����˵��");
		}
	}
	
}
