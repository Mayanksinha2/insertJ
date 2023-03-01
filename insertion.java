package com.Learning_Java;
import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the Original String: ");
    String orig = input.nextLine();
        System.out.println("Enter the String to be Inserted: ");
    String insrt = input.nextLine();
        System.out.println("Enter the Index: ");
    int index = input.nextInt();
    String newStr = new String();
        for (int i = 0; i < orig.length(); i++) {
        newStr += orig.charAt(i);

        if (i == index) {
            newStr += insrt;
        }
    }
        System.out.println("New String After Insertion: "+ newStr);
}
}
