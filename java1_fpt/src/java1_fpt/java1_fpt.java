package java1_fpt;

import java.util.Scanner;
import java.math.*;

public class java1_fpt {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Bài 1:");
		System.out.print("Họ và tên :");
		String hoTen =scanner.nextLine();
		System.out.printf("Nhập điểm trung bình :");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %f điểm", hoTen,diemTB);
	
		System.out.println("Bài 2:");
		System.out.printf("nhập chiều dài :");
		double chieuDai = scanner.nextDouble();
		System.out.printf("nhập chiều rộng :");
		double chieuRong = scanner.nextDouble();
		double dienTich = chieuDai*chieuRong;
		System.out.printf("diện tích là  : %f ",chieuDai*chieuRong);
		System.out.printf("chu vi là %f :", (chieuDai+chieuRong)*2);
		double canhNho=Math.min(chieuDai, chieuRong);
		System.out.printf("cạnh nhỏ nhất là  : %f ",canhNho);
		
		System.out.println("Bài 3:");
		System.out.print("nhập cạnh: ");
		double canh = scanner.nextDouble();
		double theTich=Math.pow(canh,3);
		System.out.printf("the tich cua khoi chu nhat: %f",theTich);
		
		System.out.println("Bài 4:");
		System.out.print("Bài a:");
		double a = scanner.nextDouble();
		System.out.print("Bài b:");
		double b = scanner.nextDouble();
		System.out.print("Bài c:");
		double c = scanner.nextDouble();
		double delta = Math.pow(b,2)-4*a*c;
		System.out.printf("delta=%f",delta);
		
	}

}
