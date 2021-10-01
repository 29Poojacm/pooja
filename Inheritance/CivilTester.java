class CivilTester{
	public static void main(String a[]){
	Civil civ=new Civil();
	civ.usn= "2ka17civ027";
	civ.subject="SOM";
	civ.fees=120000.00;
	civ.displayDetails();
	String problemSolving= civ.problemSolving();
	System.out.println(problemSolving);
	}
}