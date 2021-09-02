package gl.com;

public class Main {

	public static void main(String[] args) {

			AdminDepartment obj = new AdminDepartment("Welcome to Admin Department","Complete your documents submission","Complete by EOD");
			obj.display();
			System.out.println("-------------------------------------");
			HrDepartment a1 = new HrDepartment("Welcome to HR Department","team Lunch","Fill today's timesheet and mark your attendance","Complete by EOD");
			a1.display1();
			System.out.println("-------------------------------------");
			TechDepartment b1 = new TechDepartment("Welcome to Tech Department","Complete codind of Module1","Complete by EOD","Core Java");
			b1.display2();

		}


	}


