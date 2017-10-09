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
public class MonHoc {
    private String tenMon;
    private int soTrinh;
    private float diem;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTrinh() {
        return soTrinh;
    }

    public void setSoTrinh(int soTrinh) {
        this.soTrinh = soTrinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao ten mon hoc : ");
        tenMon=sc.nextLine();
        System.out.println("Nhap vao so trinh : ");
        soTrinh=sc.nextInt();
        System.out.println("NHap vao diem : ");
        diem=sc.nextFloat();
    }
    public static void xuatTieuDe()
    {
        System.out.printf("%20s%20s%20s\n","TEN MON","SO TRINH","DIEM");
    }
    public void xuatDuLieu()
    {
        System.out.printf("%20s%20d%20f\n",tenMon,soTrinh,diem);
    }
}
