class RestuarantUtil{
	public static void main(String a[]){
	Restuarant rest = new Restuarant();
	rest.restuarantName = "1947";
	rest.type = "Veg";
	rest.location = "Malleshwaram";
	rest.ownerName = "Ambika";
	rest.restuarantId = 456;
 	rest.serveFood();
	rest.displayRestuarantDetails();
	
	
	Restuarant rest2 = new Restuarant();
	rest2.restuarantName = "Empire";
	rest2.type = "Non-Veg";
	rest2.location = "Kormangala";
	rest2.ownerName = "Surabhi";
	rest2.restuarantId = 129;
 	rest2.serveFood();
	rest2.displayRestuarantDetails();
	}
	
	
}