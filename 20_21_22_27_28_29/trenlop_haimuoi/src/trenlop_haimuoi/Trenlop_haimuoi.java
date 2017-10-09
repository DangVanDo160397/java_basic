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
public class Trenlop_haimuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoSo hs1=new HoSo("Ho Ba Hung");
        HoSo hs2=new HoSo("Nguyen Ba Nghia");
        HoSo hs3=new HoSo("Nguyen Thanh Nam");
        hs1.xuatHoTen();
        hs2.xuatHoTen();
        hs3.xuatHoTen();
        HoSo.tongKet();
    }
    
}
