package gl.com;

public class TechDepartment extends SuperDepartment {
	public String name;
	public String todayswork;
	public String workdeadline;
	public String techStackinformation;

	
	 TechDepartment(){
	
}
	 TechDepartment(String name,String todayswork, String workdeadline, String techStackinformation){
		 this.name = name;
		 this.todayswork = todayswork;
		 this.workdeadline = workdeadline;
		 this.techStackinformation = techStackinformation;
	 }
		 
void display2() {
	System.out.println(name+"\n"+todayswork+"\n"+workdeadline+techStackinformation+"");
	super.run();
}


}


