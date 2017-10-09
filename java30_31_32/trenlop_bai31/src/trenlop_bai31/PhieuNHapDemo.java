/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai31;

/**
 *
 * @author LEOLAKI
 */
public class PhieuNHapDemo {
    public static void main(String[] args) {
        PhieuNhap phieuNhap=new PhieuNhap();
        phieuNhap.nhapPhieu();
        System.out.println("CHUA SAP XEP");
        phieuNhap.xuatPhieu();
        System.out.println("DA SAP XEP");
        phieuNhap.sapXep2();
        phieuNhap.xuatPhieu();
        phieuNhap.minMaxSoLuong();
    }
}
