package uabDatabase;

public class Doctor extends Employee 
{
	private String specialty;
	
	public Doctor (String areaIn, String nameIn, String idIn, String specialty)
	{
		super(areaIn, nameIn, idIn);
		setSpecialty(specialty);
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public String toString() {
		return "Name: " + getName() + " BlazerId: " + getBlazerID() + " Specialty: " + getSpecialty();
	}
}
