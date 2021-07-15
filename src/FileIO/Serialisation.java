package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
    String vname;
    Integer alter;
    String stadt;

    Person(String n, Integer a, String s){

    }


}
public class Serialisation {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add( new Person("Rudi", 33, "B"));
        people.add( new Person("Hans", 45, "M"));
        people.add( new Person("Sepp", 44, "G"));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("person.data")))) {
            oos.writeObject(people);

        }catch   (IOException e){
            e.printStackTrace();
        }
        //geht, schreibt datei person.data
        /// nicht mehr mitgekommen, keine ahnung. deserialisierung kommt noch etc
    }
}
