/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai32;

import java.util.Scanner;

/**
 *
 * @author LEOLAKI
 */
public class Rectangle extends Shape{
    private int chieuDai;
    private int chieuRong;

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Rectangle() {
        
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Nhap vao chieu dai [1,15]");
            chieuDai=sc.nextInt();
        }
        while(chieuDai<1&&chieuDai>15);
        do
        {
            System.out.println("Nhap vao chieu rong [1,15]");
            chieuRong=sc.nextInt();
        }
        while(chieuRong<1&&chieuRong>15);
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public void draw() {
        super.draw();
        for(int i=0;i<chieuRong;i++)
        {
            for(int j=0;j<chieuDai;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    
    

}
