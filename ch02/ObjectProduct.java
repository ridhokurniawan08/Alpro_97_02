package ch02;

import java.util.Date;

public class ObjectProduct {
	public static void main(String[] args) {
		Product x1 = new Product();
		x1.barcode = "4233322223":
		x1.nama = "Pepsident";
		x1.tanggalKaladuarsa = new Date(2021,7,2);
		x1.harga = "8900";
		
		Product x2 = new Product();
		x1.barcode = "5122211121":
		x1.nama = "Katkit";
		x1.tanggalKaladuarsa = new Date(2021,1,21);
		x1.harga = "14500";
		
		System.out.println(x1.nama + " (" + x1.barcode + ")");
		System.out.println("Harga: Rp" + x1.harga);
		System.out.println("Exp: " + x1.tanggalKaladuarsa.toString());
		
		System.out.println("======================");
		
		System.out.println(x2.nama + " (" + x2.barcode + ")");
		System.out.println("Harga: Rp" + x2.harga);
		System.out.println("Exp: " + x2.tanggalKaladuarsa.toString());
	}
}
		
		
		
		
		