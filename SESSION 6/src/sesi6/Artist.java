package sesi6;

import java.util.ArrayList;

public class Artist {
	private String name;
	private ArrayList songs = new ArrayList();
	public static final ArrayList artists = new ArrayList();
		
	public Artist(String name) {
		this.name = name;
	}
	public void addSong(Song newSong) {
		this.songs.add(newSong);
	}
	public Song getLatestSong() throws Exception{
		return (Song) this.songs.get(this.songs.size()-1);
	}
	
	public ArrayList<Song> getSongs(){
		return songs;
	}
	
	public String getName() {
		return name;
	}
}
