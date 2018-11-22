package week11;

public class Task1 {
    public static <T > void ArrayOutput(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i].compareTo(arr[j]) > 0) {
                    //swap(arr, j - 1, j);
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("sắp xếp kiểu Byte: ");
        Byte[] ArrByte = {2, 3, 1, 5, 4};
        sort(ArrByte);
        ArrayOutput(ArrByte);
        /*System.out.print("\nsắp xếp kiểu Interger");
        Integer[] ArInt = {2, 5, 4, 6, 1};
        sort(ArInt);
        ArrayOutput(ArInt);
        System.out.print("\nsắp xếp kiểu double: ");
        Double[] ArDoub = {2.5, 2.6, 4.67, 1.3, 0.1};
        sort(ArDoub);
        ArrayOutput(ArDoub);
        System.out.print("\nsắp xếp mảng character: ");
        Character[] ArChar  = {'q', 'w', 'e', 'r', 't'};
        sort(ArChar);
        ArrayOutput(ArChar);*/
    }
}
