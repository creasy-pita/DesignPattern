package responsechain;

public class Request {
	
	public Request(int type,int num){
		this.type=type;
		this.num=num;
	}
	//0 Çë¼Ù 1 ¼ÓÐ½
	private int type;
	public void setType(int type){
		this.type= type;
	}
	
	public int getType() {
		return type;
	}
	public int getNum() {
		return num;
	}

	private int num;
	public void setNum(int num){
		this.num= num;
	}
}
