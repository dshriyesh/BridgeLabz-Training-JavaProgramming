// Create a program to find the factors of a number taken as user input, store the factors in an
// array, and display the factors. Also find the sum, sum of square of factors and product of the
// factors and display the results
// Hint =>
// a. Take the input for a number
// b. Write a static Method to find the factors of the number and save them in an array and
// return the array.
// c. To find factors and save to array will have two loops. The first loop to find the count and
// initialize the array with the count. And the second loop save the factors into the array
// d. Write a method to find the sum of the factors using factors array
// e. Write a method to find the product of the factors using factors array
// f. Write a method to find the sum of square of the factors using Math.pow() method

import java.util.*;
public class FactorsOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    
    int count = factorsCount(num);

    int[] arr = new int[count];

    factors(arr,num);
    System.out.println("Factors of "+num+" are "+Arrays.toString(arr));

    long sum=SumAndProductOfFactors(arr)[0];
    System.out.println("Sum of factors are: "+sum);

    long sqSum = SumAndProductOfFactors(arr)[1];
    System.out.println("Sum of square of factors are: "+sqSum);

    long product = SumAndProductOfFactors(arr)[2];
    System.out.println("Product of factors are : "+product);


  } 
  public static int factorsCount(int num){
    int cnt=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            cnt++;
        }
    }
    return cnt;
  } 

  public static void factors(int[] arr,int num){
    int idx=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            arr[idx]=i;
            idx++;
        }
    }
  }

  public static long[] SumAndProductOfFactors(int[] arr){
    long sum=0;
    long sqsum=0;
    long prod=1;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        sqsum+=arr[i]*arr[i];
        prod=prod*arr[i];
    }
    return new long[] {sum,sqsum,prod};
  }
}
