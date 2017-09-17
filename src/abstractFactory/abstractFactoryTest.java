package abstractFactory;

import org.junit.Test;

public class abstractFactoryTest {
/*	@Test
	public void ClientTest(){
		//客户端决定需要哪个系列产品的工厂，此处需要用依赖反转来去除依赖
		IFactory factory = new SqlFactory();
		
		IUserService service = factory.creatUserService();
		service.add();
	}*/
	
	@Test
	public void ClientTest(){
		//DataAccess 就像简单工厂，为客户端生成一个 IFactory（IFactory即用于生成某系列产品的工厂）
		IFactory factory = DataAccess.createFactory();		
		IUserService service = factory.creatUserService();
		service.add();
	}
}
