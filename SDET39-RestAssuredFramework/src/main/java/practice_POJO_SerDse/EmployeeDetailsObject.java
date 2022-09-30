package practice_POJO_SerDse;

public class EmployeeDetailsObject 
{
	int id;
	String name;
	int[] phno;
	Object spouse;
	String address;
	
	
	public EmployeeDetailsObject(int id, String name, int[] phno, Object spouse, String address) 
	{
		
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.spouse = spouse;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int[] getPhno() {
		return phno;
	}


	public void setPhno(int[] phno) {
		this.phno = phno;
	}


	public Object getSpouse() {
		return spouse;
	}


	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
