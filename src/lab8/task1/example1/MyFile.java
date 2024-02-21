package lab8.task1.example1;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        try {
            File fl = new File ("MyFile.txt");
            fl.createNewFile();
            if(fl.exists()){
                System.out.println("Файл создан!");
                System.out.println("Полный путь: " + fl.getAbsolutePath());
            }
            File fl2 = new File ("D:\\MyFile2.txt");
            fl2.createNewFile();
            if(fl2.exists()){
                System.out.println("Файл 2 создан!");
                System.out.println("Полный путь 2: " + fl2.getAbsolutePath());
            }
            File fl3 = new File ("D:\\Folder1\\Folder2\\Folder3");
            fl3.mkdirs();
            if(fl3.exists()){
                System.out.println("Папки созданы!");
                System.out.println("Полный путь 3: " + fl3.getAbsolutePath());
            }
        }catch(Exception e){
            System.out.println("Ошибка! "+ e);
        }
    }
}
