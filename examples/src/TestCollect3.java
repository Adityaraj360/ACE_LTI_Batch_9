import java.util.*;

class Person2{


    private int id;
    private String name;

    public Person2(int id, String name) {
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
        Person2 person = (Person2) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}

public class TestCollect3 {
    public static void main(String[] args){
        Person2 p1 = new Person2(11,"Rajesh");
        Person2 p2 = new Person2(12,"Suraj");
        Person2 p3 = new Person2(13,"Tom");

        //Hashtable<Integer,Person2> mymap = new Hashtable<>();
        //HashMap<Integer,Person2> mymap = new HashMap<>();
        LinkedHashMap<Integer,Person2> mymap = new LinkedHashMap<>();

        mymap.put(101,p3);
        mymap.put(102,p2);
        mymap.put(103,p1);

        System.out.println(mymap);


    }
}
