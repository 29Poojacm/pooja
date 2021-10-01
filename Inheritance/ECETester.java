class ECETester{
	public static void main(String a[]){
	ECE ec=new ECE();
	ec.usn= "2ka17ec027";
	ec.subject="DC";
	ec.fees=119000.00;
	ec.displayDetails();
	String problemSolving= ec.problemSolving();
	System.out.println(problemSolving);
	}
}