package week10;

import java.util.Random;

public class Task2 {
    public static void sort(){
        double ar[] = new double[1000];
        for(int i = 0; i < 1000; i++){
            Random random = new Random();
            ar[i] = random.nextDouble()*100;
        }
        for(int i = 0; i < 1000; i++){
            for(int j = i+1; j < 1000; j++){
                if(ar[i]> ar[j]){
                    double temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for(int i = 0; i < 1000; i++){
            System.out.println( ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        sort();
    }
}
