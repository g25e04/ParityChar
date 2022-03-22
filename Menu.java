package summer021;

import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	private int choice;
	
	public Menu() {
		// TODO Auto-generated constructor stub
		while(true) {
			setChoice(sc.nextInt());
			MenuFunction(getChoice());
		}
	}

	
	public int getChoice() {
		return choice;
	}
	
	public void setChoice(int choice) {
		this.choice=choice;
	}
	
	public void MenuFunction(int choice) {
		switch (choice) {
		case 1:
			System.out.println("請輸入2字串:");
			CatchString CS = new CatchString(sc1.nextLine(),sc1.nextLine());
			System.out.println(CS.toString());
			System.out.println("1.字串比對 2.結束程式");
			break;
		case 2:
			System.exit(0);
			break;
		}
	}
}
