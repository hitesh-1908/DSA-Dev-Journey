package com.examples.dsacodes.Patterns;

public class HollowRhombus {
    public static void hollowRhombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        hollowRhombus(5);
    }
}
