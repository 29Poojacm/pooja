class Planets{
	public String planetName;
	public String size;
	public int position;
	
	public  Planets(){
	System.out.println("object is created");
	}
	public void rotate(){
	System.out.println("present in solar system");
	}
	public void displayPlanetsDetails(){
	
	System.out.println(planetName+" "+size+" "+position);
	}
}