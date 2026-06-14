package midexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	static ArrayList database = new ArrayList();
	public static void main(String[] args) {
		initDatabase();
		menu();
	}
	private static void menu() {
		Scanner sc = new Scanner(System.in);
		int inputOpt = 0;
		do {
			printMenu();
			inputOpt = sc.nextInt();
			doAction(inputOpt);
		} while (inputOpt != 3);
		System.out.println("Thanks bye.");
	}
	private static void doAction(int inputOpt) {
		if (inputOpt == 1) {
			inputNewVisit();
		} else if (inputOpt == 2) {
			
		}
	}
	private static void inputNewVisit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Visitor ID: ");
		String vid = sc.next();
		Visitor v = findVisitor(vid);
		if (v == null) {
			System.out.println("Visitor ID not found.");
			return;
		} 
		System.out.print("Input day[1-7]:");
		int day = sc.nextInt();
		try {
			int price = 0;
			if (day >= 1 && day <= 4) {
				price = 10;
			} else if (day >= 5 && day <= 7) {
				price = 20;
			} 
			if (price > 0) { 
				v.deductEmoney(price);
				v.addVisit(day);
//				if (v instanceof Member) {
//					((Member) v).addRewardPoint(1);
//				}
				System.out.println("Welcome " + v.visitorName + "\n\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static Visitor findVisitor(String vid) {
		for (int i=0; i < database.size(); i++) {
			Visitor v = (Visitor) database.get(i);
			if (v.visitorCode.equals(vid)) {
				return v;
			}
		}
		return null;
	}
	private static void printMenu() {
		System.out.println("1. Input New Visit");
		System.out.println("2. View Visitor Details");
		System.out.println("3. Exit");
		System.out.print("Choose: ");
	}
	static void initDatabase() {
		database.add(new Visitor("c1", "Andi", 30));
		database.add(new Member("c2", "Anto", 20));
		database.add(new Member("c3", "Meli", 30));
		database.add(new Member("c4", "Bobby", 40));
	}

}
