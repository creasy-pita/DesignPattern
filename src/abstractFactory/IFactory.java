package abstractFactory;

public interface IFactory {
	public IUserService creatUserService();
	
	public IDeptService createDeptService();
	
	
	//....扩展不同产品
}
