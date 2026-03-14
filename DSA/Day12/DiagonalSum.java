import java.util.Scanner;

class DiagonalSum {

    //This gives O(n^2) Time Complexity
    public static int diagonalSum(int matrix[][])
    {
        int sum = 0;

        //For primary diagonal
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(i == j)
                    sum += matrix[i][j];

                if(i+j == matrix.length-1)
                    sum += matrix[i][j];
            }
        }
        return sum;
    }

    //Optimized Code
    //This gives O(n) Time Complexity
    public static int diagonalSumOptimized(int matrix[][])
    {
        int sum = 0;

        for(int i=0; i< matrix.length; i++)
        {
            //Primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = {{1,2,3}, //,3
                          {5,6,7}, //,8
                          {9,10,11}, //,12
//                          {13,14,15,16},
                         };

        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum of Matrix = "+result);

        int result1 = diagonalSumOptimized(matrix);
        System.out.println("Diagonal Sum of Matrix Optimized= "+result1);
    }
}
