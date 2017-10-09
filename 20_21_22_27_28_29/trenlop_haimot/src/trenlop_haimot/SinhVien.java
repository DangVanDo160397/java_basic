/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_haimot;

import java.util.Scanner;

/**
 *
 * @author leola
 */
public class SinhVien {
    private int maSinhVien;
    private String hoVaTen;
    private float diemTh,diemLt;

    public SinhVien(int maSinhVien, String hoVaTen, float diemTh, float diemLt) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemTh = diemTh;
        this.diemLt = diemLt;
    }

    public SinhVien() {
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemTh() {
        return diemTh;
    }

    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }

    public float getDiemLt() {
        return diemLt;
    }

    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }
    
    
    public  void inTieuDe()
    {
        System.out.printf("%20s%20s%20s%20s\n","MA SINH VIEN   |","TEN SINH VIEN   |","DIEM LT   |","DIEM TH   |");
        System.out.println("____________________________________________________________________________________");
    }
    public void inDuLieu()
    {
        String ma , ho , di1 , di2;
        ma=maSinhVien+"   |";
        ho=hoVaTen+"   |";
        di1=diemLt+"   |";
        di2=diemTh+"   |";
        System.out.printf("%20s%20s%20s%20s",ma,ho,di1,di2);
        System.out.println("");
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma : ");
        maSinhVien=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ho va ten : ");
        hoVaTen=sc.nextLine();
        System.out.println("Nhap vao diem LT : ");
        diemLt=sc.nextFloat();
        System.out.println("Nhap vao diem TH : ");
        diemTh=sc.nextFloat();
    }
    public float diemTrungBinh()
    {
        return (diemLt+diemTh)/2;
    }
}
