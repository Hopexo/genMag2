package genderMag2;

public class Song<T> {

	T songName;
	T songArtist;
	T songYear;
	T songID;

		
	//Constructor
	
	public Song() {
		
	}
	
	public Song(T songName, T songArtist, T songYear, T songID) {
		super();
		this.songName = songName;
		this.songArtist = songArtist;
		this.songYear = songYear;
		this.songID = songID;
	}
	//Getters & Setters
	public T getsongName() {
		return songName;
	}

	public void setsongName(T songName) {
		this.songName = songName;
	}
	public T getsongArtist() {
		return songArtist;
	}
	public void setsongArtist(T songArtist) {
		this.songArtist = songArtist;
	}
	public T getsongYear() {
		return songYear;
	}
	public void setsongYear(T songYear) {
		this.songYear = songYear;
	}
	public T getsongID() {
		return songID;
	}
	public void setsongID(T songID) {
		this.songID = songID;
	}
	
	//toString
	@Override
	public String toString() {
		return "Song [Song Name= " + songName + ", Artist=" + songArtist + ", Year=" + songYear + ", ID="+ songID + "]";
	}
	
	//Generic Method
	
}
