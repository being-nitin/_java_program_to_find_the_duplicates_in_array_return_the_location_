package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Write a program to find whether the array of integers contains a duplicate number. if yes
	print the location where duplicate numbers are found.

	 */
        int[] arr = {7,9,8,4,8};
        System.out.println(Arrays.toString(duplicate(arr)));
    }
        public static int[] duplicate(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("The duplicate element is "+arr[i]);
                return new int[]{i,j};
            }
        }
        }
        return new int[]{0,0};
        }
    }
// first loop will run from 0 till the length of the array.
// inner loop will run from i+1 till length of an array
