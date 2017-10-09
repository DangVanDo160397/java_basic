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
public class HoaDon {
    private String maHoaDon;
    private String tenKhachHang;
    private Date ngayBan;
    private String diaChi;
    private Hang [] matHang;
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma hoa don : ");
        maHoaDon=sc.nextLine();
        System.out.println("Nhap vao ten khach hang : ");
        tenKhachHang=sc.nextLine();
        System.out.println("Nhap vao ngay ban : ");
        ngayBan=new Date();
        ngayBan.nhap();
        System.out.println("Nhap vao dia chi : ");
        diaChi=sc.nextLine();
        System.out.println("Nhap vao mat hang : ");
        int n;
        System.out.println("Nhap vao so mat hang : ");
        n=sc.nextInt();
        matHang=new Hang[n];
        for(int i=0;i<n;i++)
        {
            matHang[i]=new Hang();
            matHang[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.printf("%40s%40s\n","MAX HD : "+maHoaDon,"NGAY BAN : "+ngayBan.toString()
        );
        System.out.printf("%40s%40s\n","KHACH HANG : "+tenKhachHang,"DIA CHI : "+diaChi
        );
        System.out.println("________________________________________________________________________________________________");
        System.out.printf("%20s%20s%20s%20s\n","TEN HANG","DON GIA","SO LUONG","THANH TIEN");
        Hang tg=new Hang();
        for(int i=0;i<matHang.length;i++)
        {
            for(int j=i+1;j<matHang.length;j++)
            {
                if(matHang[i].getThanhTien()>matHang[j].getThanhTien())
                {
                    tg=matHang[i];
                    matHang[i]=matHang[j];
                    matHang[j]=tg;
                }
            }
        }
        for(Hang item : matHang)
        {
            item.xuat();
        }
    }
}
