
package com.example.ex1;


import java.util.Scanner;
import java.util.Random;

public class StudentGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Register no: ");
		int regno=sc.nextInt();
		System.out.println("Enter Student Message:");
	
        char a = sc.next().charAt(0);

         sc.close();
    }
}