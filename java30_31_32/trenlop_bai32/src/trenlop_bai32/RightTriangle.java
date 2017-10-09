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
public class RightTriangle extends Shape{
    private int canhVuong;

    public RightTriangle() {
    }

    public RightTriangle(int canhVuong) {
        this.canhVuong = canhVuong;
    }

    public int getCanhVuong() {
        return canhVuong;
    }

    public void setCanhVuong(int canhVuong) {
        this.canhVuong = canhVuong;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Nhap vao canh vuong [1,20]");
            canhVuong=sc.nextInt();
        }
        while(canhVuong<1&&canhVuong>20);
    }

    @Override
    public void draw() {
        super.draw();
        for(int i=0;i<canhVuong;i++)
        {
            for(int j=0;j<=canhVuong;j++)
            {
                if(i==j)
                {
                    for(int k=0;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println("");
        }
    }
    
    
}
