package com.examples.dsacodes.Patterns;

public class ButterflyPattern {
    public static void butterfly(int n)
    {
        for(int i=1; i<=n; i++)
        {
            //stars left
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces left
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }

            //spaces-right
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            //stars-right
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--)
        {
            //stars left
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces left
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }

            //spaces-right
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            //stars-right
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        butterfly(4);
    }
}
