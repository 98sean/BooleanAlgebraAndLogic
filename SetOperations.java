/*
    Lee, Sean

    September 19, 2021

    CS A257
    Project - Set Operations (Revised)
*/

import java.util.Scanner;

public class SetOperations
{
    public static int[] complement(int[] universalSet, int[] setA)
    {
        int[] indexOfUniversalSet = new int[universalSet.length];
        int numOfElem = 0;
        
        for(int i = 0 ; i < universalSet.length ; i++)
        {
            int j = 0;
            boolean found = true;
            
            while(j < setA.length)
            {
                if(universalSet[i] == setA[j])
                {
                    found = false;
                    break;
                }
                ++j;
            }
            
            if(found)
            {
                indexOfUniversalSet[numOfElem] = i;
                numOfElem++;
            }
        }
        
        int[] complementSet = new int[numOfElem];
        
        for(int p = 0 ; p < complementSet.length ; p++)
        {
            complementSet[p] = universalSet[indexOfUniversalSet[p]];
        }
        
        return complementSet;
    }

	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the universal set's total number of elements: ");
        int numOfU = input.nextInt();
        int[] universalSet = new int[numOfU];

        System.out.println("Enter " + numOfU + " universal set's elements: ");

        for (int i = 0 ; i < universalSet.length; i++ ) 
        {
           universalSet[i] = input.nextInt();
        }
        
        System.out.println("Enter the set A's total number of elements: ");
        int numOfA = input.nextInt();
        int[] setA = new int[numOfA];

        System.out.println("Enter " + numOfA + "set A's elements: ");

        for (int i = 0 ; i < setA.length; i++ ) 
        {
           setA[i] = input.nextInt();
        }
        
        // below is for the test without getting inputs
        
        /*
        int[] universalSet = {1, 2, 3, 9};
        int[] setA = {2, 9};
        */
        
        System.out.print("Universal set is: {" + universalSet[0]);
        
        for(int idx = 1 ; idx < universalSet.length ; idx++)
        {
            System.out.print(", " + universalSet[idx]);
        }
        
        System.out.println("}");
        
        System.out.print("Set A is: {" + setA[0]);
        
        for(int idx = 1 ; idx < setA.length ; idx++)
        {
            System.out.print(", " + setA[idx]);
        }
        
        System.out.println("}");
        
        int[] complementSet = complement(universalSet, setA);
        
        System.out.print("Complement of A is: {" + complementSet[0]);
        
        for(int idx = 1 ; idx < complementSet.length ; idx++)
        {
            System.out.print(", " + complementSet[idx]);
        }
        
        System.out.println("}");
    }
}