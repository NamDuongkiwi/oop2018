package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    /*public static String readContentFromFile(String path){

        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String s = "" ;
            String result = "" ;
            while ((s = br.readLine()) != null){
                result = result  + s + "\n";
            }
            br.close();
            fr.close();
            return result;
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }

    }*/

    public static String readContentFromFile(String path){
        try{
            FileInputStream file = new FileInputStream(path);
            Scanner input = new Scanner(file ,"UTF-8");
            String result = "";
            while(input.hasNextLine()){
                result += input.nextLine() + "\n";
            }
            file.close();
            return result;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void writeContentToFile1(String path){

        try{
            FileWriter fw = new FileWriter(path);
            Scanner s = new Scanner(System.in);
            String Str = s.nextLine() + "\n";
            fw.write(Str);
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void AddToFile(String path){
        try{
            FileWriter fw = new FileWriter(path, true);
            Scanner s = new Scanner(System.in);
            String Str = s.nextLine() + "\n";
            fw.write(Str);
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath+"\\"+fileName);
        if(file.exists()) return file;
        else return null;
    }



    public static void main(String[] args) {

        // Đọc file từ đường dẫn
        System.out.println(readContentFromFile("D:\\week3\\xam.txt"));

        //xuất vào file
        writeContentToFile1("D:\\week3\\l.txt");

        //ghi thêm vào file
        AddToFile("D:\\week3\\l.txt");

        //tìm  file
        File file = findFileByName("D:\\week3", "xaml.txt");
        if(file != null)
            System.out.println(file.toString());
        else System.out.println("File không tồn tại");

    }
}
