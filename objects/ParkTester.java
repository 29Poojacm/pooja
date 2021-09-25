class ParkTester{
	public static void main(String a[]){
	AmusementPark park = new AmusementPark();
	park.name = "Wonderla";
	park.entryfees= 500;
	park.location = "Bangalore";
	System.out.println( park.name +" "+  park.entryfees +" "+ park.location );
	park.enjoy();
	
	
	AmusementPark park2 = new AmusementPark();
	park2.name = "Ramoji Film City";
	park2.entryfees= 1500;
	park2.location = "Hyderabad";
	System.out.println( park2.name +" "+  park2.entryfees +" "+ park2.location );
	park2.enjoy();

	AmusementPark park3 = new AmusementPark();
	park3.name = "GRS Fantasy Park";
	park3.entryfees= 500;
	park3.location = "Mysore";
	System.out.println( park3.name +" "+  park3.entryfees +" "+ park3.location );
	park3.enjoy();

	}
}