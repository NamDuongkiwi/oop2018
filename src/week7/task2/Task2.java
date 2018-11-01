package week7.task2;

import week2.task2.Fraction;
import week5_6.Triangle;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void NullPointer() throws NullPointerException{
        String obj = null;
        System.out.println(obj.length());
    }
    public static void ArrayIndexOfBound() throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[5];
        arr[5] = 50;

    }
    public static void Arithmetic() throws ArithmeticException{
        int a = 9;
        int b = 0;
        System.out.println(a/b);
    }
    public static void ClassCast() throws ClassCastException{
        Object triagle = new Triangle(4, 5, 6);
        Fraction f = (Fraction) triagle;
    }
    public static void IO() throws IOException{
        FileOutputStream f = new FileOutputStream("output.txt");
        f.close();
        f.write(1);
    }
    public static void FileNotFound() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("faker.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public static void main(String[] args) {

        //TODO: NullPointerException: thao tác vs 1 biến null
        try{
            NullPointer();
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        //TODO: ArrayIndexOfBound: thao tác với vị trí sai của 1 mảng
        try{
            ArrayIndexOfBound();
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }

        //TODO: Arithmetic: chia cho 0
        try{
            Arithmetic();
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }

        //TODO: ClassCAst: ép kiểu sai
        try{
            ClassCast();
        }catch(ClassCastException c){
            System.out.println(c.getMessage());
        }

        //TODO: IO : không đọc được file
        try{
            IO();
        }catch(IOException i){
            //i.printStackTrace();
            System.out.println(i.getMessage());
        }

        //TODO: FileNotFOund: không tìm thấy file
        try{
            FileNotFound();
        }catch(FileNotFoundException f){
            System.out.println(f.getMessage());
        }


    }


}
