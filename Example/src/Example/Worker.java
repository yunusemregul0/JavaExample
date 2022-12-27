package Example;

public class Worker {
	private String nameSurname;
	private int age,salary,shift;
	private String title="worker";
	
	public Worker(String nameSurname,int age,int salary,int shift) {
		this.nameSurname=nameSurname;
		this.age=age;
		this.salary=salary;
		this.shift=shift;
	}
	public void print() {
		System.out.println("Name and Surname: "+nameSurname+ " Age: "+age+" Salary: "+salary+" Shift: "+shift);
	}
	public void titlePrint() {
		System.out.println("Title: "+title);
	}

}
