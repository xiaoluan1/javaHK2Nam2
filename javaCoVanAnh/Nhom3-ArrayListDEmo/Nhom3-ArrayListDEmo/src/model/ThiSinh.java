/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    private String sbd;
    private String hoten;
    private double d1,d2,d3;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String hoten, 
            double d1, double d2, double d3) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getD3() {
        return d3;
    }

    public void setD3(double d3) {
        this.d3 = d3;
    }
    public double tongDiem(){
        return d1+d2+d3;
    }
    @Override
    public String toString(){
        return sbd+"\t"+hoten+"\t"+tongDiem();
    }
    @Override
    public boolean equals(Object o) {
	if (this == o)
		return true;
	if (o == null)
		return false;
	if (this.getClass() != o.getClass())
		return false;
	ThiSinh other = (ThiSinh) o;
	if (sbd == null) {
		if (other.sbd != null)
			return false;
	} else if(!sbd.equals(other.sbd))
		return false;
	return true;
    }    
}
