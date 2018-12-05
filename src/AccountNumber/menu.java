package AccountNumber;
import java.util.Scanner;

public class menu extends core{
	public void menu() {
		MainMenu utama = new MainMenu();
		proses q = new proses();
		System.out.println("1. tes input");
		System.out.println("2. tes tampil");
		System.out.println("3. kembali");
		
		Scanner x = new Scanner(System.in);
		int pil = x.nextInt();
		if(pil == 1) {
			q.input();
		}else if(pil == 2){
			q.TampilkanData();
		}else {
			utama.MenuUtama();
		}
		
		
	}

}
