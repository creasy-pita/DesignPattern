package responsechain;

import org.junit.Test;

public class chainTest {
	@Test
	public void Test(){
		

		Manager gManager = new GeneralManager("GeneralManager");
		Manager major = new Major("Major");
		Manager commonManager = new CommonManager("CommonManager");
		
		commonManager.superior = major;
		major.superior = gManager;
		Clerk clerk = new Clerk();
		Request request1 = clerk.createRequest(0, 1);
		Request request2 = clerk.createRequest(0, 3);
		Request request3 = clerk.createRequest(1, 900);
		Request request4 = clerk.createRequest(1, 9000);
		
		commonManager.handlerRequest(request1);
		commonManager.handlerRequest(request2);
		commonManager.handlerRequest(request3);
		commonManager.handlerRequest(request4);
	}
}
