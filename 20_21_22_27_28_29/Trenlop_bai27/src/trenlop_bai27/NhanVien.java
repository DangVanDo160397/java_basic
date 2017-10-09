/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai27;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class NhanVien {
    private String hoDem;
    private String ten;
    private NgayThang ngaySinh;
    private NgayThang ngayVaoLam;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ho dem : ");
        hoDem=sc.nextLine();
        System.out.println("Nhap vao ten : ");
        ten=sc.nextLine();
        System.out.println("Nhap vao ngay sinh : ");
        ngaySinh=new NgayThang();
        ngaySinh.nhap();
        System.out.println("Nhap vao ngay di lam : ");
        ngayVaoLam=new NgayThang();
        ngayVaoLam.nhap();
    }
    public static void xuatTieuDe()
    {
        System.out.printf("%20s%20s%20s%20s\n","HO DEM","TEN","NGAY SINH","NGAYLAM");
        System.out.println("__________________________________");
    }
    public void xuat()
    {
        System.out.printf("%20s%20s%20s%20s\n",hoDem,ten,ngaySinh.toString(),ngayVaoLam.toString());
    }
}
