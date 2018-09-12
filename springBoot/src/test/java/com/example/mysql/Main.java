package com.example.mysql;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            int tem=in.nextInt();
            if(tem>1000)
                return;
            a[i]=tem;
        }
        if(n<5){
            System.out.println(0);
            return;
        }

    }
}
