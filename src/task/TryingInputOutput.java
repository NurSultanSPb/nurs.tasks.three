package task;

import java.io.*;

public class TryingInputOutput {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fin = new FileInputStream("C://SomeDir//notes.txt");
            FileOutputStream fos = new FileOutputStream("C://SomeDir//notes_new.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
