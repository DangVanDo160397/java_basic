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
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private Mon [] mon;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap vao ngay sinh : ");
        ngaySinh=new Date();
        ngaySinh.nhap();
        System.out.println("Nhap vao so mon hoc");
        int n;
        n=sc.nextInt();
        mon=new Mon[n];
        for(int i=0;i<n;i++)
        {
            mon[i]=new Mon();
            mon[i].nhap();
        }
      
    }
    public void xuat()
    {
        Mon tg=new Mon();
        System.out.printf("%20s%20s\n","TEN SINH VIEN","NGAY SINH");
        System.out.printf("%20s%20s\n",hoTen,ngaySinh.toString());
        System.out.println("----------------------------------------------------------------------------------------------\n");
        System.out.printf("%20s%20s%20s%20s\n","TENMON","SOHOCTRINH","SOKY","DIEM TB");
        for(int i=0;i<mon.length;i++)
        {
            for(int j=i+1;j<mon.length;j++)
            {
                if(mon[i].getDiemThi()>mon[j].getDiemThi())
                {
                    tg=mon[i];
                    mon[i]=mon[j];
                    mon[j]=tg;
                    
                }
            }
        }
        for(Mon item:mon)
        {
            item.xuat();
        }
    }
}
