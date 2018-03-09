
public class CD {

	private String title;
	private String artist;
	private int numberOfSongs;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	
	public CD(String title, String artist,int numberOfSongs, int playingTime, String comment) {
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
		this.comment = comment;
	}
	
	public void print() {
		System.out.println(title +" "+ artist +" "+ playingTime +" "+ comment);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
