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
public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao nam");
            nam = sc.nextInt();
        } while (nam > 2017);
        if (nam % 100 == 0 && nam % 4 == 0) {
            do {
                System.out.println("Nhap vao thang");
                thang = sc.nextInt();
            } while (thang <= 0 || thang > 12);
            switch (thang) {
                case 1:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 2:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 29);
                    break;

                case 3:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 4:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 5:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 6:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 7:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 8:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 9:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 10:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 11:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;
                case 12:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

            }
        } else {
            do {
                System.out.println("Nhap vao thang");
                thang = sc.nextInt();
            } while (thang <= 0 || thang > 12);
            switch (thang) {
                case 1:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 2:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 29);
                    break;

                case 3:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 4:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 5:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 6:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 7:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 8:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 9:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;

                case 10:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

                case 11:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 30);
                    break;
                case 12:
                    do {
                        System.out.println("Nhap vao ngay");
                        ngay = sc.nextInt();
                    } while (ngay <= 0 || ngay > 31);
                    break;

            }
        }

    }
    public String toString()
    {
        return ngay+" // "+thang+" // "+nam;
    }
}
