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
public class NhanVienDemo {
    static NhanVien [] dsnv;
    static void nhapDanhSach()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so luong nhan vien");
        n=sc.nextInt();
        dsnv=new NhanVien[n];
        for(int i=0;i<n;i++)
        {
            dsnv[i]=new NhanVien();
            dsnv[i].nhap();
        }
    }
    static void xuatDanhSach()
    {
        for(NhanVien item: dsnv)
        {
            item.xuat();
        }
    }
    public static void main(String[] args) {
        nhapDanhSach();
        NhanVien.xuatTieuDe();
        xuatDanhSach();
    }
}
