package abstractFactory;

import org.junit.Test;

public class abstractFactoryTest {
	@Test
	public void ClientTest(){
		//�ͻ��˾�����Ҫ�ĸ�ϵ�в�Ʒ�Ĺ������˴���Ҫ��������ת��ȥ������
		IFactory factory = new SqlFactory();
		
		IUserService service = factory.creatUserService();
		service.add();
	}
}
