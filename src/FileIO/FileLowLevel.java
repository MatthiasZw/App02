package FileIO;

import java.io.*;

public class FileLowLevel {
    public static void main(String[] args)  throws IOException {
        //lesen und schreiben in Strömen
        InputStream in;
        OutputStream out;


        try (FileInputStream fin= new FileInputStream("trabattoni.txt"); //selbstschließender try catch block
            FileOutputStream fout= new FileOutputStream("copytrabattoni.txt"))

        {
            int c;
            while ((c=fin.read())!=-1) {
            fout.write(c);
        }
    } catch (FileNotFoundException ex){
}}}

