/*
    Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with
    odd sum.
    Input 1:
N = 3
[1,3,5]
Output 1:
4
Input 2:
N = 3
[2,4,6]
Output 2:
0
 */


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " element ");
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int sum = 0, even = 0, odd = 0;
        for(int num : arr){
            if(num % 2 == 1){
                int temp = odd;
                odd = even;
                even = temp;
                odd++;
            }else{
                even++;
            }
            sum += odd;
        }
        System.out.println(sum);
        System.out.println("Hello");
    }
}
