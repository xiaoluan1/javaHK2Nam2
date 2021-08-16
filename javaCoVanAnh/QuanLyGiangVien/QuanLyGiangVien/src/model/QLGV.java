package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import entity.*;

public class QLGV implements Product {
	List<GiangVien> ql = new ArrayList<GiangVien>();
	Scanner in = new Scanner(System.in);

	public double heSoLuong(String hocHam, String hocVi) {
		// TODO Auto-generated method stub
		double sum = 0d;
		if (hocHam.equals("dai hoc")) {
			sum = 1;
		}
		if (hocHam.equals("thac si")) {
			sum = 1.1;
		}
		if (hocHam.equals("tien si")) {
			sum = 1.2;
		}
		if (hocVi.equals("giao su")) {
			sum = sum + 0.2;
		}
		if (hocVi.equals("pho giao su")) {
			sum = sum + 0.1;
		}
		return sum;
	}
	public void output(GiangVien gv) {
		if(gv instanceof GiangVienThinhGiang) {
			System.out.println(((GiangVienThinhGiang)gv).toString());
		}
		if(gv instanceof GiangVienCoHuu) {
			System.out.println(((GiangVienCoHuu)gv).toString());
		}
	}

	private GiangVien inputGiangVien() {
		System.out.print("Nhap vao dia chi:");
		String diaChi = in.nextLine();
		System.out.print("Nhap vao dien thoai:");
		String dienThoai = in.nextLine();
		System.out.print("Nhap email");
		String email = in.nextLine();
		System.out.print("Hoc ham");
		String hocHam = in.nextLine();
		System.out.print("Hoc vi");
		String hocVi = in.nextLine();
		double heSoLuong = heSoLuong(hocHam, hocVi);
		String maGiangVien;
		while (true) {
			System.out.print("Ma giang vien:");
			maGiangVien = in.nextLine();
			if (maGiangVien.matches("^[A-Z]{2,3}\\d{3,4}$")) {
				break;
			} else {
				System.out.println("Nhap lai !!");
			}
		}
		System.out.print("So gio giang day:");
		double soGioGiangDay = Double.parseDouble(in.nextLine());
		System.out.print("Ten giang vien :");
		String tenGiangVien = in.nextLine();
		return new GiangVien(maGiangVien, tenGiangVien, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay,
				heSoLuong);
	}

	@Override
	public void NhapCoHuu() {
		// TODO Auto-generated method stub
		GiangVien gv = inputGiangVien();
		System.out.print("Nhap vao luong cung:");
		double luongCung = Double.parseDouble(in.nextLine());
		System.out.println("Nhap vao so h quy dinh:");
		double soGioQuyDinhChung = Double.parseDouble(in.nextLine());
		GiangVienCoHuu coHuu = new GiangVienCoHuu(gv.getMaGiangVien(), gv.getTenGiangVien(), gv.getEmail(),
				gv.getHocHam(), gv.getHocVi(), gv.getDiaChi(), gv.getDienThoai(), gv.getSoGioGiangDay(),
				gv.getHeSoLuong(), luongCung, soGioQuyDinhChung);
		ql.add(coHuu);
	}

	@Override
	public void NhapThingGiang() {
		// TODO Auto-generated method stub
		GiangVien gv = inputGiangVien();
		System.out.print("Nhap co quan lam viec:");
		String coQuanLamViec = in.nextLine();
		GiangVienThinhGiang giangVienThinhGiang = new GiangVienThinhGiang(gv.getMaGiangVien(), gv.getTenGiangVien(), gv.getEmail(), gv.getHocHam(),
				gv.getHocVi(), gv.getDiaChi(), gv.getDienThoai(), gv.getSoGioGiangDay(), gv.getHeSoLuong(), coQuanLamViec);
		ql.add(giangVienThinhGiang);

	}

	@Override
	public void printDsGiangVien() {
		// TODO Auto-generated method stub
		for(GiangVien i:ql) {
			output(i);
		}
		

	}

	@Override
	public void XoaGiangVienTheoMa() {
		System.out.println("Nhap vao ma giang vien can sua:");
		String maGV = in.nextLine();
		// TODO Auto-generated method stub
		Iterator<GiangVien> gv = ql.iterator();
		while(gv.hasNext()) {
			GiangVien s = gv.next();
			if(s.getMaGiangVien().equalsIgnoreCase(maGV)) {
				gv.remove();
			}
		}

	}

	@Override
	public void SuaGiangVienTheoMa() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao ma giang cua giang vien can sua");
		String maGiangVienCanSua = in.nextLine();
		for(GiangVien i :ql) {
			System.out.println("Nhap vao thong tin ms:");
			System.out.print("Nhap vao dia chi:");
			String diaChi = in.nextLine();
			i.setDiaChi(diaChi);
			System.out.print("Nhap vao dien thoai:");
			String dienThoai = in.nextLine();
			i.setDienThoai(dienThoai);
			System.out.print("Nhap email");
			String email = in.nextLine();
			i.setEmail(email);
			System.out.print("Hoc ham");
			String hocHam = in.nextLine();
			i.setHocHam(hocHam);
			System.out.print("Hoc vi");
			String hocVi = in.nextLine();
			i.setHocVi(hocVi);
			double heSoLuong = heSoLuong(hocHam, hocVi);
			i.setHeSoLuong(heSoLuong);
			String maGiangVien ;	
			while (true) {
				System.out.print("Ma giang vien:");
				maGiangVien = in.nextLine();
				if (maGiangVien.matches("^[A-Z]{2,3}\\d{3,4}$")) {
					break;
				} else {
					System.out.println("Nhap lai !!");
				}
			}
			i.setMaGiangVien(maGiangVien);
			System.out.print("So gio giang day:");
			double soGioGiangDay = Double.parseDouble(in.nextLine());
			i.setSoGioGiangDay(soGioGiangDay);
			System.out.print("Ten giang vien :");
			String tenGiangVien = in.nextLine();
			i.setTenGiangVien(tenGiangVien);
			if(i instanceof GiangVienCoHuu) {
				System.out.println("Luong cung:");
				double luongCung = Double.parseDouble(in.nextLine());
				((GiangVienCoHuu) i).setLuongCung(luongCung);
				System.out.println("So gio quy dinh:");
				double soGioQuyDinhChung = Double.parseDouble(in.nextLine());
				((GiangVienCoHuu) i).setSoGioQuyDinhChung(soGioQuyDinhChung);
				
			}
			else if (i instanceof GiangVienThinhGiang) {
				System.out.println("Co so lam viec:");
				String coQuanLamViec = in.nextLine();
				((GiangVienThinhGiang) i).setCoQuanLamViec(coQuanLamViec);
			}
		}

	}

	@Override
	public void PrindDSGiangVienCoHuu() {
		// TODO Auto-generated method stub
		for(GiangVien i:ql) {
			output(i);
		}

	}

	@Override
	public void PrindDSGiangVienThinhGiang() {
		// TODO Auto-generated method stub
		for(GiangVien i:ql) {
			output(i);
		}

	}

	@Override
	public void searchGiangVienGanDungTheoMA() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao ma can tim kiem");
		String maTk = in.nextLine();
		for(GiangVien i:ql) {
			if(i.getMaGiangVien().contains(maTk)) {
				output(i);
			}
			else {
				System.out.println("Khong ton tai");
			}
		}

	}

	@Override
	public void sortGiangVienTheoLuong() {
		// TODO Auto-generated method stub
		Collections.sort(ql, new Comparator<GiangVien>() {

			@Override
			public int compare(GiangVien o1, GiangVien o2) {
				// TODO Auto-generated method stub
				if(o1.getHeSoLuong() < o2.getHeSoLuong())
					return -1;
				else if(o1.getHeSoLuong() == o2.getHeSoLuong())
					return 0;
				else return 1;
			}
		});

	}

	@Override
	public void tinhTongLuongandLuongTrungBinh() {
		// TODO Auto-generated method stub
		double sum = 0d;
		
		for(GiangVien i:ql) {
			if(i instanceof GiangVienCoHuu) {
				sum+=((GiangVienCoHuu) i).getLuongCung()+(i.getSoGioGiangDay()-((GiangVienCoHuu)i).getSoGioQuyDinhChung())*50000;
				sum=sum*i.getHeSoLuong();
			}
			if(i instanceof GiangVienThinhGiang) {
				sum+=i.getSoGioGiangDay()*200000*i.getHeSoLuong();
			}
		}
		System.out.println("Tong so tien luong:"+ sum);
		System.out.println("Luong Trung binh:"+sum/ql.size());

	}

	@Override
	public void timGiangVienCoLuongCaoNhat() {
		// TODO Auto-generated method stub
		Optional<GiangVien>max = ql.stream().collect(Collectors.maxBy(Comparator.comparing(GiangVien :: getHeSoLuong)));
		System.out.println(max.get());

	}

}
