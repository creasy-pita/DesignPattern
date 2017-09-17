package abstractFactory;

public class OracleDeptService implements IDeptService{
	@Override
	public void Load(String id){
		System.out.println("OracleDeptService load entity with id:"+ id);
	}
}

