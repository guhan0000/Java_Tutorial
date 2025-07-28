
public class EncapsulationEx {
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	void greet()
	{
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		EncapsulationEx e1=new EncapsulationEx();
		e1.setName("guhan");
		System.out.println(e1.getName());
		e1.greet();
	}
}
