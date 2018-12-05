package AccountNumber;
import java.util.Scanner;
public class MainMenu extends core{
	menu menu = new menu();
	public void MenuUtama() {
		Scanner input = new Scanner(System.in);
		System.out.println("[1] Account Number");
		System.out.println("[0] Exit");
		int a = input.nextInt();
		if (a == 1) {
			menu.menu();
		}else {
			System.exit(0);
		}
		
	}

}
