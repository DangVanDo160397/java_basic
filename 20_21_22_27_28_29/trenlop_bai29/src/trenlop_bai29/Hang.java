/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai29;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class Hang {
    private String tenHang;
    private int donGia;
    private int soLuong;
    private int thanhTien;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten hang : ");
        tenHang=sc.nextLine();
        System.out.println("Nhap vao don gia : ");
        donGia=sc.nextInt();
        System.out.println("Nhap vao so luong : ");
        soLuong=sc.nextInt();
        thanhTien=soLuong*donGia;
    }
    public void xuat()
    {
        System.out.printf("%20s%20d%20d%20d\n",tenHang,donGia,soLuong,thanhTien);
    }
}
