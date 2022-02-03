package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int k = 0;
        int a = 0;

        int n = scanner.nextInt();
        int[] integers = new int[n];
        for(int i = 0; i < n; i++){
            integers[i] = scanner.nextInt();

        }

        for(int i = 0; i < n-2; i++){
            k = integers[i];
            integers[i] = integers[i+2];
            integers[i+2] = k;

        }

        System.out.println(Arrays.toString(integers));




    }
}