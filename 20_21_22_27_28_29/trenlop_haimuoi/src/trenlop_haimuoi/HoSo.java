/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_haimuoi;

/**
 *
 * @author leola
 */
public class HoSo {
    private String HoTen;
    private static int soNguoi;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public HoSo() {
        
    }

    public HoSo(String HoTen) {
        this.HoTen = HoTen;
        soNguoi++;
    }
    public void xuatHoTen()
    {
        System.out.println("Ten la : "+HoTen);
    }
    public static void tongKet()
    {
        System.out.println("So nguoi : "+soNguoi);
    }
    
}
