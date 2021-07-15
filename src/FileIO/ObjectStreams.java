package FileIO;

import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;

public class ObjectStreams {

    static BigDecimal [] preise = {new BigDecimal("19.99"),
            new BigDecimal("499.99"),new BigDecimal("33.99"), };
    static int[] menge = {10,5,2};
    static String [] bez = {"HDD", "MAC BOOK", "RAM"};

    public static void main(String[] args) {

        String file = "artikel.data";
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream(file)))){
           oos.writeObject( Calendar.getInstance());
            for (int i = 0; i < preise.length; i++) {
                oos.writeObject(preise[i]);
                oos.writeInt(menge[i]);
                oos.writeUTF(bez[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
