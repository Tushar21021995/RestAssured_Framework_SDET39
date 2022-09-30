package practice_POJO_SerDse;

public class EmployeeDetails 
{
	// step-1 declare all the variable globally
	String Name;
	int Phone;
	String EmailID;
	String Email;
	boolean isEmployed;

	// step-2 create a constructor to initlize the variables

	public EmployeeDetails(String name, int phone, String emailID, String email, boolean isEmployed) 
	{

		this.Name = name;
		this.Phone = phone;
		this.EmailID = emailID;
		this.Email = email;
		this.isEmployed = isEmployed;
	}

	public EmployeeDetails()
	{

	}


	// step-3 provide getters and setters

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getPhone()
	{
		return Phone;
	}

	public void setPhone(int phone)
	{
		Phone = phone;
	}

	public String getEmailID()
	{
		return EmailID;
	}

	public void setEmailID(String emailID)
	{
		EmailID = emailID;
	}

	public String getEmail()
	{
		return Email;
	}

	public void setEmail(String email)
	{
		Email = email;
	}

	public boolean isEmployed()
	{
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed)
	{
		this.isEmployed = isEmployed;
	}


}
