package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Oto;
import entity.PTGT;
import entity.XeMay;
import entity.*;

public class DanhSach implements PhuongThuc {
	private List<PTGT> DanhSach = new ArrayList<>();
	Scanner in = new Scanner(System.in);

	@Override
	public PTGT nhapPTGT() {
		String hang, mau;
		int nam;
		double gia;
		System.out.println("nhap hang");
		hang = in.nextLine();
		System.out.println("nhap mau");
		mau = in.nextLine();
		System.out.println("nhap gia");
		gia = Double.parseDouble(in.nextLine());
		System.out.println("Nhap nam sx");
		nam = Integer.parseInt(in.nextLine());
		return new PTGT(gia, hang, mau, nam);

	}

	@Override
	public void nhapXeMay() {
		// TODO Auto-generated method stub
		PTGT p = nhapPTGT();
		System.out.println("Nhap cong xuat xe may");
		double congSuat = Double.parseDouble(in.nextLine());
		XeMay xemay = new XeMay(p.getGia(), p.getHang(), p.getMau(), p.getNam(), congSuat);
		DanhSach.add(xemay);
	}

	@Override
	public void nhapOto() {
		PTGT p = nhapPTGT();
		System.out.println("Nhap kieu oto");
		String kieu = in.nextLine();
		System.out.println("Nhap vao so cho");
		int soCho = Integer.parseInt(in.nextLine());
		Oto oto = new Oto(p.getGia(), p.getHang(), p.getMau(), p.getNam(), kieu, soCho);
		DanhSach.add(oto);

	}

	@Override
	public void nhapXeTai() {
		// TODO Auto-generated method stub
		PTGT p = nhapPTGT();

		System.out.println("Nhap vao trong tai");
		double trongTai = Double.parseDouble(in.nextLine());
		XeTai xetai = new XeTai(p.getGia(), p.getHang(), p.getMau(), p.getNam(), trongTai);
		DanhSach.add(xetai);

	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("------------Danh sach------------------");
		for (PTGT p : DanhSach) {
			System.out.println(p.toString());
		}

	}

}
