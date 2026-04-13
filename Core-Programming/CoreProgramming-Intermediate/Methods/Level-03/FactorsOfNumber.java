// Write a program to find the factors of a number and perform various tasks using the factors
// array
// Hint =>
// a. Method to find factors of a number and return them as an array. Note there are 2 for
// loops: one for the count and another for finding the factor and storing in the array
// b. Method to find the greatest factor of a Number using the factors array

// 4

// c. Method to find the sum of the factors using factors array and return the sum
// d. Method to find the product of the factors using factors array and return the product
// e. Method to find the product of the cube of the factors using the factors array. Use
// Math.pow()

import java.util.Arrays;
import java.util.Scanner;

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

    long cubeprod = SumAndProductOfFactors(arr)[1];
    System.out.println("Product of cube of factors are: "+cubeprod);

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
    long cubeprod=1;
    long prod=1;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        cubeprod*=Math.pow(arr[i], 3);
        prod=prod*arr[i];
    }
    return new long[] {sum,cubeprod,prod};
  }
}
