import java.util.Scanner;
public class Belajar1{

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int bayar;

		System.out.print("MASUKKAN TOTAL BELANJA:  ");
		bayar = sc.nextInt();

		if (bayar >= 2000000){
			System.out.println("SELAMAT ANDA MENDAPAT KOMPOR GAS");
		} 
		else if (bayar >= 1000000){
			System.out.println("SELAMAT ANDA MENDAPAT TEFLON");
		} 
		else if (bayar >= 500000){
			System.out.println("SELAMAT ANDA MENDAPAT CENTONG");
		} 
		else {
			System.out.println("KUY BELANJA LAGI KUY");
		}
	}
}