package company.app;

//Note: this a working UI for adding once the tests and code of segments are working. 
//comment out this section for code coverage!
/*
import java.util.*;

public class Controller {
	public static Scanner input = new Scanner(System.in);
	public static Company compApp = new Company();

	public static void main(String[] args) {// Dan
		System.out.println("Welcome to the company App");
		while (true) {

			System.out.println("Main menu:");
			System.out.println("1. Create a new Project");
			System.out.println("2. Add new Employee");
			int command = getInput();
			if (command == 1) {
				System.out
						.println("Please enter the year, a 6 digit id number and a project name");
				int year = getInput();
				String RN = getInputString(6);
				String name = input.next();
				compApp.CreatProject(year, RN, name);
				System.out.println(compApp.getProjectByNum(year + RN)
						.getIdNumber());
			} else if (command == 2) {
				System.out.println("Please enter employee name and id");
				String name = input.next();
				String id = getInputString(4);
				compApp.addEmployee(name, id);
				System.out.println(compApp.getEmployeeById(id).id);
			}
		}

	}

	public static int getInput() { // Dan
		while (!input.hasNextInt()) {
			System.out.println("invalid input!");
			input.next();
		}

		return input.nextInt();
	}

	public static String getInputString(int numb) { // Dan
		boolean valid = false;
		String l;
		while (!valid == true) {
			l = input.next();
			if (l.length() == numb) {
				return l;
			}
			System.out.println("invalid input!");
		}

		return null;
	}
}
*/