/*
    Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

    Input:
    The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

    Output:
    For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

    Constraints:
    1 <= T <= 100
    1 <= N <= 107
    1 <= Ai <= 1010

    Example:
    Input:
    2
    5 12
    1 2 3 7 5
    10 15
    1 2 3 4 5 6 7 8 9 10
    Output:
    2 4
    1 5

    Explanation :
    Testcase1: sum of elements from 2nd position to 4th position is 12
    Testcase2: sum of elements from 1st position to 5th position is 15
 */



import java.util.Scanner;

class SubArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ;

        System.out.println("Enter no of Test Cases");

        int t=in.nextInt();

        for(int p=0 ; p < t ; p++) {
            System.out.println("Enter Array Size and Subarray");

            int s = in.nextInt();

            int sarray = in.nextInt();

            int[] array = new int[s];

            System.out.println("Enter Array elements");

            int start =0, end = 0;

            for (int i = 0; i < s; i++) {

                array[i] = in.nextInt();

            }
            int sum = 0;

            a:
            for( int i=0 ; i<s ; i++){
                sum=0;
                for(int j=i ; j<s ; j++){

                    sum += array[ j ];

                    if( sum == sarray ){
                        start = i;
                        end = j;
                        break a ;
                    }

                }

            }
            if(start==0 && end==0){
                start= -2;
                end = -2;
            }
            System.out.println(start+1);
            System.out.println(end+1);


        }
    }
}