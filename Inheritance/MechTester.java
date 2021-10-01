class MechTester{
	public static void main(String a[]){
	Mech mech=new Mech();
	mech.usn="2ka17me083";
	mech.subject="Thermodynamics";
	mech.fees=120000.0;
	mech.displayDetails();
	String problemSolving=mech.problemSolving();
	System.out.println(problemSolving);
	}
}