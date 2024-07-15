package Association;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Engine myEngine= new Engine();
		Car BMW= new Car(myEngine);
		
		BMW.addMusicPlayer(new MusicPlayer());
		
        
	}

}
