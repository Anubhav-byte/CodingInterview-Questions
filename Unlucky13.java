/*Write a program to calculate the total number of strings that are made of exactly N characters.
        None of the strings can have 13 as a substring.
        The strings may contain any integer from(0-9),repeated any number of times.
*/


import java.util.*;
public class Unlucky13{
    public static void main(String[] args){
        int t, n;
        int initial, end;
        int count = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of test cases");
        t=input.nextInt();
        for(int c=1; c<=t ; c++) {
            System.out.println("Enter n");
            n = input.nextInt();

            if(n>1){
                int p=n;
                initial=1;
                end =0;
                while(p>1){
                    initial = initial*10;
                    p =p - 1;
                }
                end= (initial*10)-1;
            }
            else{
                initial=0;
                end = 9;
            }
            if(initial==0) {
                count=10;
            }
            else {
                count = end - (initial - 1);
            }


            for(int i=initial; i<=end ; i++){
                if( String.valueOf(i).contains("13") )
                    count--;
            }

            System.out.println(count);

        }
    }
}