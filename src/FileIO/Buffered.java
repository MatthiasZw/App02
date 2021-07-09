package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Buffered {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br= new BufferedReader(new FileReader("trabattoni.txt"));
        Scanner sc = new Scanner(br)){

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }


        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}
