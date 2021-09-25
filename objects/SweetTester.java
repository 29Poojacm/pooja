class SweetTester{
	public static void main(String a[]){
	Sweets sweet = new Sweets();
	sweet.name = "Rasgulla";
	sweet.cost= 1500;
	sweet.famousin = "Gujurat";
	System.out.println( sweet.name +" "+  sweet.cost +" "+ sweet.famousin );
	sweet.taste();

	Sweets sweet2 = new Sweets();
	sweet2.name = "Mysore Pak";
	sweet2.cost= 500;
	sweet2.famousin = "Mysore";
	System.out.println( sweet2.name +" "+  sweet2.cost +" "+ sweet2.famousin );
	sweet2.taste();

	Sweets sweet3 = new Sweets();
	sweet3.name = "Rasmalai";
	sweet3.cost= 1500;
	sweet3.famousin = "Bangalore";
	System.out.println( sweet3.name +" "+  sweet3.cost +" "+ sweet3.famousin );
	sweet3.taste();
	}
}