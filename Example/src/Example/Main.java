package Example;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();
		s1.setName("Yunus");
		s1.setSurname("Gul");
		s1.setNote(80);
		s1.setNumber("888888063");
		s1.status(s1);
		
		Worker w1=new Worker("Yunus Gül", 20, 6000, 40);
		w1.print();
		w1.titlePrint();
		
		Engineer e1=new Engineer("Yunus Gül", 25, 8000, 35, "IT");
		e1.print();
		e1.titlePrint();
	}

}
