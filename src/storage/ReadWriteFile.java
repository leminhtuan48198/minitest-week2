package storage;

import model.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<NhanVien> readFile(){
        List<NhanVien> listOfNhanVien =new ArrayList<>();
       try {
           FileInputStream fis = new FileInputStream("nhanvien.txt");
           ObjectInputStream ois = new ObjectInputStream(fis);
           listOfNhanVien=(List<NhanVien>) ois.readObject();
           ois.close();
           fis.close();
       }catch(IOException e){
           e.printStackTrace();

        } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return listOfNhanVien;
    }
    public static void writeFile(List<NhanVien> listOfNhanVien){
        try{
            FileOutputStream fos=new FileOutputStream("nhanvien.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(listOfNhanVien);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
