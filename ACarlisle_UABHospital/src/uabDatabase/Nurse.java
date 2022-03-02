package uabDatabase;

public class Nurse extends Employee 
{
	private String count;
	
	public Nurse(String areaIn, String nameIn, String idIn, String countIn)
	{
		super(areaIn, nameIn, idIn);
		
		setCount(countIn);
		
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
	
	public String toString() {
		return "Name: " + getName() + " BlazerId: " + getBlazerID() + " Number of patients: " + getCount();
	}
		
	
}
