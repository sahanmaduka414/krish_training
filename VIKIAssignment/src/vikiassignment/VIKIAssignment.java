/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikiassignment;

import java.util.Scanner;

/**
 *
 * @author sahan maduka
 */
public class VIKIAssignment {

    private static final int a = 1, b = 2, c = 3;
    private static final int d = 5, e = 3, f = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Viki Distance :");
        
            double distance = s.nextDouble();
            distance(distance,c,0);
        
    }
    
    private static void distance(double distance, int rest, int time) {

        if (distance <= 0) {
            time -= rest;
            System.out.println("VIKI Time " + time );
            return;
        }

        if (rest == c) {
            distance -= d;
            time += a;
            distance(distance, a, time);

        } else if (rest == a) {
            distance -= e;
            time += b;
            distance(distance, b, time);
        } else {
            distance -= f;
            time += c;
            distance(distance, c, time);

        }

    }
    
}
