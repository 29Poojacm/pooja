class EEETester{
	public static void main(String a[]){
	EEE ee=new EEE();
	ee.usn="2ka17ee084";
	ee.subject="Power Electronics";
	ee.fees=90000.0;
	ee.displayDetails();
	String problemSolving=ee.problemSolving();
	System.out.println(problemSolving);
	}
}