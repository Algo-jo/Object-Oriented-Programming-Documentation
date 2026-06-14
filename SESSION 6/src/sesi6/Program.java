package sesi6;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose = 0;
		do {
			printMenu(); // Menu with an option 
			try {
				System.out.print("Choose between (1-4): ");
				choose = sc.nextInt();
			}catch(Exception e) {
				sc.nextLine();
			}
			doAction(choose);
		}while(choose != 4);
		System.out.println("Bye, thanks!");
	}

	private static void doAction(int choose) {
		Scanner sc = new Scanner(System.in);
		switch(choose) {
		
		case 1: // add new object Artist
			System.out.print("Input Artist name: ");
			String name = sc.nextLine();
			Artist.artists.add(new Artist(name));
			break;

		case 2: // add music
			int flag = -1;
			for(int i = 0; i < Artist.artists.size(); i++) { // Iterate through artists arrayList and print their name
				if(i == 0) System.out.println("List of Artist:");
				Artist art = (Artist) Artist.artists.get(i);
				System.out.printf("%d. %s\n", i + 1, art.getName());
				flag = 1;
			}
			if(flag == -1) {
				System.out.println("Create an Artist First!");
				break;
			}
			System.out.print("Select Artist: ");
			String artistName = sc.nextLine();
			Artist selectedArtist = null;
			flag = 1;
			for (Object obj : Artist.artists) { // Iterate through artists arrayList
			    Artist a = (Artist) obj; 
//			    System.out.print(a.getName() + " " + artistName);
			    if (a.getName().equals(artistName)) {
			        selectedArtist = a;
			        break;
			    }   
			}
			if(selectedArtist == null) {
		    	System.out.printf("There's no Artist named %s\n", artistName);
		    	flag = -1;
		    }
			if(flag == -1) break; // Flag = -1 means selectedArtist is NULL
			System.out.print("Add title: ");
			String title = sc.nextLine();
			System.out.print("Add duration: ");
			int duration = sc.nextInt();
			
			Song song = new Song(title, duration); // create Object song and add to the artist
			song.setArtist(selectedArtist);
			selectedArtist.addSong(song);
			break;
			
		case 3: // show all artist and their musics
			int flags = -1, comma = -1, None = 1;
			for(int i = 0; i < Artist.artists.size(); i++) { // Iterates through artists
				None = -1;
				Artist art = (Artist) Artist.artists.get(i);
				System.out.printf("%d. %s Songs: ", i + 1, art.getName());
				
				for (Song s : art.getSongs()) { // From artists iterate through their every song
					if(comma == 1) System.out.print(", ");
					flags = 1; comma = 1;
		            System.out.printf("%s(%d)", s.getTitle(), s.getDuration());
		        }
				
				if(flags == -1) System.out.println("TBA..."); // If the artist has no song
				System.out.println();
			}
			if(None == 1) System.out.println("Please add an Artist from option 1"); // If artists arrayList is empty
			break;
		}
	}

	private static void printMenu() {
		System.out.println();
		System.out.println("1) Add Artist");
		System.out.println("2) Add Music and Add to Artist");
		System.out.println("3) Show Artist and related musics");
		System.out.println("4) Exit Program");
		
	}
}
