/*
        Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

        Input:
        The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

        Output:
        Print the maximum sum of the contiguous sub-array in a separate line for each test case.

        Constraints:
        1 ≤ T ≤ 110
        1 ≤ N ≤ 106
        -107 ≤ A[i] <= 107

        Example:
        Input
        2
        5
        1 2 3 -2 5
        4
        -1 -2 -3 -4
        Output
        9
        -1

        Explanation:
        Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 */
import java.util.*;
class KadaneTheorem{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in) ;

        System.out.println("Enter no of Test Cases");

        int t=in.nextInt();

        for(int p=0 ; p < t ; p++){

            System.out.println("Enter Array Size");

            int s = in.nextInt();

            System.out.println("Enter Array elements");

            int[] array = new int[s] ;

            ArrayList<Integer> combo =new ArrayList<Integer>();

            for (int i = 0; i < s; i++) {

                array[i] = in.nextInt();
                combo.add( array[i] );

            }
            int q= s;
            int sum= 0;

            for(int i=0 ; i<s; i++){

                for(int j=i ; j<s ; j++){
                    sum += array[j] ;
                    combo.add( sum );
                    q+=1;
                }
                sum = 0;
            }
            Collections.sort( combo );

            int index = combo.size() - 1 ;

            int max= combo.get( index );

            System.out.println( max );

        }
    }

}