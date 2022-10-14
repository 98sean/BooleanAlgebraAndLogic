/*
    Lee, Sean
    
    October 31, 2021
    
    CS A257
    Project - Boolean Matrix
*/

import java.util.Scanner;

public class BooleanMatrixOperation
{
    public static int[][] transpose(int[][] matrixA)
    {
        int newRows = matrixA[0].length;
        int newColumns = matrixA.length;
        
        int[][] transposeMatix = new int[newRows][newColumns];
        
        for (int i = 0 ; i < newRows ; ++i)
        {
            for (int j = 0 ; j < newColumns ; ++j)
            {
                transposeMatix[i][j] = matrixA[j][i];
            }
        }
        
        return transposeMatix;
    }
    
    // below is for testing
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many rows you want to make?: ");
        int rows = input.nextInt();
        
        System.out.println("How many columns you want to make?: ");
        int columns = input.nextInt();
        
        int[][] matrixA = new int [rows][columns];
        
        System.out.println("Fill out your matrix: ");
        for (int i = 0 ; i < rows ; ++i)
        {
            for (int j = 0 ; j < columns ; ++j)
            {
                matrixA[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Your matrix is: ");
        for (int i = 0 ; i < rows ; ++i)
        {
            for (int j = 0 ; j < columns ; ++j)
            {
                System.out.print(matrixA[i][j] + " ");
            }
            
            System.out.println("");
        }
        
        System.out.println("The transpose of your matrix is: ");
        int[][] transposeMatix = transpose(matrixA);
        for (int i = 0 ; i < transposeMatix.length ; ++i)
        {
            for (int j = 0 ; j < transposeMatix[0].length ; ++j)
            {
                System.out.print(transposeMatix[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
}