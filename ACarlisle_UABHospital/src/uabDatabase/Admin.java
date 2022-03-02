package uabDatabase;

public class Admin extends Employee 
{
	private String department;
	
	public Admin (String areaIn, String nameIn, String idIn, String departIn)
	{
		super(areaIn, nameIn, idIn);
		
		setDepartment(departIn);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "Name: " + getName() + " BlazerId: " + getBlazerID() + " Department: " + getDepartment();
	}
}
