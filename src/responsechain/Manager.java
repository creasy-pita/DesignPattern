package responsechain;

/**
 * @author ljq
 * æ≠¿Ì¿‡
 */
public abstract class Manager {
	protected Manager superior;
	
	private String name;
	public Manager(String name){
		this.name = name;
	}
	abstract void handlerRequest(Request request);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
