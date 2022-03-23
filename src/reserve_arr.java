public class reserve_arr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int k=i+1;
            arr1[i]=arr2[arr1.length-i];
        }
        System.out.println(arr2[1]);
    }
}
