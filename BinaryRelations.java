/*
    Lee, Sean
    
    October 31, 2021
    
    CS A257
    Project - Binary Relations
*/

import java.util.Scanner;

public class BinaryRelations
{
    public static boolean reflexive(int[][] matrixRepresentation)
    {
        int rows = matrixRepresentation.length;
        int columns = matrixRepresentation[0].length;
        
        if (rows != columns)
            return false;
        
        for (int i = 0 ; i < rows ; ++i)
        {
            for (int j = 0 ; j < columns ; ++j)
            {
                if ((i == j) && (matrixRepresentation[i][j] == 0))
                    return false;
            }
        }
        
        return true;
    }
     
    // below is for testing

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many rows you want to make?: ");
        int rows = input.nextInt();
        
        System.out.println("How many columns you want to make?: ");
        int columns = input.nextInt();
        
        int[][] matrix = new int [rows][columns];
        
        System.out.println("Fill out your matrix: ");
        for (int i = 0 ; i < rows ; ++i)
        {
            for (int j = 0 ; j < columns ; ++j)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Your matrix is: ");
        for (int i = 0 ; i < rows ; ++i)
        {
            for (int j = 0 ; j < columns ; ++j)
            {
                System.out.print(matrix[i][j] + " ");
            }
            
            System.out.println("");
        }
        
        System.out.println("Result true for reflexive matrix or false for anti-reflexive matrix: ");
        System.out.println(reflexive(matrix));
    }
}