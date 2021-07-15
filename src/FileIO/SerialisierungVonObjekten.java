package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
    String vname;
    Integer alter;
    String stadt;
    Person(String n, Integer a, String s){
        this.alter=a;
        this.vname=n;
        this.stadt=s;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vname='").append(vname).append('\'');
        sb.append(", alter=").append(alter);
        sb.append(", stadt='").append(stadt).append('\'');
        sb.append('}');
        return sb.toString();

    }
}

public class SerialisierungVonObjekten {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        List<Person> people = new ArrayList<>( );
        people.add(new Person("Rudi", 33, "EF"));
        people.add(       new Person("Susi", 19, "L"));
        people.add(new Person("Anna Bolika", 99 ,"B"));

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("person.data"))
        )){

            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Wieder Deserialisieren ");
        Thread.sleep(5000);
        System.out.println("Jetzt");
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(new File("person.data"))
        )){
            List<Person> pp = new ArrayList<>();
            pp=(List<Person>) ois.readObject();
            pp.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
