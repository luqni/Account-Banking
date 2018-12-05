package AccountNumber;

import java.util.Collections;
import java.util.Scanner;

public class proses extends core{
	core object = new core();
	menu menu = new menu();
	public void input() {
		
		int jml_data, a = 0;

			System.out.print("Nomor Rekening  " +(a+1)+" :");
			arr_data.add(new Scanner(System.in).nextLine());
			System.out.print("Masukkan Nama  " +(a+1)+" :");
			arr_data.add(new Scanner(System.in).nextLine());
			System.out.print("Alamat " +(a+1)+" :");
			arr_data.add(new Scanner(System.in).nextLine());
//		}
		menu.menu();
	}
	public void TampilkanData() {
		
		System.out.println("Tampilkan Data Nasabah: ");
		System.out.println("=========================");
		for(Object o : arr_data) {			
			System.out.println(" " + o);			
		}
		menu.menu();

	}
}
