/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai30;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class SinhVienDemo {
    static SinhVien [] sv;
    static void nhap()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so sinh vien");
        n=sc.nextInt();
        sv=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sv[i]=new SinhVien();
            sv[i].nhap();
        }
    }
   static void xuat()
    {
        for(int i=0;i<sv.length;i++)
        {
            sv[i].xuat();
        }
    }
    public static void main(String[] args) {
        nhap();
        xuat();
        
    }
}
