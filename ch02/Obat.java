package ch02;

import java.util.Date;

public class Obat {
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
	
	public Date getTanggalKaladuarsa() {
		return tanggalKaladuarsa;
	}
	
	public double getHarga() {
		return harga;
	}
}