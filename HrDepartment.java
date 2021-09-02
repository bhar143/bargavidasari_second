package gl.com;

public class HrDepartment extends SuperDepartment {
	public String name;
	public String todayswork;
	public String workdeadline;
	public String activity;

	
	 HrDepartment(){
	
}
	 HrDepartment(String name,String todayswork, String workdeadline, String activity){
		 this.name = name;
		 this.todayswork = todayswork;
		 this.workdeadline = workdeadline;
		 this.activity = activity;
	 }
		 
void display1() {
	System.out.println(name+"\n"+todayswork+"\n"+workdeadline+activity+"");
	super.run();
}


}
