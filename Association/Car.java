package Association;

public class Car {
   
	Engine e;
	MusicPlayer mp;
	Car(Engine e){
		this.e=e;
		e.StartEngine();
	}
	
	public void addMusicPlayer(MusicPlayer p) {
		mp=p;
		mp.PlaySong();
	}
	
	
	
}
