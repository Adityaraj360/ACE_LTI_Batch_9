//Object class --> parent of all java classes


import java.util.Objects;

class Person{


    private int id;
    private String name;

    public Person(int id, String name) {
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

    /*
    public String toString() {
        return this.getName();
    }
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }



}

public class TestObjectClass {

    public static void main(String[] args){
        Person person1 = new Person(11,"Rajesh");
        Person person2 = new Person(11,"Rajesh");
        System.out.println(person1);
        System.out.println(person2);

        //System.out.println("rajesh".equals("rajesh"));

        //System.out.println(person1.equals(person2));
    }
}
