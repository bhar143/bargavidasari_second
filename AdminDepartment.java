package gl.com;

public class AdminDepartment extends SuperDepartment {
		public String name;
		public String todayswork;
		public String workdeadline;

		
		 AdminDepartment(){
		
	}
		 AdminDepartment(String name,String todayswork, String workdeadline){
			 this.name = name;
			 this.todayswork = todayswork;
			 this.workdeadline = workdeadline;
		 }
			 
	void display() {
		System.out.println(name+"\n"+todayswork+"\n"+workdeadline);
		super.run();
	}

	
}
