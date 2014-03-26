package company.app;

import java.util.ArrayList;

public class ProjectPlannerApp { 
	private ArrayList<Project> projectList = new ArrayList<Project>();
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	//creates a new project
	public void CreatProject(int year, String RN, String string) { //Dan
		Project newProject = new Project(year,RN,string);
		projectList.add(newProject);
		
		
	}
	//adds a new employee			
	public void addEmployee(String name, String id){ //Dan
		Employee emp = new Employee(name,id);
		employeeList.add(emp);
		
	}

	// returns a project given a name (change return if not found)
	public Project getProjectByNum(String n) { //Dan 
		Project next;
		for(int i = 0;i<=projectList.size()-1;i++){
			next = projectList.get(i);
			if(next.getIdNumber().equals(n)) return next;
		}
		return null;
	}
	//returns a getEmployee given his id (change return if not found)
	public Employee getEmployeeById(String n) { //Dan 
		Employee next;
		for(int i = 0;i<=employeeList.size()-1;i++){
			next = employeeList.get(i);
			if(next.id.equals(n)) return next;
		}
		return null;
	}

}
