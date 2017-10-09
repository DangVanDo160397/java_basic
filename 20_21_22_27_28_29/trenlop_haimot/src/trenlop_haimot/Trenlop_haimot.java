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
public class Trenlop_haimot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinhVien sv1=new SinhVien();
        sv1.nhap();
        
        SinhVien sv2=new SinhVien(999, "Ho Ba Hung", 10, 10);
        
        SinhVien sv3=new SinhVien();
        System.out.println("Nhap vao ma : ");
        sv3.setMaSinhVien(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao ten : ");
        sv3.setHoVaTen(sc.nextLine());
        System.out.println("Nhap vao diem LT");
        sv3.setDiemLt(sc.nextFloat());
        System.out.println("Nhap vao diem TH");
        sv3.setDiemTh(sc.nextFloat());
        
        sv1.inTieuDe();
        sv1.inDuLieu();
        sv2.inDuLieu();
        sv3.inDuLieu();
        
        
        System.out.println("hihi");
        SinhVien [] arr=new SinhVien[1];
        for (SinhVien itemp : arr) {
            itemp=new SinhVien();
            itemp.nhap();
        }
        sv1.inTieuDe();
        for (SinhVien itemp : arr) {
            //itemp=new SinhVien();
            itemp.inDuLieu();
        }

    }
    
}
