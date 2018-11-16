package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Task1 {
    public static List<String> getAllFunctions1(File path){
        try{
            List<String> result = new ArrayList<String>();
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String i = null;
            while((i = br.readLine()) != null){
                if(i.indexOf("static")>0){
                    String test = i.substring(0,6);
                    if(test.equals("    /*") != true){
                        i = i.trim();
                        i=i.replace("{", "");

                        result.add(i);
                    }
                }
            }
            br.close();
            fr.close();
            return result;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<String> getAllFunctions(File path){
        List<String> result = new ArrayList<>();
        List<String> all = new ArrayList<>();
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String str = null;
            while((str = br.readLine()) != null){
                all.add(str);
            }
            for(int i = 0; i < all.size(); i++){
                String temp = new String();
                if(all.get(i).indexOf("static") > 0 && all.get(i).substring(0,6).equals("    /*") != true){
                    for(int j = i; all.get(j).equals("    }") != true; j++){
                        String s = all.get(j);
                        if(s.indexOf("//") > 0){
                            int cmt = s.indexOf("//");
                            s = s.substring(0,cmt);
                        }
                        temp += s + "\n";
                    }
                    result.add(temp + "    }");
                }
            }
            br.close();
            fr.close();
            return result;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String findFunctionByName(String Name){
        File file = new File("D:\\github\\oop2018\\src\\week9\\Utils.java");
        List<String> a = getAllFunctions1(file);
        String result = null;
        for(int i=0; i<a.size();i++){
            String b = a.get(i);
            b = b.trim();
            b = b.substring(14, b.length());
            int index = b.indexOf(" ");
            b = b.substring(index, b.length());
            int n = b.indexOf("(");
            String head = b.substring(0,n);
            String tail = b.substring(n,b.length());

            String tail2 = new String();
            String item[] = tail.split(", ");
            for(int j = 0; j < item.length; j ++){
                String first[] = item[j].split(" ");
                tail2+=first[0]+",";
            }
            tail2=tail2.substring(0,tail2.length()-1);
            tail2 += ")";
            String h = head + tail2;
            h = h.trim();
            if(h.equals(Name)) result = h;

        }

        if(result != null){
            return "Phương thức là: " + result ;
        }else return "Không có phương thức hợp lệ";
    }



    public static void main(String[] args) {

        //TODO: in ra tất cả phương thức
        File file = new File("D:\\github\\oop2018\\src\\week9\\Utils.java");
        List<String> a = getAllFunctions(file);
        System.out.println("Các Phương thức có trong file là: " );
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        //TODO: tìm phương thức

        System.out.println("\n" + findFunctionByName("findFileByName(String,String)"));
        //*/

        /*String b = "public static File findFileByName(String folderPath, String fileName)";
        b.trim();
        b = b.substring(14, b.length());
        int index = b.indexOf(" ");
        b = b.substring(index, b.length());
        b.replaceAll("\\s+", "");
        b = b.replaceAll("path","");
        b = b.replaceAll("folderPath", "");
        b = b.replaceAll("fileName","");

        b = b.substring(index+1, b.length());
        System.out.println(b);*/

        /*String b = "public static File findFileByName(String folderPath, String fileName)";
        b.trim();
        b = b.substring(14, b.length());
        int index = b.indexOf(" ");
        b = b.substring(index, b.length());
        b = b.replaceAll("\\s+", "");
        b = b.replaceAll("path","");
        b = b.replaceAll("folderPath", "");
        b = b.replaceAll("fileName","");
        System.out.println(b);*/

    }
}
