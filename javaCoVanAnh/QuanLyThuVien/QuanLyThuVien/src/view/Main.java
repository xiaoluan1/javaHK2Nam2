package view;
import java.util.Scanner;

import model.*;
public class Main {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = new ProductEntity();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println(" Phan mem quan ly sach ");
			System.out.println("1.nhap vao sach");
			System.out.println("2.nhap vao ten tac gia");
			System.out.println("3.nhap vao nha xuat ban");
			System.out.println("4.xem danh sach");
			System.out.println("Nhap lua chon cua minh");
			int temp = Integer.parseInt(in.nextLine());
			switch (temp) {
			case 1: {
				
				productEntity.nhapSach();
				break;
			}
			case 2:
				productEntity.nhapTacGia();
				break;
			case 3:
				productEntity.nhapNhaXuatBan();
				break;
			case 4:
				productEntity.xuatDanhSach();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + temp);
			}
		}

	}

}
