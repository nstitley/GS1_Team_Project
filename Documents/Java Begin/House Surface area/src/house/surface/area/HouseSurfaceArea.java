/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.surface.area;

import java.util.Scanner;

/**
 *
 * @author Mr B
 */
public class HouseSurfaceArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double w , l , h ;
            double numWin, winWidth, winHeight;
            double numDoor, doorWidth, doorHeight;
            double surfaceArea;
            System.out.println("Please enter the width, length and height" + " the house to be painted");
            Scanner in = new Scanner(System.in);
            w = in.nextDouble();
            l = in.nextDouble();
            h = in.nextDouble();
            System.out.println("Please enter the number of windows, width and height: ");
            numWin = in.nextDouble();
            winWidth = in.nextDouble();
            winHeight = in.nextDouble();
            System.out.println("Please enter the number of doors, width and height: ");
            numDoor = in.nextDouble();
            doorWidth = in.nextDouble();
            doorHeight = in.nextDouble();
            surfaceArea = (w* h* 2 + l *h) - (numWin * winWidth * winHeight) - (numDoor * doorWidth * doorHeight);
            System.out.println("The total Surface Area of the house is "+ surfaceArea );
    }
    
}
