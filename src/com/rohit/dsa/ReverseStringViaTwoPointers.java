package com.rohit.dsa;

import java.util.Arrays;

public class ReverseStringViaTwoPointers {
    public static void main(String[] args) {
//        char[] arr = {'R','o','h','i','t'};
        char[] arr = {'h','e','l','l','o'};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(char[] arr) {
        int leftP = 0;
        int rightP = arr.length - 1;

        while(leftP < rightP) {
            char temp = arr[leftP];
            arr[leftP] = arr[rightP];
            arr[rightP] = temp;
            leftP++;
            rightP--;
        }
    }
}
