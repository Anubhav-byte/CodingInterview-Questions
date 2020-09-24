/*
    Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.


    `Example 1:

    Input:
    N = 4
    arr[] = {1, 5, 3, 2}
    Output: 2
    Explanation: There are 2 triplets:
    1 + 2 = 3 and 3 +2 = 5

    â€‹Example 2:

    Input:
    N = 3
    arr[] = {2, 3, 4}
    Output: 0
    Explanation: No such triplet exits

    Your Task:
    You don't need to read input or print anything. Your task is to complete the function countTriplet() which takes the array arr[] and N as inputs and returns the triplet count

    Expected Time Complexity: O(N2)
    Expected Auxiliary Space: O(1)

    Constraints:
    1 ≤ N ≤ 10^3
    1 ≤ arr[i] ≤ 10^5
 */


class Triplet {
    public static void main(String[] args) {

        int N = 3 ;
        int arr[] = {4, 3, 2} ;
        int count = 0;
        int sum = 0 ;
        for(int i=0 ; i<N ; i++){
            sum=0;
            for(int j= i+1 ; j<N ; j++){
                sum = arr[i] + arr[j] ;
                for(int k=0 ; k<N ; k++) {
                    if(arr[k]==arr[i] || arr[k]==arr[j] )
                        continue;

                    if (sum == arr[k])
                        count++;
                }
            }
        }
        System.out.println( count );
    }
}