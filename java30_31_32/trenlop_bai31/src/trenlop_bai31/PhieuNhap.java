/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class PhieuNhap {
    private String maPhieu;
    Date ngayLap;
    private int tongNhap;
    Sach [] sach;
    public void nhapPhieu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma phieu :");
        maPhieu=sc.nextLine();
        System.out.println("Nhap vao ngay lap : ");
        ngayLap=new Date();
        ngayLap.nhap();
        int n;
        System.out.println("Nhap vao so luong sach :");
        n=sc.nextInt();
        sach=new Sach[n];
        for(int i=0;i<n;i++)
        {
            sach[i]=new Sach();
            sach[i].nhapSach();
        }
    }
    public int tinhTong()
    {
        for(Sach item : sach)
        {
            tongNhap=tongNhap+item.getSoLuong();
        }
        return tongNhap;
    }
    public void xuatPhieu()
    {
        System.out.printf("%40s","PHIEU NHAP SACH\n");
        System.out.printf("%20s%15s%20s%15s\n","MA PHIEU",maPhieu,"NGAY LAP",ngayLap);
        System.out.printf("%20s%10d\n","TONG SO LUONG",tinhTong());
        Sach.xuatTieuDe();
        for(Sach item : sach)
        {
            item.xuatDuLieu();
        }
    }
    public void sapXep()
    {
        Sach tg=new Sach();
        for(int i=0;i<sach.length;i++)
        {
            for(int j=i+1;j<sach.length;j++)
            {
                String itg=sach[i].getTenSach().toLowerCase();
                String jtg=sach[j].getTenSach().toLowerCase();
                if(itg.charAt(0)>jtg.charAt(0))
                {
                    tg=sach[i];
                    sach[i]=sach[j];
                    sach[j]=tg;
                }
            }
        }
    }
    public void sapXep2()
    {
        // SO sánh xâu
        Comparator<Sach> c=new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {// tên
                //return o1.getTenSach().compareToIgnoreCase(o2.getTenSach());
                int a=Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                //return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                // đổi chố o1 o2 để tăng giảm
                if(a==0)
                    return o1.getTenSach().compareToIgnoreCase(o2.getTenSach());
                else
                    return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
            }
        };
        Arrays.sort(sach,c);
        // SO sánh số . Lớp bao bọc .copareTo
    }
    public void timMin()
    {
        sapXep2();
        sach[0].xuatDuLieu(); // xuat du lieu thang min
        sach[sach.length-1].xuatDuLieu(); //
    }
    public void sapXep3()
    {
        Comparator<Sach> c=new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) 
            {
                //return o1.getTenSach().compareToIgnoreCase(o1.getTenSach());
                
                int a= Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                if(a==0)
                {
                    return o1.getTenSach().compareToIgnoreCase(o1.getTenSach());
                }
                else
                    return a;
            }
        };
    }
    public void min()
    {
        
    }
    
    public void minMaxSoLuong()
    {
        //min
        int min=sach[0].getSoLuong();
        for(int i=0;i<sach.length;i++)
        {
            if(sach[i].getSoLuong()<min)
                min=sach[i].getSoLuong();
        }
        //max
        int max=sach[0].getSoLuong();
        for(Sach item : sach)
        {
            if(item.getSoLuong()>max)
            {
                max=item.getSoLuong();
            }
        }
        
        for(Sach item : sach)
        {
            if(item.getSoLuong()==min)
            {
                System.out.println("\n\n\n");
                System.out.println("SACH CO SO LUONG MIN");
                Sach.xuatTieuDe();
                item.xuatDuLieu();
            }
        }
        
        for(Sach item : sach)
        {
            if(item.getSoLuong()==max)
            {
                System.out.println("\n\n\n");
                System.out.println("SACH CO SO LUONG MAX");
                Sach.xuatTieuDe();
                item.xuatDuLieu();
            }
        }
    }
}
