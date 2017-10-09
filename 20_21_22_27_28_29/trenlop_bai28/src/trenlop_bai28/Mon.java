/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai28;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class Mon {
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    private float diemThi;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoHocTrinh() {
        return soHocTrinh;
    }

    public void setSoHocTrinh(int soHocTrinh) {
        this.soHocTrinh = soHocTrinh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten mon : ");
        tenMon=sc.nextLine();
        System.out.println("Nhap vao so hoc trinh : ");
        soHocTrinh=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao hoc ky : ");
        hocKy=sc.nextLine();
        System.out.println("Nhap vao diem thi : ");
        diemThi=sc.nextFloat();
    }
    public void xuat()
    {
        System.out.printf("%20s%20d%20s%20f\n",tenMon,soHocTrinh,hocKy,diemThi);
    }
    
}
