class GasCylinder{
 public String gasName;
 public String color;
 public double price;

	public GasCylinder(String gasName,String color,double price){
	System.out.println("Gas object is Created");
	this.gasName=gasName;
	this.color=color;
	this.price=price;

	}
	public static void main(String a[]){
	GasCylinder gasCylinder= new GasCylinder("HP","Red",1500);
	System.out.println(gasCylinder.gasName+" "+gasCylinder.color+" "+gasCylinder.price);
	}
}