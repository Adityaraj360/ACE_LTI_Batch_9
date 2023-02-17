import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

class Person1 implements Comparable{


    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Person1) o).getName());
    }
}

public class Testcollect2 {
    public static void main(String[] args){
        Person1 p1 = new Person1(11,"Rajesh");
        Person1 p2 = new Person1(12,"Suraj");
        Person1 p3 = new Person1(13,"Tom");


        //HashSet<Person1> myset = new HashSet<>();
       // LinkedHashSet<Person1> myset = new LinkedHashSet<>();
        TreeSet<Person1> myset = new TreeSet<>();

        myset.add(p2);
        myset.add(p1);
        myset.add(p3);

        System.out.println(myset);


    }
}
