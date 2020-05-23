package ch02;

import java.util.Date;

public class Produk {
	String barcode;
	String nama;
	Date tanggalKaladuarsa;
	double harga;
	
	public String getBarcode() {
		return barcode;
	}
	
	public String getNama() {
		return nama;
	}
	
	Date getTanggalKaladuarsa() {
		return tanggalKaladuarsa;
	}
	
	double getHarga() {
		return harga;
	}
}