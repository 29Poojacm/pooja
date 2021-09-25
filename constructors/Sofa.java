class Sofa{
	public String type;
	public String color;
	public int cost;

	public Sofa(String type,String color, int cost){
	System.out.println("Sofa object is created");
	this.type= type;
	this.color= color;
	this.cost= cost;
	}
	public static void main(String a[]){
	Sofa sofa=new Sofa("dunno","Red",25000);
	Sofa sofa2=new Sofa("typ", "black",30000);
	System.out.println(sofa.type+" "+sofa.color+" "+sofa.cost);
	System.out.println(sofa2.type+" "+sofa2.color+" "+sofa2.cost);
	}
	


}