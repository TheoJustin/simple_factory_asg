package client;

import java.util.Scanner;

import factory.BusFactory;
import factory.KeretaFactory;
import factory.PesawatFactory;
import model.Kendaraan;

public class Main {
	

	public Main() {
		// TODO Auto-generated constructor stub
		
		Scanner scan = new Scanner(System.in);
		BusFactory busFactory = new BusFactory();
		KeretaFactory keretaFactory = new KeretaFactory();
		PesawatFactory pesawatFactory = new PesawatFactory();
		
		int x = -1;
		
		do {
			System.out.println("Hello, selamat datang di pemesanan tiket :)");
			System.out.println("Made by : Theo Justin, NIM : 2602095915");
			System.out.println("============================================");
			System.out.println("Silahkan pilih jenis transportasi");
			System.out.println("1. Bus");
			System.out.println("2. Kereta");
			System.out.println("3. Pesawat");
			System.out.println("4. Cancel");
			
			Kendaraan kendaraan;
			x = scan.nextInt(); scan.nextLine();
			switch (x) {
			case 1:
				kendaraan = busFactory.buatKendaraan();
				System.out.println("Anda akan dicharge dengan harga kendaraan : " + kendaraan.returnHargaTiket());
				break;
			case 2:
				kendaraan = keretaFactory.buatKendaraan();
				System.out.println("Anda akan dicharge dengan harga kendaraan : " + kendaraan.returnHargaTiket());
				break;
			case 3:
				kendaraan = pesawatFactory.buatKendaraan();
				System.out.println("Anda akan dicharge dengan harga kendaraan : " + kendaraan.returnHargaTiket());
				break;

			default:
				break;
			}
			
		} while (x != 4);
		
		System.out.println("Terima kasih!");
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
