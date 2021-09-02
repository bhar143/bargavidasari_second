package gl.com;

public class SuperDepartment {
	public String name;
	public String todayswork;
	public String workdeadline;
	public String todayaholiday;
	
	 SuperDepartment(){
	
}
	 SuperDepartment(String name,String todayswork, String workdeadline, String todayaholiday){
		 this.name = name;
		 this.todayswork = todayswork;
		 this.workdeadline = workdeadline;
		 this.todayaholiday = todayaholiday;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTodayswork() {
		return todayswork;
	}
	public void setTodayswork(String todayswork) {
		this.todayswork = todayswork;
	}
	public String getWorkdeadline() {
		return workdeadline;
	}
	public void setWorkdeadline(String workdeadline) {
		this.workdeadline = workdeadline;
	}
	public String getTodayaholiday() {
		return todayaholiday;
	}
	public void setTodayaholiday(String todayaholiday) {
		this.todayaholiday = todayaholiday;
	}
	
   void run() {
	   System.out.println("Today is not a Holiday");
   }

}
