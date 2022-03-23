import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
//
        System.out.println("enter a arr");
//        Integer arr1[]= {1,2,3,6,99,33};
//        reverse(arr1);
        int arr1[]= new int[5];
        int i=0;
        int arr2[]=new int[arr1.length];
        Scanner sc= new Scanner(System.in);
        while (i<arr2.length){
            arr1[i]= sc.nextInt();
            i++;
        }
        for (int x= 0; x< arr1.length; x++) {
            int k=x+1;
            arr2[x]=arr1[arr1.length-k];
        }
        for (int number:arr2
             ) {
            System.out.println("arr2=="+number);
        }

    }
//    static void reverse(Integer arr[]){
//        Collections.reverse(Arrays.asList(arr));
//        System.out.println(Arrays.asList(arr));
//    }
    }

