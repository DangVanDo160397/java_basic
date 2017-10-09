/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai31;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class Sach {
    private String tenSach;
    private String tenTacGia;
    private String tenNXB;
    private int soLuong;

    public Sach() {
    }

    public Sach(String tenSach, String tenTacGia, String tenNXB, int soLuong) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.tenNXB = tenNXB;
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhapSach()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten sach :");
        tenSach=sc.nextLine();
        System.out.println("Nhap vao ten tac gia :");
        tenTacGia=sc.nextLine();
        System.out.println("Nhap vao ten nha xuat ban :");
        tenNXB=sc.nextLine();
        System.out.println("Nhap vao so luong :");
        soLuong=sc.nextInt();
    }
    static void xuatTieuDe()
    {
        System.out.printf("%20s%20s%20s%20s\n","TEN SACH","TEN TAC GIA","TEN NXB","SO LUONG");
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
    public void xuatDuLieu()
    {
        System.out.printf("%20s%20s%20s%20d\n",tenSach,tenTacGia,tenNXB,soLuong);
    }
    
        
}
