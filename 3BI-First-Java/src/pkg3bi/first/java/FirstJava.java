package pkg3bi.first.java;

import java.util.Scanner;

public class FirstJava {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array1[] = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print(array1[j] + " ");
        }
    }
}
