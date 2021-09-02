class AirportList{
public static void main(String a[]){
String[] internationalAirport = new String[5];
       internationalAirport[0] = {"NSCB"};
	internationalAirport[1] = {"Chennai"};
	internationalAirport[2] = {"Thiruvananthapuram"};
	internationalAirport[3] = {"SVBP"};
	internationalAirport[4] = {"Guru Ram Dass Jee"};
	
String location[] = new String[5];
	location[0] = {"Kolkata"};
	location[1] = {"Chennai"};
	location[2] = {"Kerala"};
	location[3] = {"Ahemdabad"};
	location[4] = {"Amritsar"};
String domesticAirport[] = {"Raipur","Mysore","Tirupati","Visakhapatnam", "Bangalore"};
	
	
System.out.println (internationalAirport[0]+" "+internationalAirport[1]+" "+internationalAirport[2]+" "+internationalAirport[3]+" "+internationalAirport[4]);
System.out.println (location[0]+" "+location[1]+" "+location[2]+" "+location[3]+" "+location[4]);
System.out.println (domesticAirport[0]+" "+domesticAirport[1]+" "+domesticAirport[2]+" "+domesticAirport[3]+" "+domesticAirport[4]);
}
}