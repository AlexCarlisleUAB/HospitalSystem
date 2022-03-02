package uabDatabase;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UAB_Employee
{
	private String blazerID;
	private String specialty;
	private String qualifier;
	private String area;
	private String name;
	private static ArrayList<Employee> EmployeeList;
	private static ArrayList<Nurse> NurseList;
	private static ArrayList<Doctor> DoctorList;
	private static ArrayList<Surgeon> SurgeonList;
	private static ArrayList<Receptionist> ReceptionistList;
	private static ArrayList<Janitor> JanitorList;
	private static ArrayList<Admin> AdminList;
	
	
	public String getBlazerID()
	{
		return this.blazerID;
	}
	
	public String getSpecialty()
	{
		return this.specialty;
	}
	
	public static void displayList()
	{
		System.out.println("The UAB Hospital System has the following employees:");
		System.out.println("");
		int totalCount = EmployeeList.size() + DoctorList.size() + SurgeonList.size() + NurseList.size() + AdminList.size() + ReceptionistList.size() + JanitorList.size();
		System.out.println("Total Number of employees=" + totalCount);
		System.out.println("");
		System.out.println("Hospital Employees: " + EmployeeList.size());
		for (Employee emp : EmployeeList) {
			System.out.println(emp);
		}
		System.out.println("Nurses: " + NurseList.size());
		for (Nurse emp : NurseList) {
			System.out.println(emp);
		}
		System.out.println("Administrator: " + AdminList.size());
		for (Admin emp : AdminList) {
			System.out.println(emp);
		}
		System.out.println("Doctors: " + DoctorList.size());
		for (Doctor emp : DoctorList) {
			System.out.println(emp);
		}
		System.out.println("Surgeons: " + SurgeonList.size());
		for (Surgeon emp : SurgeonList) {
			System.out.println(emp);
		}
		System.out.println("Receptionists: " + ReceptionistList.size());
		for (Receptionist emp : ReceptionistList) {
			System.out.println(emp);
		}
		System.out.println("Janitors: " + JanitorList.size());
		for (Janitor emp : JanitorList) {
			System.out.println(emp);
		}
	}
	
	public static void readInputfile() 
	{
		File f = new File ("uabEmployee.txt");
		Scanner in;
		try 
		{
			in = new Scanner(f);
			while (in.hasNextLine())
			{
				while (in.hasNext())
				{
					String area = in.next(); 
					
					String name = in.next();
					
					String blazerID = in.next();
					
					switch (area) {
					case "N" : 
						String count = in.next();
						Nurse newNurse = new Nurse(area, name, blazerID, count);
						NurseList.add(newNurse);
						break;
					case "A":
						String depart = in.next();
						Admin newAdmin = new Admin(area, name, blazerID, depart);
						AdminList.add(newAdmin);
						break;
					case "D":
						String specialty = in.next();
						Doctor newDoctor = new Doctor(area, name, blazerID, specialty);
						DoctorList.add(newDoctor);
						break;
					case "S":
						String special = in.next();
						String qualifier = in.next();
						Surgeon newSurgeon = new Surgeon(area, name, blazerID, special, qualifier);
						SurgeonList.add(newSurgeon);
						break;
					case "R":
						String dep = in.next();
						String qual = in.next();
						Receptionist newRec = new Receptionist(area, name, blazerID, dep, qual);
						ReceptionistList.add(newRec);
						break;
					case "J":
						String d = in.next();
						String q = in.next();
						Janitor newJanitor = new Janitor(area, name, blazerID, d, q);
						JanitorList.add(newJanitor);
						break;
					default:
						Employee newEmp = new Employee(area, name, blazerID);
						EmployeeList.add(newEmp);
						break;
				}
					
				
				}
			}
			in.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String getQualifier() 
	{
		return this.qualifier;
	}

	public void setQualifier(String qualifier)
	{
		this.qualifier = qualifier;
	}

	public String getArea()
	{
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		EmployeeList = new ArrayList<Employee>();
		NurseList = new ArrayList<Nurse>();
		AdminList = new ArrayList<Admin>();
		DoctorList = new ArrayList<Doctor>();
		SurgeonList = new ArrayList<Surgeon>();
		ReceptionistList = new ArrayList<Receptionist>();
		JanitorList = new ArrayList<Janitor>();
		readInputfile();
		
			System.out.println("***Welcome to the UAB Hospital System***");
			System.out.println();
			System.out.println("Choose one of the following: ");
			System.out.println("1. Add an employee");
			System.out.println("2. Remove an employee");
			System.out.println("3. Display hospital employee list");
			System.out.println("4. Update the database");
			System.out.println("type anything else to close");
		
			Scanner input = new Scanner (System.in);
			int choice = input.nextInt();
		
			switch (choice)
			{
				case 1:
				{
					addEmployee();
					break;
				}
				case 2:
				{
					removeEmployee();
					break;
				}
				case 3:
				{
					displayList();
					break;
				}
				case 4:
				{
					writeToFile();
					break;
				}
				default:
					System.exit(0);
			}
			input.close();
	}

	private static void writeToFile()
	{
		
	}

	private static void removeEmployee()
	{	
		System.out.print("What is the BlazerID of the employee to be removed?");
		Scanner input = new Scanner (System.in);
		String blazerID = input.nextLine();
		
		boolean success = false;
		
		for (Employee emp : EmployeeList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				EmployeeList.remove(emp);
				success = true;
			}
		}
		
		for (Nurse emp : NurseList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				NurseList.remove(emp);
				success = true;
			}
		}
		
		for (Doctor emp : DoctorList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				DoctorList.remove(emp);
				success = true;
			}
		}
		
		for (Admin emp : AdminList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				AdminList.remove(emp);
				success = true;
			}
		}
		
		for (Surgeon emp : SurgeonList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				SurgeonList.remove(emp);
				success = true;
			}
		}
		
		for (Receptionist emp : ReceptionistList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				ReceptionistList.remove(emp);
				success = true;
			}
		}
		
		for (Janitor emp : JanitorList) {
			String ID = emp.getBlazerID();
			if (ID == blazerID) {
				EmployeeList.remove(emp);
				success = true;
			}
		}
		
		if (success) {
			System.out.println("Employee successfully terminated");
			
		}
		else {
			System.out.println("Employee not found with matching BlazerID. Ensure the BlazerID is correct and try again.");
		}
		
		input.close();
	}

	private static void addEmployee() 
	{	
		Scanner input = new Scanner (System.in);
		System.out.println("What type of employee is this?");
		System.out.println("E-- regular employee");
		System.out.println("N--Nurse");
		System.out.println("A--Admin");
		System.out.println("D--Doctor");
		System.out.println("S--Surgeon");
		System.out.println("R--Receptionist");
		System.out.println("J--Janitor");
		String areaIn = input.nextLine();
		
		System.out.print("What is his/her name?");
		String nameIn = input.nextLine();
		
		System.out.print("What is the BlazerID for this employee?");
		String idIn = input.nextLine();
		
		switch (areaIn) {
		case "N" : 
			System.out.print("How many patients does the nurse serve?");
			String countIn = input.nextLine();
			Nurse newNurse = new Nurse(areaIn, nameIn, idIn, countIn);
			NurseList.add(newNurse);
			break;
		case "A":
			System.out.print("What department/specialty is he/she in?");
			String d = input.nextLine();
			Admin newAdmin = new Admin(areaIn, nameIn, idIn, d);
			AdminList.add(newAdmin);
			break;
		case "D":
			System.out.print("What department/specialty is he/she in?");
			String d2 = input.nextLine();
			Doctor newDoctor = new Doctor(areaIn, nameIn, idIn, d2);
			DoctorList.add(newDoctor);
			break;
		case "S":
			System.out.print("What department/specialty is he/she in?");
			String d3 = input.nextLine();
			System.out.print("Can this surgeon operate? Y or N?");
			String q = input.nextLine();
			Surgeon newSurgeon = new Surgeon(areaIn, nameIn, idIn, d3, q);
			SurgeonList.add(newSurgeon);
			break;
		case "R":
			System.out.print("What department/specialty is he/she in?");
			String d4 = input.nextLine();
			System.out.print("Can this receptionist answer phones? Y or N?");
			String q2 = input.nextLine();
			Receptionist newRec = new Receptionist(areaIn, nameIn, idIn, d4, q2);
			ReceptionistList.add(newRec);
			break;
		case "J":
			System.out.print("What department/specialty is he/she in?");
			String d5 = input.nextLine();
			System.out.print("Can this janitor sweep? Y or N?");
			String q3 = input.nextLine();
			Janitor newJanitor = new Janitor(areaIn, nameIn, idIn, d5, q3);
			JanitorList.add(newJanitor);
			break;
		default:
			Employee newEmp = new Employee(areaIn, nameIn, idIn);
			EmployeeList.add(newEmp);
			break;
	}
		input.close();
	}
	
	
}