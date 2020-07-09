package com.dat.thscanner.main;

public class HocSinh {
	private String ten;
	private String tuoi;
	public HocSinh(String ten, String tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
	@Override
	public String toString() {
		return "Tên : "+ten +"\nTuổi :"+tuoi;
	}
}
