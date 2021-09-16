package com.dz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Input the color, the size and the kind of the ball: ");
        Scanner sc = new Scanner(System.in);
        Ball a1 = new Ball(sc.next(),sc.nextInt(),sc.next());
        System.out.println(a1.toString());
    }
}
