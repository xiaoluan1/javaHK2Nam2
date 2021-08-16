package view;
import java.util.Scanner;

import model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		QLGV ql = new QLGV();
		while(true) {
			System.out.println("-----Quan ly giang vien -----");
			System.out.println("1.Nhap vao giang vien co huu");
			System.out.println("2.nhap vao giang vien thinh giang");
			System.out.println("3.In danh sach giang vien");
			System.out.println("4.Xoa theo ma");
			System.out.println("5.sua giang vien theo ma");
			System.out.println("6.ds giang vien co huu");
			System.out.println("7.danh sasch giang vien thinh giang");
			System.out.println("8.Tim kiem gan dung giang vien theo ma");
			System.out.println("9.Sap xep giang vien theo he so luong");
			
			System.out.println("Moi ban nhap vao lua chon cua minh");
			int temp = Integer.parseInt(in.nextLine());
			switch (temp) {
			case 1: {
				
				System.out.println("Ban chon 1");
				ql.NhapCoHuu();
				break;
			}
			case 2:
				System.out.println("Ban chon 2");
				ql.NhapThingGiang();
				break;
			case 3:
				System.out.println("Ban chon 3");
				ql.printDsGiangVien();
				break;
			case 4:
				System.out.println("Ban chon 4");
				ql.XoaGiangVienTheoMa();
				break;
			case 5:
				System.out.println("Ban da chon 5");
				ql.SuaGiangVienTheoMa();
				break;
			case 6:
				System.out.println("Ban da chon 6");
				ql.PrindDSGiangVienCoHuu();
				break;
			case 7:
				System.out.println("Ban da chon 7:");
				ql.PrindDSGiangVienThinhGiang();
				break;
			case 8:
				System.out.println("Ban da chon 8");
				ql.searchGiangVienGanDungTheoMA();
				break;
			case 9:
				System.out.println("Ban da chon 9");
				ql.sortGiangVienTheoLuong();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + temp);
			}
		}

	}

}
