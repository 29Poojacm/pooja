class ISTester{
	public static void main(String a[]){
	IS is=new IS();
	is.usn="2ka17is084";
	is.subject="Python";
	is.fees=70000.0;
	is.displayDetails();
	String problemSolving=is.problemSolving();
	System.out.println(problemSolving);
	}
}