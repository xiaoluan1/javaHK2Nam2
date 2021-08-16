package view;
import java.util.Scanner;

import model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DanhSach ds = new DanhSach();
		while(true) {
			System.out.println("PROGRAM MANAGEMENT VIHACALE");
			System.out.println("1.Nhap ds");
			System.out.println("2.Xem Danh sach");
			System.out.println("Moi ban nhap vao lua chon cua minh");
			int temp = Integer.parseInt(in.nextLine());
			switch (temp) {
			case 1: {
				boolean key = true;
				while(key) {
					System.out.println("---------Danh Sach Loai xe--------");
					System.out.println("1.Nhap vao xe may");
					System.out.println("2.Nhap vao xe tai");
					System.out.println("3.Nhap vao xe oto");
					System.out.println("4.exit");
					System.out.println("Nhap vao lua chon");
					int value = Integer.parseInt(in.nextLine());
					switch (value) {
					case 1: {
						ds.nhapXeMay();
						break;
					}
					case 2: {
						ds.nhapXeTai();
						break;
					}
					case 3: {
						ds.nhapOto();;
						break;
					}
					
					default:
						key = false;
						break;
					}
				}
				break;
				
			}
			case 2:
				
				ds.xuat();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + temp);
			}
		}

	}

}
