import java.util.ArrayList;
import java.util.ListIterator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Dynamic {
    public static void main(String[] args) {
        
        ArrayList<Person> personList = new ArrayList<>();

        
        personList.add(new Person("Ritesh", 22));
        personList.add(new Person("Balu", 25));
       
        // Iterate it by using ListIterator
        ListIterator<Person> listIterator = personList.listIterator();
        
        // Print the values by using while Loop
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
            System.out.println(person);
        }
    }
}
