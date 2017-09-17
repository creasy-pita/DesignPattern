package abstractFactory;

public class OracleUserService implements IUserService{
	@Override
	public boolean add(){
		System.err.println("OracleUserService add an entity ");
		return true;
	}
}
