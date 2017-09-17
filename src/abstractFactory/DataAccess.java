package abstractFactory;

import java.lang.invoke.SwitchPoint;

public class DataAccess {
	private static final String dbStr="sql";
	
	public static IFactory createFactory(){
		IFactory factory = null;
		switch (dbStr) {
		case "sql":
			factory = new SqlFactory();
			break;
		case "oracle":
			factory = new OracleFactory();
			break;
		default:
			factory = new SqlFactory();
			break;
		}
		return factory;
	}
}
