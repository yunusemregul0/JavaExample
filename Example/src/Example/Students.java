package Example;

public class Students {
	private String name,surname,number;
	private int note;
	private boolean successfulStatus=false;
	
   
    public String getName() {return name;}
    public void setName(String name) {
    	int len=name.length();
    	this.name=name.substring(0, 3) + new String(new char[len - 3]).replace("\0", "*");
    }
   
    public String getSurname() {return surname;}
    public void setSurname(String surname) {
    	int len=surname.length();
    	this.surname=surname.substring(0, 2) + new String(new char[len - 2]).replace("\0", "*");
    }
    
    public String getNumber() {return number;}
    public void setNumber(String number) {
    	int len=number.length();
    	this.number=new String(new char[len - 3]).replace("\0", "*")+number.substring(7, 9) ;
    }
    
    public int getNote() {return note;}
    public void setNote(int note) {
    	if (note>=65) {
			successfulStatus=true;
		} else {
			successfulStatus=false;
		}
    }
    
    public void status(Students s) {
    	if (successfulStatus) {
			System.out.println(s.name+" "+s.surname+" "+s.number+" successful!");
		}else {
			System.out.println(s.name+" "+s.surname+" "+s.number+" unsuccessful!");
		}
    }
    
}
