package abstractFactory;

public class SqlFactory implements IFactory {

	@Override
	public IUserService creatUserService() {
		return new SqlUserService();
	}

	@Override
	public IDeptService createDeptService() {
		return new SqlDeptService();
	}

}
