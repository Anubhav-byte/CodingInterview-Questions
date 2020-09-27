/*
    Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

    Input:
    The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

    Output:
    Print the missing number in array.

    Constraints:
    1 ≤ T ≤ 200
    1 ≤ N ≤ 107
    1 ≤ C[i] ≤ 107

    Example:
    Input:
    2
    5
    1 2 3 5
    10
    1 2 3 4 5 6 7 8 10

    Output:
    4
    9

    Explanation:
    Testcase 1: Given array : 1 2 3 5. Missing element is 4.
 */




import java.util.*;
class MissingNumber{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in) ;

        System.out.println("Enter no of Test Cases");

        int t=in.nextInt();

        for(int p=0 ; p<t ; p++){

            System.out.println("Enter Array Size");

            int s = in.nextInt();

            System.out.println("Enter Array elements");

            int[] array = new int[s] ;

            for (int i = 1; i < s; i++)
                array[i] = in.nextInt();

            for(int i=1 ; i<s ; i++){
                for(int j= i+1 ; j<s; j++){
                    if( array[i] > array[j] ){
                        int temp =array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            for(int  i=1; i<s ; i++) {
                if(array[s-1] != s)
                {
                    System.out.println(s);
                    break;
                }
                if(array[1] != 1){
                    System.out.println( 1);
                    break;
                }
                if (array[i + 1] - array[i] > 1) {
                    System.out.println(array[i] + 1);
                    break;
                }
            }
        }
    }
}