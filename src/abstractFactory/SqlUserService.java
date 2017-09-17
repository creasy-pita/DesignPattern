package abstractFactory;

public class SqlUserService implements IUserService{
	@Override
	public boolean add(){
		System.out.println("SqlUserService add an entity ");
		return true;
	}
}
