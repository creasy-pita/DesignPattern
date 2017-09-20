package abstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DataAccess {
	private static final String dbStr="abstractFactory.SqlUserService";
	
/*	public static IFactory createFactory(){
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
	}*/
	
	public static IUserService createUserService(){
		IUserService userService = null;
		Class newClass=null;
		String className = "";
		Properties pro = new Properties();
		InputStream inputStream =Object.class.getResourceAsStream("/db.properties");
		try {
			pro.load(inputStream);
			className =  pro.getProperty("dialect")+ "UserService";
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			newClass = Class.forName(className);
			userService = (IUserService) newClass.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return userService;
	}
}
