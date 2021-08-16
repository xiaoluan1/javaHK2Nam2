package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entity.*;

public class PhoneBook implements Product {
	private List<PhoneNumber> list = new ArrayList<PhoneNumber>();
	private Map<String, Integer>map = new HashMap<String,Integer>();
	Scanner in = new Scanner(System.in);

	private PhoneNumber inputPhoneNumber() {
		String NV, maVung;
		while (true) {
			System.out.print("Ma vung:");
			maVung = in.nextLine();
			System.out.print("Noi vung:");
			NV = in.nextLine();
			if (maVung.matches("^\\d{3,4}$") && NV.matches("^[0-9]{7,8}")) {

				break;
			} else {
				System.out.println("Nhap lai");
			}
		}
		return new PhoneNumber(NV, maVung);
	}

	@Override
	public void addPhoneNumber() {
		// TODO Auto-generated method stub
		PhoneNumber phoneNumber = inputPhoneNumber();
		String maQuocGia;

		while (true) {
			System.out.println("Nhap ma quoc gia:");
			maQuocGia = in.nextLine();
			if (maQuocGia.matches("^\\d{2}$")) {
				break;
			} else
				System.out.println("Nhap lai");
		}
		IntlPhoneNumber e = new IntlPhoneNumber(phoneNumber.getNV(), phoneNumber.getMaVung().substring(1), maQuocGia);
		list.add(e);
		if(map.get(phoneNumber.getMaVung())==null) {
			map.put(phoneNumber.getMaVung(), 1);
		}
		else {
			map.put(phoneNumber.getMaVung(), map.get(phoneNumber.getMaVung())+1);
		}

	}

	@Override
	public void searchMaVung() {
		// TODO Auto-generated method stub
		System.out.print("Nhap vao ma vung can tim kiem:");
		String MaVung = in.nextLine();
		for(PhoneNumber i : list) {
			if(i.getMaVung().equals(MaVung)) {
				System.out.println("Noi vung :" + i.getMaVung() + "-" + i.getNV());
			}
			else if(i.getMaVung().equals(MaVung.substring(1))){
				System.out.println(
						"Quoc te:" + ((IntlPhoneNumber) i).getMaQuocGia() + "-" + i.getMaVung() + "-" + i.getNV());
				
			}
		}

	}

	@Override
	public void listNumber() {
		// TODO Auto-generated method stub
		for (PhoneNumber i : list) {
			if (i instanceof IntlPhoneNumber) {
				System.out.println(
						"Quoc te:" + ((IntlPhoneNumber) i).getMaQuocGia() + "-" + i.getMaVung() + "-" + i.getNV());
			} else
				System.out.println("Noi vung :" + i.getMaVung() + "-" + i.getNV());
		}

	}

	@Override
	public void SumNumberOfVung() {
		// TODO Auto-generated method stub
		Set<String> set = map.keySet();
		for(String i:set) {
			System.out.println(i+":"+map.get(i));
		}
		

	}

	@Override
	public void searchDuoi() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao duoi sdt");
		String duoi = in.nextLine();
		for(PhoneNumber i :list) {
			if(i.getNV().contains(duoi)) {
				if(i instanceof IntlPhoneNumber) {
					System.out.println(
							"QuocTE:" + ((IntlPhoneNumber) i).getMaQuocGia() + "-" + i.getMaVung() + "-" + i.getNV());
				}
				else {
					System.out.println("Noi vung :" + i.getMaVung() + "-" + i.getNV());
				}
			}
		}

	}

	@Override
	public void sortNumber() {
		// TODO Auto-generated method stub
		Collections.sort(list, new Comparator<PhoneNumber>() {

			@Override
			public int compare(PhoneNumber o1, PhoneNumber o2) {
				// TODO Auto-generated method stub
				return o1.getMaVung().compareTo(o2.getMaVung());
			}
		});;
	}

	@Override
	public void addPhoneNumberin() {
		// TODO Auto-generated method stub
		PhoneNumber phoneNumber = inputPhoneNumber();
		list.add(phoneNumber);
		if(map.get(phoneNumber.getMaVung())==null) {
			map.put(phoneNumber.getMaVung(), 1);
		}
		else {
			map.put(phoneNumber.getMaVung(), map.get(phoneNumber.getMaVung())+1);
		}

	}

	@Override
	public void listNumberin() {
		// TODO Auto-generated method stub
		for(PhoneNumber i:list) {
			if(i instanceof IntlPhoneNumber) {
				continue;
			}
			else
				System.out.println(i.getMaVung()+"-"+i.getNV());
		}

	}

	@Override
	public void listNumberout() {
		// TODO Auto-generated method stub
		for (PhoneNumber i : list) {
			if (i instanceof IntlPhoneNumber) {
				System.out.println(
						"QuocTE:" + ((IntlPhoneNumber) i).getMaQuocGia() + "-" + i.getMaVung() + "-" + i.getNV());
			}

		}

	}

}
