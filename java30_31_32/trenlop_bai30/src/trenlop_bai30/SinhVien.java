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
public class SinhVien {
    private String tenSinhVien;
    private String maSinhVien;
    private String lop;
    private int khoa;
    private MonHoc [] monHoc;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap vao ma sinh vien : ");
        maSinhVien=sc.nextLine();
        System.out.println("Nhap vao ten sinh vien : ");
        tenSinhVien=sc.nextLine();
        System.out.println("nhap vao lop sinh vien : ");
        lop=sc.nextLine();
        System.out.println("Nha vao khoa : ");
        khoa=sc.nextInt();
        System.out.println("Nhap vao so mon hoc ");
        n=sc.nextInt();
        monHoc=new MonHoc[n];
        for(int i=0;i<n;i++)
        {
            monHoc[i]=new MonHoc();
            monHoc[i].nhap();
        }
    }
    public float tinhDiem()
    {
        int trinh=0;
        float tinh=0;
        for( int i=0;i<monHoc.length;i++)
        {
            trinh=trinh+monHoc[i].getSoTrinh();
            tinh=tinh+(monHoc[i].getDiem()*monHoc[i].getSoTrinh());
        }
        return tinh/trinh;
    }
    public void xuat()
    {
        System.out.println("-----------------------------------PHIEU BAO DIEM-----------------------------------");
        System.out.printf("%20s%10s%20s%10s\n","Mã sinh viên : ",maSinhVien,"Tên sinh viên : ",tenSinhVien);
        System.out.printf("%20s%10s%20s%10d%20s%10.2f\n","Lớp : ",lop,"Khóa : ",khoa,"Điểm TB : ",tinhDiem());
        System.out.println("");
        System.out.println("BẢNG ĐIỂM");
        System.out.println("");
        MonHoc.xuatTieuDe();
        for( int i=0;i<monHoc.length;i++)
        {
            monHoc[i].xuatDuLieu();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\n\n\n\n\n\n\n");
    }
}
