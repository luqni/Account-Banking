package AccountNumber;
import java.util.Scanner;

public class menu extends core{
	public void menu() {
		menu ini = new menu();
		MainMenu utama = new MainMenu();
		proses search = new proses();
		proses q = new proses();
		System.out.println("-------------------");
		System.out.println("| Account Number  |");
		System.out.println("-------------------");
		System.out.println("|  [1] Input Data |");
		System.out.println("|  [2] View Data  |");
		System.out.println("|  [3] Search     |");
		System.out.println("|  [4] Back       |");
		System.out.println("enter your choice : ");
		try {
			Scanner x = new Scanner(System.in);
			int pil = x.nextInt();
			if(pil == 1) {
				q.input();
			}else if(pil == 2){
				q.TampilkanData();
			}else if(pil == 3) {
				search.search();
			}else {
				System.out.println("input entered is not valid");
				utama.MenuUtama();
			}
		}catch (Exception e) {
//		System.out.println("");
	     System.out.println("error, input with numbers");
	     ini.menu();
		}
		
	}

}
