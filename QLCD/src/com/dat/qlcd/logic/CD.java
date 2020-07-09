package com.dat.qlcd.logic;

public class CD {
	private String ma,tuaDe,caSi,soBH,giaThanh;
	public CD(String ma, String tuaDe, String caSi, String soBH, String giaThanh) {
			
		this.ma = ma;
		this.tuaDe = tuaDe;
		this.caSi = caSi;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}
	
	public static CD tao(String ma, String tuaDe, String caSi, String soBH, String giaThanh) {
		try {
			if(ma == "" || tuaDe == "" || caSi == "" || Integer.parseInt(soBH) == 0 ||Float.parseFloat(giaThanh) == 0) {
				return null;
			}
		} catch (NumberFormatException e) {
			return null;
		}
		CD cd = new CD(ma, tuaDe, caSi, soBH, giaThanh);
		return cd;
	}
	@Override
	public String toString() {
		return "Mã : "+ ma + "- Tựa đề :"+tuaDe + "- Ca sĩ : " + caSi + "- Số bài hát :" + soBH + " - Giá thành : "+ giaThanh;
	}
	@Override
	public boolean equals(Object obj) {
		CD cd = (CD )obj;
		if(cd.ma.equals(this.ma)) {
			return true;
		}
		return false;
	}

	public String getMa() {
		return ma;
	}

	public String getTuaDe() {
		return tuaDe;
	}

	public String getCaSi() {
		return caSi;
	}

	public String getSoBH() {
		return soBH;
	}

	public String getGiaThanh() {
		return giaThanh;
	}
	
}
