package uabDatabase;

public class Janitor extends Employee 
{
	private String department;
	private String qualifier;
	
	public Janitor (String areaIn, String nameIn, String idIn, String departIn, String qualIn)
	{
		super(areaIn, nameIn, idIn);
		
		setDepartment(departIn);
		setQualifier(qualIn);
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getQualifier() 
	{
		return qualifier;
	}

	public void setQualifier(String qualifier)
	{
		this.qualifier = qualifier;
	}
	
	public String toString() {
		return "Name: " + getName() + " BlazerId: " + getBlazerID() + " Department: " + getDepartment() + " can sweep? " + getQualifier();
	}
}
