package AccountNumber;
import java.util.Scanner;
public class login {
	public void inilogin() {
		MainMenu menu = new MainMenu();
		login login = new login();
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated constructor stub
		System.out.println("Silahkan Login ");
		System.out.print("username : ");
		String username=input.nextLine();
		System.out.print("password : ");
		String password=input.nextLine();
		if (username.equals("saya") && password.equals("*****")) {
			menu.MenuUtama();
		}else {
			System.out.println("********************");
			System.out.println("fail try again !!!");
			System.out.println("********************");
			login.inilogin();
		}
	}
}
