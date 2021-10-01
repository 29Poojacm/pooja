class DellTester{
	public static void main(String a[]){
	Dell dell=new Dell();
	dell.price=40000.00;
	dell.processor="Intel";
	dell.storage="500GB";
	dell.modelNo="qwerty56";
	dell.displayDetails();
	String store= dell.store();
	System.out.println(store);
	}
}