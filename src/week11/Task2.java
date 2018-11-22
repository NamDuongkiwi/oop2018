package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable<T>> T max(ArrayList<T> arr) {
        T max = arr.get(0);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).compareTo(max) > 0)
                max = arr.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 65, 34, 12, 87};
        ArrayList<Integer> Array = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            Array.add(arr[i]);
        System.out.println(max(Array));
    }
}
