class Country{
 public static void main(String a[]){

  String  []countryName = new String[5];
         countryName[0] = "INDIA";
	countryName[1] = "CHINA";
	countryName[2] = "Sri Lanka";
	countryName[3] = "RUSSIA";
	countryName[4] = "USA";


 int[] noOfStates = new int[5];
	noOfStates[0] = 29;
	noOfStates[1] = 11;
	noOfStates[2] = 34;
	noOfStates[3] = 45;
	noOfStates[4] = 23;
  
 for(int z=0; z<countryName.length; z++){
 System.out.println(countryName[z]+" ");
}
 for(int z=0;z<noOfStates.length;z++){
 System.out.println(noOfStates[z]+" ");

}
}

}