package AccountNumber;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import java.util.ArrayList;
import java.util.Arrays;

public class proses extends core{
	
	
	menu menu = new menu();
	Scanner input = new Scanner(System.in);
	public void input() {
		
		String norek,nama,alamat;
		int jml_data, a = 0;
			System.out.println("------- INPUT DATA -------");
			System.out.print("Entry your Account Number  :");
			norek = input.nextLine();
//			arr_data.add(new Scanner(System.in).nextLine());
			System.out.print("Entry your Name  :");
			nama = input.nextLine();
//			arr_data.add(new Scanner(System.in).nextLine());
			System.out.print("Entry your addresss : ");
//			arr_data.add(new Scanner(System.in).nextLine());
			alamat = input.nextLine();
			arr_data.add(new getData(norek,nama,alamat));
//		}
		menu.menu();
	}
	public void TampilkanData() {
		
		System.out.println("show customer data: ");
		System.out.println("=========================");
		for(getData data : arr_data) {
		
			System.out.println(data.getNorek()+"\t| "+data.getNama()+"\t| "+ data.getAddress());
//			System.out.println(data.getNama());
//			System.out.println(data.getNorek());
			System.out.println("");
		}
		menu.menu();

	}
	public void search() {
		
		ArrayList<getData> dt = new ArrayList<getData>(arr_data);
		int jum = 0;
		if(dt.isEmpty()) {
		System.out.println("data is empty");	
		}
		
		System.out.println("input you want to find :");
		String src = input.next();
		
		for (int i = 0; i < dt.size(); i++) {
				if (dt.get(i).getNorek().equals(src)) {
					jum++;
				}
			}
		if (jum > 0) {
			for (int i = 0; i < dt.size(); i++) {
				if (dt.get(i).getNorek().equals(src)) {
					System.out.println("Account Number\t= "+dt.get(i).getNorek());
					System.out.println("Name\t= "+dt.get(i).getNama());
					System.out.println("Address\t= "+dt.get(i).getAddress());
				}
			}
		}else {
			System.out.println("Data not found");
		}
//		String[] arr_data = {"saya","kamu","dia"};
		
		menu.menu();
	}
}
