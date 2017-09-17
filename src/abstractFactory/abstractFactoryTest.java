package abstractFactory;

import org.junit.Test;

public class abstractFactoryTest {
	@Test
	public void ClientTest(){
		//客户端决定需要哪个系列产品的工厂，此处需要用依赖反转来去除依赖
		IFactory factory = new SqlFactory();
		
		IUserService service = factory.creatUserService();
		service.add();
	}
}
