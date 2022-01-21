package edunova;

public class Oblik {

	protected String prefix;
	private String name;
	
	public Oblik(String prefix) {
		this.prefix=prefix;
	}

	public String getName() {
		return  new StringBuilder().append(prefix).append(":").append(name).toString();
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
