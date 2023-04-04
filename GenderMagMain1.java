package genderMag2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class GenderMagMain1<T> extends Song<T> {

	public static void main(String [] args) throws FileNotFoundException {
		
		File songPath = new File("/Users/rockstar./Desktop/Gendermag2.txt");
		Scanner reader = new Scanner(songPath);
		
		//3 Song Obbjects
		Song s1 = new Song("Fate of The Kingdoms","Ramin Djawadi",2022,386910);
		Song s2 = new Song("Highway to Hell","AC/DC",1979,286410);
		Song s3 = new Song("All Along the Watchtower","Jimi Hendrix",1968,312310);
		Song s4 = new Song("Sweet Child O' Mine","Guns N' Roses",1987,396510);
		
		//toString
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println();
		
		//LinkedList
		LinkedList<Song> musicList = new LinkedList<>();
		musicList.add(s1);
		musicList.add(s2);
		musicList.add(s3);
		musicList.add(s4);
		
		//Using displayAllSongs method
		
		displayAllSongs(musicList);
		
		//Using readSongs method
		readSongs(songPath);
		
		File songsFile = new File("/Users/rockstar./Desktop/Gendermag2.txt");
		
		Scanner readSongFile = new Scanner(songsFile);
		
		System.out.println("Enter Song Name: ");
		Scanner nameFinder = new Scanner(System.in);
		String nameSong = nameFinder.nextLine();
		
		while(readSongFile.hasNextLine()) {
			String section = readSongFile.nextLine();
			String[] point = section.split(",");
			String songName = point[0];
			String songArtist = point[1];
			String songYear = point[2];
			String songID = point[3];
			
			if(songName.equalsIgnoreCase(songName)) {
				System.out.println("Song name: " + songName);
				System.out.println("Song artist: " + songArtist);
				System.out.println("Song year: " + songYear);
				System.out.println("Song id: " + songID);
			}
		}
		
		
		System.out.println("Enter a Year or Song Title: ");
		Scanner YearTitle = new Scanner(System.in);
		String yearOrName = YearTitle.nextLine();
		
		Scanner search = new Scanner(songPath);
		while (search.hasNextLine()) {
			String line = search.nextLine();
			String[]  songInfo = line.split(",");
			String songName = songInfo[0];
			String songArtist = songInfo[1];
			String songYear = songInfo[2];
			String songID = songInfo[3];
			
			if(songYear.contentEquals(yearOrName) || songName.equalsIgnoreCase(yearOrName)) {
				System.out.println("Song name: " + songName);
				System.out.println("Song artist: " + songArtist);
				System.out.println("Song year: " + songYear);
				System.out.println("Song id: " + songID);
			}
		}

	}
	
	// displayAllSongs generic method will only print first 3.
	public static<T> void displayAllSongs(LinkedList<T> musicList) {
		for(int x = 0; x <3; x++) {
			System.out.println(musicList.get(x));
		}
	}
	//readSongs Methods  / Array 
	public static<T> void readSongs(File Songs) throws FileNotFoundException {
		
			List<T> listOfSongs = new ArrayList<>();
			
			BufferedReader br = new BufferedReader(new FileReader(Songs));
			try {
				String line = br.readLine();
				while(line != null) {
					listOfSongs.add((T) line);
					line = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<T> songArray =(ArrayList<T>) listOfSongs;
			
			for(T str:songArray) {
				System.out.println(str);

			}
		}
	
	//readSongs Linked List Method
	public static <T> void readSongs(String fileName) throws FileNotFoundException {
		LinkedList<T> listOfSongs = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		try {
			String line = br.readLine();
			while(line != null) {
				listOfSongs.add((T) line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LinkedList<T> songLinkedList =listOfSongs;
		
		for(T str:songLinkedList) {
			System.out.println(str);
		}
	}

	
	
	//searchSongs Methods
	public static void searchSongs(int year, String songName, Song[] songArray) {
		ArrayList<Integer> SearchYear = new ArrayList<Integer>();
		
		for(Song songTwo : songArray) {
			String yearTwo = (String)songTwo.songYear;
			System.out.println(yearTwo);
		} 
		
		for(Song song1 : songArray) {
			String title = (String)song1.songName;
			System.out.println(title);
			
		}
	}

	
	
	//songComparators Methods

class NameComparator implements Comparator<Song>{
	public int compare(Song song1, Song song2) {
		return ((String) song1.getsongName()).compareTo((String)song2.getsongName());
		
	}


}

class NameYearComparator implements Comparator<Song>{
	public int compare(Song song1, Song song2) {
		return((String) song1.getsongYear()).compareTo((String)song2.getsongYear());
	}
}}

