package abstractFactory;

public class SqlDeptService implements IDeptService{
	@Override
	public void Load(String id){
		System.out.println("SqlDeptService load entity with id:"+ id);
	}
}

