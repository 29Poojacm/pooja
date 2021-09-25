class MusicUtil{
	public static void main(String a[]){
	MusicalInstruments music = new MusicalInstruments();
	music.name = "Guitar";
	music.price = 4000.50;
	music.frequency = "20hz";
	music.type = "Western";
	music.displayInstrumentalDetails();
	music.play(music.name);
	
	MusicalInstruments music2 = new MusicalInstruments();
	music2.name = "Violin";
	music2.price = 4999.50;
	music2.frequency = "15hz";
	music2.type = "Classical";
	music2.displayInstrumentalDetails();
	music2.play(music2.name);
	
}
}