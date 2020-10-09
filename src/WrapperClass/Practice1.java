package WrapperClass;

import com.sun.xml.internal.fastinfoset.util.CharArrayArray;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4};

        Integer[] arr2 = {1, 2, 3, 4}; // wrapper class unboxing from int to Integer

        for(Integer each : arr2){
            System.out.println(each);
        }

        double[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        Double[] arr4 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}; // wrapper class always loyal own one

        for(double each : arr4){
            System.out.println(each);
        }

        char[] arr5 = {65, 67, 68, 69};
        System.out.println(Arrays.toString(arr5));

        String[] nums1 = {"12", "13", "14", "15"};
        double[] nums2 = new double[nums1.length];

        for(int i = 0; i <= nums1.length-1; i++){
            nums2[i] =Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));
    }
}
