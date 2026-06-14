import java.util.Scanner;

public class main2 {

	public main2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int menuChosen = 0;
		do {
			showMenuText();
			try {
				menuChosen = input.nextInt();
				if(menuChosen < 1 || menuChosen > 3) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Input must be a number");
				input.nextLine();
			}
			doAction(menuChosen);
		}while(menuChosen != 3);
		
		System.out.println("Bye!");
	}
	
	private static void doAction(int menuChosen) {
		// TODO Auto-generated method stub
		switch(menuChosen) {
			case 1:
				System.out.print("Get name operation..");
				break;
			case 2:
				System.out.println();
		}
	}

	private static void showMenuText() {
		// TODO Auto-generated method stub
		System.out.println("1. Input Name");
		System.out.println("2. Print Name");
		System.out.println("3. Exit Program");
		System.out.print("Choose: ");
	}

	static void temp() {
		
//		int randValue = 10 + (int) Math.random() + 5;
//		System.out.println(Math.random());
//		
//		int intPrimitive = 100;
//		Integer intObj = new Integer("100");
//		System.out.println("Max value of Int:" + intObj.MAX_VALUE);
//		Integer intObj = input.nextInt();
//		System.out.println(intPrimitive == intObj);
		
//		String word1 = "helo", word2 = "helo";
//		System.out.println(word1.equals(word2));
//		System.out.println(word1.compareTo(word2));
//		System.out.println(word1.length());
//		String phoneNumber = input.next();
//		System.out.printf("Please input your phone number: ");
//
//		System.out.print("Your phone number is ");
//		for(int i = 0; i < phoneNumber.length(); i++) {
//			if(i >= phoneNumber.length() - 3){
//				System.out.print(phoneNumber.charAt(i));
//			}
//			else {
//				System.out.print("*");
//			}
//		}
	}
}
