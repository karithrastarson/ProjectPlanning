package company.app;

public class Project {
	//Activitty field
	private int year;
	private String number, name;
	public Employee projectLeader;
	//List of activities added by Kári
	private Activity[] toDolist;
	
	//constructor
	public Project(int year, String number, String name){ //Dan
		this.year = year;
		this.number = number;
		this.name = name;
	}
	//returns the employees id number. 
	public String getIdNumber(){ //Dan 
		return year + number;
		
	}
	public void assignProjectLeader(Employee proj){
		projectLeader = proj;
	}
	
	public void addActivity()
	{
		//Function created by Kári
	}

}
