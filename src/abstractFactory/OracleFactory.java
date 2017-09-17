package abstractFactory;

public class OracleFactory implements IFactory {

	@Override
	public IUserService creatUserService() {
		return new OracleUserService();
	}

	@Override
	public IDeptService createDeptService() {
		return new OracleDeptService();
	}

}
