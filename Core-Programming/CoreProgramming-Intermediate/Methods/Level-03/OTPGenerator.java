
// Write a program to generate a six-digit OTP number using Math.random() method. Validate
// the numbers are unique by generating the OTP number 10 times and ensuring all the 10
// OTPs are not the same
// Hint =>
// a. Write a method to generate a 6-digit OTP number using Math.random()
// b. Create an array to save the OTP numbers generated 10 times
// c. Write a method to ensure that the OTP numbers generated are unique. If unique return
// true else return false

import java.util.Arrays;
import java.util.Scanner;

public class OTPGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i=0;i<10;i++){
            arr[i]=otpValue();
        }

        System.out.println("Otps are :"+Arrays.toString(arr));

        if(uniqueCheck(arr)){
            System.out.println("All the generated otps are unique");
        }else{
            System.out.println("All the generated otps are not unique");
        }

    }
    // generating otps
    public static int otpValue(){
        int value = (int)Math.floor(Math.random()*1000000)+1;
        return value;
    }
    // checking uniqueness of otps
    public static boolean uniqueCheck(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

