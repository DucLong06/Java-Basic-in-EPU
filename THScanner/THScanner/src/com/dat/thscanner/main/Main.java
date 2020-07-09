package com.dat.thscanner.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<HocSinh> listHS = new ArrayList<HocSinh>();
		Scanner sc = new Scanner(System.in);
		int index = 1;
		for(;;) {
			System.out.println("nhập tên học sinh thứ :" + index);
			String hoTen = sc.nextLine();
			System.out.println("nhập tuổi học nh thứ " + index);
			String tuoi = sc.nextLine();
			System.out.println("bạn có nhập nữa hông  ? y/n");
			String nhap = sc.nextLine();
			HocSinh x = new HocSinh(hoTen, tuoi);
			listHS.add(x);
			if(nhap.equalsIgnoreCase("n")) {
				break;
			}
			index++;
		}
		System.out.println(listHS.toString());
		sc.close();
	}
}
