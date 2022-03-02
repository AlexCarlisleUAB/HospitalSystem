package uabDatabase;

public class Surgeon extends Employee 
{
	private String specialty;
	private String qualifier;
	
	public Surgeon(String areaIn, String nameIn, String idIn,String specIn, String qualIn)
	{
		super(areaIn, nameIn, idIn);
		
		setSpecialty(specIn);
		setQualifier(qualIn);
	}
	
	public String getSpecialty()
	{
		return specialty;
	}
	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
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
		return "Name: " + getName() + " BlazerId: " + getBlazerID() + " Specialty: " + getSpecialty() + " can operate? " + getQualifier();
	}
}
