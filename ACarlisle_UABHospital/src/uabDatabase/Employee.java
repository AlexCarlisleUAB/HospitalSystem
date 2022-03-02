package uabDatabase;

public class Employee {

	private String area;
	private String name;
	private String blazerID;
	
	public Employee (String areaIn, String nameIn, String idIn) {
		setArea(areaIn);
		setName(nameIn);
		setBlazerID(idIn);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlazerID() {
		return blazerID;
	}

	public void setBlazerID(String blazerID) {
		this.blazerID = blazerID;
	}
	
	public String toString() {
		return "Name: " + name + " BlazerId: " + blazerID;
	}
	
}
