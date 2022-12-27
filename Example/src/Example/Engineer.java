package Example;

public class Engineer extends Worker {
	private String department;
	private String title="engineer";
	public Engineer(String nameSurname,int age,int salary,int shift,String department) {
		super(nameSurname,age,salary,shift);
		this.department=department;
	}
	public void print() {
		super.print();
		System.out.println(" Department: "+department);
	}
	@Override
	public void titlePrint() {
		System.out.println("Title: "+title);
	}
}
