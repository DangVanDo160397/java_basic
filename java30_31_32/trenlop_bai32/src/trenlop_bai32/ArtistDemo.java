/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenlop_bai32;

/**
 *
 * @author LEOLAKI
 */
public class ArtistDemo {
    public static void main(String[] args) {
        Shape shape=new Rectangle(7, 3);
        Shape shape1=new RightTriangle(20);
        Artist artist=new Artist();
        artist.drawShape(shape);
        artist.drawShape(shape1);
    }
}
