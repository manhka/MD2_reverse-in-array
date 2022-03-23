import java.util.Arrays;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
        System.out.println("enter a arr");
        Integer arr1[]= {1,2,3,6,99,33};
//        int arr2[]=new int[arr1.length];
//        for (int i = 0; i < arr1.length-1; i++) {
//            int k=i+1;
//            arr2[i]=arr1[arr1.length-k];
//        }
//        for (int number:arr2
//             ) {
//            System.out.println("arr2=="+number);
//        }
        reverse(arr1);
    }
    static void reverse(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    }

