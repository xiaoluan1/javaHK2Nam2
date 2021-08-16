package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.*;

public class ProductEntity {
	List<NhaXuatBan> dsNhaXuatBans = new ArrayList<NhaXuatBan>();
	List<TacGia> dsTacGias = new ArrayList<TacGia>();
	List<Sach> dsSachs = new ArrayList<Sach>();
	Scanner in = new Scanner(System.in);

	public void nhapNhaXuatBan() {
		String ngayTL, tenNDD, tenNXB;
		int namTl;
		System.out.println("Nhap vao ngay thanh lap , ten nguoi dai dien, ten nha xuat ban");
		ngayTL = in.nextLine();
		tenNDD = in.nextLine();
		tenNXB = in.nextLine();
		System.out.println("Nhap vao nam thanh lap");
		namTl = Integer.parseInt(in.nextLine());
		NhaXuatBan nhaXuatBan = new NhaXuatBan(tenNXB, tenNDD, ngayTL, namTl);
		dsNhaXuatBans.add(nhaXuatBan);
	}

	public void nhapTacGia() {
		String butDanh, ngaySinh, ten;
		System.out.println("Nhap vao but danh ,ngay sinh ,ten");
		while (true) {
			butDanh = in.nextLine();
			boolean ok = true;
			for (int i = 0; i < dsTacGias.size(); i++) {
				if (dsTacGias.get(i).getButDanh().equalsIgnoreCase(butDanh)) {
					ok = false;
				}
			}
			if (ok == false) {
				System.out.println("nhap lai ten tac gia");
			} 
			else
				break;
			
		}
		ngaySinh = in.nextLine();
		ten = in.nextLine();
		TacGia tacGia = new TacGia(ten, butDanh, ngaySinh);
		dsTacGias.add(tacGia);
	}

	public void nhapSach() {
		String butDanh, nhaXB, tenSach;
		System.out.println("Nhap vao but danh,nha xuat ban,ten sach");
		butDanh = in.nextLine();
		nhaXB = in.nextLine();
		tenSach = in.nextLine();
		Sach sach = new Sach(butDanh, nhaXB, tenSach);
		dsSachs.add(sach);
	}

	public void xuatDanhSach() {
		System.out.println("Danh sach nha xuat ban");
		for (NhaXuatBan p : dsNhaXuatBans) {
			System.out.println(p.toString());
		}
		System.out.println("Danh sach tac gia");
		for (TacGia p : dsTacGias) {
			System.out.println(p.toString());
		}
		System.out.println("Danh sach sach");
		for (Sach p : dsSachs) {
			System.out.println(p.toString());
		}
	}

}
