package responsechain;

public class Clerk {
	public Request createRequest(int type,int num){
		return new Request(type, num);
	}
}
