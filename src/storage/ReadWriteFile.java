package storage;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<Employee> readFile(){
        List<Employee> listOfEmployee =new ArrayList<>();
       try {
           FileInputStream fis = new FileInputStream("nhanvien.txt");
           ObjectInputStream ois = new ObjectInputStream(fis);
           listOfEmployee =(List<Employee>) ois.readObject();
           ois.close();
           fis.close();
       }catch(IOException e){
           e.printStackTrace();

        } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return listOfEmployee;
    }
    public static void writeFile(List<Employee> listOfEmployee){
        try{
            FileOutputStream fos=new FileOutputStream("nhanvien.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(listOfEmployee);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
