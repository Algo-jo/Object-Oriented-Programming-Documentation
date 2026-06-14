package sesi6;

public class Song {
	public Song(String string, int i) {
		title = string;
		duration = i;
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	public Artist getArtist() {
		return artist;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	private String title;
	private int duration; // second
	private Artist artist; // Association to Artist
}
