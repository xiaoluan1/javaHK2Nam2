package view;

import java.util.Scanner;

import model.PhoneBook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phoneBook = new PhoneBook();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("MANAGER PHONE NUMBER");
			System.out.println("1.Nhap so dien thoat trong nuoc");
			System.out.println("2.Nhap so dien thoai quoc te");
			System.out.println("3.Tim kiem so dien thoai theo ma vung");
			System.out.println("4.liet ke so dt trong nuoc");
			System.out.println("5.liet ke so dt quoc te");
			System.out.println("6.liet ke so dt ");
			System.out.println("7.tinh tong so dien thoai theo tung vung");
			System.out.println("8.tim kiem theo duoi sdt");
			System.out.println("9.xap xep so dien thoai");
			System.out.println("Moi ban nhap vao lua chon cua minh");
			int t = Integer.parseInt(in.nextLine());
			switch (t) {
			case 1: {
				System.out.println("Nhap so dt trong nuoc");
				phoneBook.addPhoneNumberin();
				break;
			}
			case 2:
				System.out.println("Nhap so dien thoai quoc te");
				phoneBook.addPhoneNumber();
				break;
			case 3:
				phoneBook.searchMaVung();
				break;
			case 4:
				System.out.println("List Number In Country");
				phoneBook.listNumberin();
				break;

			case 5:
				System.out.println("List Number Inter");
				phoneBook.listNumberout();
				break;
			case 6:
				System.out.println("List Number");
				phoneBook.listNumber();
				break;
			case 7:
				System.out.println("List number with special country");
				phoneBook.SumNumberOfVung();
				break;
			case 8:
				phoneBook.searchDuoi();
				break;
			case 9:
				phoneBook.sortNumber();
				break;
			default:
				System.out.println("Nhap dung voi yeu cau:");
			}
		}

	}

}
