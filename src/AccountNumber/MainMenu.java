package AccountNumber;
import java.util.Scanner;
public class MainMenu extends core{
	menu menu = new menu();
	public void MenuUtama() {
		MainMenu ini = new MainMenu();
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("|    Welcome In Bank-Root   |");
		System.out.println("-----------------------------");
		System.out.println("|     [1] Account Number    |");
		System.out.println("|     [0] Exit              |");
		System.out.println("-----------------------------");
		System.out.println("  enter your choice :");
		try {
			int a = input.nextInt();
			if (a == 1) {
				menu.menu();
			}else if( a == 0){
				System.exit(0);
			}else {
				System.out.println("input entered is not valid");
				System.exit(0);
			}
		}catch (Exception e) {
//			e.printStackTrace();
		}
		finally {
			System.out.println("");
            System.out.println("error, input with numbers");
            ini.MenuUtama();
            
        }
		
	}
	

}
