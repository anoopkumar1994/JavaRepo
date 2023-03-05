/*
    Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n
     integers is greater than or equal to m, else return false.(Integers appearing multiple times are all
     considered as 1 unique integer)
     Input 1:
        5
        10
        1 2 1 4 5 2 1 1 2 2
     Output 1:
        false
        Input 2:
        9
        15
        1 4 5 0 9 8 3 7 3 2 6 8 11 15 23
        Output 2:
        true
 */

import java.util.Scanner;
import java.util.Arrays;
public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n]; //store the n integers in an array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);//on sorting, same integers will get aligned in consecutive indices
        int i = 0;
        int count = 0;
        while(i < n){
            count++;
            while(i < n-1 && arr[i+1] == arr[i]){//skip duplicates of element
                i++;
            }
            i++; //increment 1 more as i was still pointing to the last duplicate of previous element
        }
        if(count >= m){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}