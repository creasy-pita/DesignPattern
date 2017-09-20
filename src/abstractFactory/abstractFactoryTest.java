package abstractFactory;

import org.junit.Test;

public class abstractFactoryTest {
/*	@Test
	public void ClientTest(){
		//�ͻ��˾�����Ҫ�ĸ�ϵ�в�Ʒ�Ĺ������˴���Ҫ��������ת��ȥ������
		IFactory factory = new SqlFactory();
		
		IUserService service = factory.creatUserService();
		service.add();
	}*/
	
/*	@Test
	public void ClientTest(){
		//DataAccess ����򵥹�����Ϊ�ͻ�������һ�� IFactory��IFactory����������ĳϵ�в�Ʒ�Ĺ�����
		IFactory factory = DataAccess.createFactory();		
		IUserService service = factory.creatUserService();
		service.add();
	}*/
	@Test
	public void ClientTest(){
		IUserService userService = DataAccess.createUserService();
		userService.add();
	}
}
